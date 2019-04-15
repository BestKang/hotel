package com.hotelmanage.controller.logincontroller;

import com.hotelmanage.common.util.FastJsonUtil;
import com.hotelmanage.common.util.ResultBuilder;
import com.hotelmanage.pojo.dto.PageContentDTO;
import com.hotelmanage.pojo.dto.admin.AdminDTO;
import com.hotelmanage.pojo.entity.admin.Admin;
import com.hotelmanage.pojo.entity.vip.VipCustomer;
import com.hotelmanage.service.admin.AdminService;
import com.hotelmanage.service.vipcustomer.VipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("LOGIN")
public class AdminLoginController {
    private static final Logger logger = LoggerFactory.getLogger(AdminLoginController.class);

    @Autowired
    private AdminService adminService;
    @Autowired
    private VipService vipService;

    //@ResponseBody
    @RequestMapping(value = "/adminLogin")
    public String adminLogin(@RequestParam ("name")String name,@RequestParam ("pw") String pw,Model model,HttpServletRequest request){                                   //根据警员id查找警员名下接受的任务
        logger.info("获取name={}的详情", name);
        logger.info("获取pw={}的详情", pw);
        Admin admin = adminService.getAdmin(name,pw);
        if (admin!=null){
            System.out.println("这是成功登录的部分");
            model.addAttribute("admin",admin);                                         //存入登录的用户信息
            HttpSession session = request.getSession();
            session.setAttribute("userinfo",admin);
            return "pages/index";
        }
        else {
            System.out.println("这是登录失败的部分");
            return "pages/login";
        }
    }

    @RequestMapping(value = "/adminlogout")
    public String adminlogout(HttpServletRequest request) {
        String info = "登出操作";
        logger.info(info);
        HttpSession session = request.getSession();

        // 将用户信息从session中删除
        session.removeAttribute("userinfo");

        Object userInfo = session.getAttribute("userinfo");
        if (userInfo == null) {
            info = "登出成功";
        } else {
            info = "登出失败";
        }
        logger.info(info);

        return info;

    }


    @RequestMapping(value = "/vipLogin")
    public String vipLogin(@RequestParam ("name")String name,@RequestParam ("pw") String pw,Model model,HttpServletRequest request){                                   //根据警员id查找警员名下接受的任务
        logger.info("获取name={}的详情", name);
        logger.info("获取pw={}的详情", pw);
        VipCustomer vipCustomer = vipService.getLogin(name,pw);
        if (vipCustomer!=null){
            System.out.println("这是成功登录的部分");
            model.addAttribute("vipCustomer",vipCustomer);                                         //存入登录的用户信息
            HttpSession session = request.getSession();
            session.setAttribute("userinfo",vipCustomer);
            return "pages/index";
        }
        else {
            System.out.println("这是登录失败的部分");
            return "pages/login";
        }
    }

    @RequestMapping(value = "/viplogout")
    public String viplogout(HttpServletRequest request) {
        String info = "登出操作";
        logger.info(info);
        HttpSession session = request.getSession();

        // 将用户信息从session中删除
        session.removeAttribute("userinfo");

        Object userInfo = session.getAttribute("userinfo");
        if (userInfo == null) {
            info = "登出成功";
        } else {
            info = "登出失败";
        }
        logger.info(info);

        return info;

    }

    @ResponseBody
    @RequestMapping(value = "/listcop")
    public List<Admin> listCopStaff() {                                   //获取警员列表
        return adminService.listAdmin();
    }
}
