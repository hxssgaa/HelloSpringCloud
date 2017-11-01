package com.hxdavid.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        Long[] x = new Long[1000];
        for (int i = 0; i < 100; i++) {
            x[i] = (long) i;
        }
        return "Hello World!" + x[88];
    }
}
