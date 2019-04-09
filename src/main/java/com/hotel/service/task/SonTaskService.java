package com.hotel.service.task;

import com.hotel.pojo.dto.PageContentDTO;
import com.hotel.pojo.dto.taskinfo.SonTaskDTO;
import com.hotel.pojo.entity.taskinfo.SonTaskPO;

public interface SonTaskService {
    Integer createSonTask (SonTaskPO sonTaskPO);

    Integer deleteSonTask (String sonTaskId);

    Integer updateSonTask (SonTaskPO sonTaskPO);

    Integer updateSonTaskFinish (SonTaskPO sonTaskPO);

    SonTaskPO getSonTask (String sonTaskId);

    PageContentDTO listSonTask (SonTaskDTO pageableDTO);

    Integer countSonTask(SonTaskDTO SonTaskDTO);

    PageContentDTO listAllSonTask (SonTaskDTO pageableDTO);

    SonTaskPO getSonTaskByCopId (String copId);


}
