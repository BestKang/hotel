package com.hotel.service.sontaskrecord.impl;

import com.hotel.mapper.taskinfo.FireControlRecordMapper;
import com.hotel.mapper.taskinfo.SonTaskMapper;
import com.hotel.pojo.dto.sontaskrecord.FireControlRecordDTO;
import com.hotel.pojo.entity.sontaskrecord.FireControlRecord;
import com.hotel.service.sontaskrecord.FireControlRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FireControlRecordServiceImpl implements FireControlRecordService {
    @Autowired
    private SonTaskMapper sonTaskMapper;

    @Autowired
    private FireControlRecordMapper fireControlRecordMapper;

    @Override
    public Integer insertFireControlRecord(FireControlRecord fireControlRecord) {
        //fireControlRecord.setFinishStatus(TaskFinishStatusEnum.TODO.name());
        return  fireControlRecordMapper.insertFireControlRecord(fireControlRecord);
    }

    @Override
    public Integer deleteFireControlRecord(String sontaskId) {
        return  fireControlRecordMapper.deleteFireControlRecord(sontaskId);
    }

    @Override
    public FireControlRecord getFireControlRecord(String sonTaskId) {
        return  fireControlRecordMapper.getFireControlRecord(sonTaskId);
    }

    @Override
    public Integer countFireControlRecord(FireControlRecordDTO fireControlRecordDTO) {
        return  fireControlRecordMapper.countFireControlRecord(fireControlRecordDTO);
    }
}
