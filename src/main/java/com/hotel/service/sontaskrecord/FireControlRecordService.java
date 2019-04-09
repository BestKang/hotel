package com.hotel.service.sontaskrecord;

import com.hotel.pojo.dto.sontaskrecord.FireControlRecordDTO;
import com.hotel.pojo.entity.sontaskrecord.FireControlRecord;

public interface FireControlRecordService {
    Integer insertFireControlRecord(FireControlRecord fireControlRecord);
    FireControlRecord getFireControlRecord( String  sonTaskId);
    Integer deleteFireControlRecord( String sonTaskId);
    Integer countFireControlRecord(FireControlRecordDTO fireControlRecordDTO);
}
