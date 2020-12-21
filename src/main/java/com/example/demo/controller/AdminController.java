package com.example.demo.controller;

import com.example.demo.bean.Admin;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.mapper.AdminMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
//    @Autowired
//    AdminMapper adminMapper;
//    @RequestMapping("/admin/{id}")
//    public Admin getAdmin(@PathVariable("id") Integer id){
//        return adminMapper.getAdminById(id);
//    }

    @Autowired
    AdminMapper2 adminMapper2;
    @RequestMapping("/admin2/{id}")
    public Admin getAdmin2(@PathVariable("id") Integer id){
        return adminMapper2.selectByPrimaryKey(id);
    }

}
