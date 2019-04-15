package com.hotelmanage.service.admin;

import com.hotelmanage.pojo.entity.admin.Admin;

import java.util.List;

public interface AdminService {
    Admin getAdmin(String name,String pw);

    boolean isLogin(String username,String password);

    List<Admin> listAdmin();
}

