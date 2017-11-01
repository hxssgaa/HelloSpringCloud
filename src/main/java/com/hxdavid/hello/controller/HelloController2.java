package com.hxdavid.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController2 {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello2";
    }
}
