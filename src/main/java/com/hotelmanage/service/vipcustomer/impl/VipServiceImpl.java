package com.hotelmanage.service.vipcustomer.impl;

import com.hotelmanage.mapper.VipMapper;
import com.hotelmanage.pojo.entity.vip.VipCustomer;
import com.hotelmanage.service.vipcustomer.VipService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;
    //d登录
    @Override
    public VipCustomer getLogin(String name, String pw){
        return vipMapper.getLogin(name,pw);
    }

    //顾客会员注册
    public Integer registerVipCustomer(VipCustomer vipCustomer){
        return vipMapper.registerVipCustomer(vipCustomer);

    }

    //会员信息修改
    public Integer updateInfo(VipCustomer vipCustomer){
        return vipMapper.updateInfo(vipCustomer);
    }
}
