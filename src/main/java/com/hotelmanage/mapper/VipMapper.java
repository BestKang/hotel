package com.hotelmanage.mapper;
import com.hotelmanage.pojo.entity.vip.VipCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface VipMapper {
    //d登录
    VipCustomer getLogin(@Param("name") String name, @Param("pw") String pw);

    //顾客会员注册
    Integer registerVipCustomer(VipCustomer vipCustomer);

    //会员信息修改
    Integer updateInfo(VipCustomer vipCustomer);

    //会员登出
    //Integer logout();
}
