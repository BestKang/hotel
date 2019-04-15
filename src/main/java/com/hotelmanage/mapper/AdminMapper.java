package com.hotelmanage.mapper;

import com.hotelmanage.pojo.entity.admin.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    //登录
    Admin getAdmin(@Param("name") String name, @Param("pw") String pw);

    Admin getadmininfo();

    //列出所有管理员
    List<Admin> listAdmin();

}
