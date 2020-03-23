package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    private TAdminService adminService;

    @RequestMapping("/admin/{id}")
    @ResponseBody
    public TAdmin getAdmin(@PathVariable("id") Integer id){
        TAdmin admin = adminService.getAdminById(id);
        return admin;
    }


}
