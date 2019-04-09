package com.hotel.service.copstaff;

import com.hotel.pojo.dto.copstaff.CopInfoDTO;
import com.hotel.pojo.entity.copstaff.CopInfoPO;
import com.hotel.pojo.dto.PageContentDTO;

import java.util.List;


public interface CopStaffInfoService {
    Integer createCopStaffInfo(CopInfoPO copInfoPO);

    Integer deleteCopStaffInfo(String copId);

    Integer updateCopStaffInfo(CopInfoPO copInfoPO);

    CopInfoPO getCopStaffInfo(String copInfoPO);

    PageContentDTO listCopStaffInfo(CopInfoDTO pageableDTO);

    Integer countCopStaff(CopInfoDTO copInfoDTO);

    List<CopInfoPO> listCopStaff(CopInfoDTO pageableDTO);
}
