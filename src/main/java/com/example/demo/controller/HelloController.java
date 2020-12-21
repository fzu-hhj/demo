package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public Map<String, Object> hello(){
        List<Map<String, Object>> users = jdbcTemplate.queryForList("select * from user");
        return users.get(0);
        //return "Hello World";
    }
    @RequestMapping("/tt")
    public String tt(){
        return "{'message1': 'SpringBoot你大爷','message2','SpringBoot你大爷2'}";
    }

    @RequestMapping("/say")
    public ModelAndView say(){
        ModelAndView mav=new ModelAndView();
        mav.addObject("message", "SpringBoot 大爷你好！");
        mav.setViewName("helloWorld");
        return mav;
    }
}
