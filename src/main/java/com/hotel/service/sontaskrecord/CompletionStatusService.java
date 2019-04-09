package com.hotel.service.sontaskrecord;

import com.hotel.pojo.dto.PageContentDTO;
import com.hotel.pojo.dto.taskinfo.SonTaskDTO;

public interface CompletionStatusService {
    Integer countFinishedTask(String copId);                                //根据警员id，返回已完成任务数量
    Integer countUnFinishedTask(String copId);                              //根据警员id，返回未完成任务数量
    Integer countAllFinishedTask();                                         //返回所有完成的任务数量
    Integer countAllUnFinishedTask();                                       //返回所有未完成的任务数量
    PageContentDTO listAllOverdueSonTask (SonTaskDTO pageableDTO);           //返回所有超期未完成的子任务
}
