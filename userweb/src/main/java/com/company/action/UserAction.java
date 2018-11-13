package com.company.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAction {
    @RequestMapping("hello.do")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
    @RequestMapping("test.do")
    public String test(){
        return "test";
    }

}
