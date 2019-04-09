package com.hotel.mapper.taskinfo;

import com.hotel.pojo.dto.sontaskrecord.FireControlRecordDTO;
import com.hotel.pojo.entity.sontaskrecord.FireControlRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FireControlRecordMapper {
    Integer insertFireControlRecord(FireControlRecord fireControlRecord);
    FireControlRecord getFireControlRecord(@Param("sonTaskId") String  sonTaskId);
    Integer deleteFireControlRecord(@Param("sonTaskId") String sonTaskId);
    Integer countFireControlRecord(FireControlRecordDTO fireControlRecordDTO);
}
