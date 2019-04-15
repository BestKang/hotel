package com.hotelmanage.service.vipcustomer;

import com.hotelmanage.pojo.entity.vip.VipCustomer;
import org.apache.ibatis.annotations.Param;

public interface VipService {
    //d登录
    VipCustomer getLogin(String name,String pw);

    //顾客会员注册
    Integer registerVipCustomer(VipCustomer vipCustomer);

    //会员信息修改
    Integer updateInfo(VipCustomer vipCustomer);
}
