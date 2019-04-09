package com.hotel.controller.taskmanagent.sontask;

import com.alibaba.fastjson.JSON;
import com.hotel.common.util.FastJsonUtil;
import com.hotel.common.util.ResultBuilder;
import com.hotel.pojo.dto.PageContentDTO;
import com.hotel.pojo.dto.copstaff.CopInfoDTO;
import com.hotel.pojo.dto.taskinfo.SonTaskDTO;
import com.hotel.pojo.entity.copstaff.CopInfoPO;
import com.hotel.pojo.entity.taskinfo.SonTaskPO;
import com.hotel.pojo.entity.taskinfo.TaskInfoPO;
import com.hotel.service.copstaff.CopStaffInfoService;
import com.hotel.service.task.MainTaskInfoService;
import com.hotel.service.task.SonTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("taskmanagement/sontask")
public class SonTaskInfoController {
    private static final Logger logger = LoggerFactory.getLogger(SonTaskInfoController.class);
    @Autowired
    private SonTaskService sonTaskService;

    @Autowired
    private MainTaskInfoService mainTaskInfoService;

    @Autowired
    private CopStaffInfoService copStaffInfoService;

    @ResponseBody
    @RequestMapping(value = "/allocatesontask", method = RequestMethod.POST)
    @Transactional
    public String createSonTask(@RequestBody String payload) {
        logger.info("分配子任务， 请求参数：{}", payload);
        SonTaskPO sonTask = FastJsonUtil.toBean(payload, SonTaskPO.class);
        CopInfoDTO listTaskQueryParam = new CopInfoDTO();
        List<CopInfoPO> taskInfoPOList = copStaffInfoService.listCopStaff(listTaskQueryParam);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式

        for (int i=0;i<taskInfoPOList.size();i++){
            sonTask.setCopId(taskInfoPOList.get(i).getCopId());
            sonTask.setCopName(taskInfoPOList.get(i).getCopName());
            sonTask.setPlace(taskInfoPOList.get(i).getManageArea());
            if (sonTask.getTaskDetail().equals("每日一次")){
             sonTask.setDelayDeadline(getDays(new Date(),sonTask.getDeadline()));
            }
            Integer resultColumn = sonTaskService.createSonTask(sonTask);
        }
        return ResultBuilder.buildSuccess("创建子任务成功");
        /*if (resultColumn != null) {
            TaskInfoPO taskInfoPO = new TaskInfoPO();
            taskInfoPO.setTaskId(sonTask.getTaskId());
            taskInfoPO.setAllocateStatus(taskInfoPO.getAllocateStatus()+1);
            Integer setAllocateResult = mainTaskInfoService.updateMainTaskInfo(taskInfoPO);
            if (setAllocateResult != null) {
                return ResultBuilder.buildSuccess("创建子任务成功");
            }
            return ResultBuilder.buildError("修改主任务分配状态失败");
        } else {
            return ResultBuilder.buildError("创建子任务失败");
        }*/
    }

    @ResponseBody
    @RequestMapping(value = "/listsontask", method = RequestMethod.POST)
    public String listSonTask(@RequestBody String payload) {
        logger.info("获取子任务列表， 请求参数：{}", payload);
        SonTaskDTO listTaskQueryParam = FastJsonUtil.toBean(payload, SonTaskDTO.class);
        PageContentDTO taskList = sonTaskService.listSonTask(listTaskQueryParam);
        return ResultBuilder.buildSuccess(taskList);
    }

    @RequestMapping(value = "/list/{task_id}.html", method = RequestMethod.GET)
    public String listSonTaskPage(@PathVariable("task_id") String taskId,Model model) {
        model.addAttribute("task_id",taskId);
        return "pages/task/sontask/list";
    }

    @ResponseBody
    @RequestMapping(value = "/listallsontask", method = RequestMethod.POST)
    public String listAllSonTask(@RequestBody String payload) {                                                       //获取所有子任务，放入list
        logger.info("获取所有子任务列表， 请求参数：{}", payload);
        SonTaskDTO listTaskQueryParam = FastJsonUtil.toBean(payload, SonTaskDTO.class);
        PageContentDTO taskList = sonTaskService.listAllSonTask(listTaskQueryParam);
        return ResultBuilder.buildSuccess(taskList);
    }

    @RequestMapping(value = "/listall.html", method = RequestMethod.GET)
    public String listAllSonTaskPage() {
        return "pages/task/sontask/listall";
    }


    @ResponseBody
    @RequestMapping(value = "/deletesontask", method = RequestMethod.POST)
    public String deleteSonTask(@RequestBody String payload) {
        logger.info("删除子任务，请求参数：{}", payload);
        String sonTaskId = JSON.parseObject(payload).getString("son_task_id");
        String taskId = JSON.parseObject(payload).getString("task_id");
        Integer resultColumn = sonTaskService.deleteSonTask(sonTaskId);
        if (resultColumn != null) {
            TaskInfoPO taskInfoPO = new TaskInfoPO();
            taskInfoPO.setTaskId(taskId);
            taskInfoPO.setAllocateStatus(taskInfoPO.getAllocateStatus()-1);
            Integer setDeleteResult = mainTaskInfoService.updateMainTaskInfo(taskInfoPO);
            if (setDeleteResult != null) {
                return ResultBuilder.buildSuccess("删除子任务成功");
            }
            return ResultBuilder.buildSuccess("删除子任务更新主任务同步失败");
        } else {
            return ResultBuilder.buildError("删除子任务失败");
        }
    }


    @ResponseBody
    @RequestMapping(value = "/updatesontask", method = RequestMethod.POST)
    public String updateSonTask(@RequestBody String payload) {
        logger.info("更新子任务入参；{}", payload);
        SonTaskPO sonTask = FastJsonUtil.toBean(payload, SonTaskPO.class);
        Integer resultColumn = sonTaskService.updateSonTask(sonTask);
        if (resultColumn != null) {
            return ResultBuilder.buildSuccess("更新子任务成功");
        } else {
            return ResultBuilder.buildError("更新子任务失败");
        }
    }

    @RequestMapping(value = "/allocatesontask/{task_id}.html", method = RequestMethod.GET)
    public String allocateSonTask(@PathVariable("task_id") String taskId, Model model) {
        logger.info("分配任务获取taskId={}的详情", taskId);
        TaskInfoPO taskInfoPO = mainTaskInfoService.getMainTaskInfo(taskId);
        model.addAttribute("mainTask", taskInfoPO);
        return "pages/task/sontask/allocate";
    }


    @RequestMapping(value = "/getsontask/{sonTaskId}.html", method = RequestMethod.GET)
    public String getSonTask(@PathVariable("sonTaskId") String sonTaskId, Model model) {
        logger.info("获取任务获取sonTaskId={}的详情", sonTaskId);
        SonTaskPO sonTaskPO = sonTaskService.getSonTask(sonTaskId);
        TaskInfoPO taskInfoPO = mainTaskInfoService.getMainTaskInfo(sonTaskPO.getTaskId());
        model.addAttribute("sonTask", sonTaskPO);
        model.addAttribute("mainTask", taskInfoPO);
        return "pages/task/sontask/edit";
    }

    public int getDays(Date start, Date end){
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(start);
//日期start 在本年中的第几天
        int day1 = calendar.get(Calendar.DAY_OF_YEAR);

        calendar.setTime(end);
//日期end 在本年中的第几天
        int day2 = calendar.get(Calendar.DAY_OF_YEAR);

        return day2 - day1;
    }
}
