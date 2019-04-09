package com.hotel.mapper.taskinfo;

import com.hotel.pojo.dto.copstaff.CopInfoDTO;
import com.hotel.pojo.entity.copstaff.CopInfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
@Mapper
public interface CopStaffInfoMapper {
    Integer createCopStaffInfo(CopInfoPO copInfoPO);
    List<CopInfoPO> listCopStaffInfo(CopInfoDTO copInfoDTO);
    CopInfoPO getCopStaffInfo(@Param("copId") String copId);
    Integer deleteCopStaffInfo(@Param("copId") String copId);
    Integer batchUpdateFinishStatus(@Param("copIds") List<String> copIds, @Param("finishStatus") String finishStatus);
    Integer updateCopStaffInfo(CopInfoPO copInfoPO);
    Integer countCopStaffInfo(CopInfoDTO copInfoDTO);
    List<CopInfoPO> listCopStaff();
}
