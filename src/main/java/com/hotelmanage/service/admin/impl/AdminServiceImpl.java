package com.hotelmanage.service.admin.impl;

import com.hotelmanage.pojo.entity.admin.Admin;
import com.hotelmanage.service.admin.AdminService;
import com.hotelmanage.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin getAdmin(String name,String pw){
        System.out.println(name+pw);
        Admin admin = adminMapper.getAdmin(name,pw);
        //Admin admin = adminMapper.getAdmin(name,pw);
        if (admin==null)
        return null;
        else return admin;
    }

    @Override
    public boolean isLogin(String username,String password){

        return true;
    }

    @Override
    public List<Admin> listAdmin(){
        return adminMapper.listAdmin();
    }
}
