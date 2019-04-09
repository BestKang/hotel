package com.hotel.service.task;

import com.hotel.pojo.dto.PageContentDTO;
import com.hotel.pojo.dto.taskinfo.TaskInfoDTO;
import com.hotel.pojo.entity.taskinfo.TaskInfoPO;

public interface MainTaskInfoService {
    Integer createMainTaskInfo(TaskInfoPO TaskInfoPO);

    Integer deleteMainTaskInfo(String taskId);

    Integer updateMainTaskInfo(TaskInfoPO TaskInfoPO);

    TaskInfoPO getMainTaskInfo(String taskId);

    PageContentDTO listMainTaskInfo(TaskInfoDTO pageableDTO);

    Integer countMainTask(TaskInfoDTO MainTaskDTO);
}
