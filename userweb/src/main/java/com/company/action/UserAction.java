package com.company.action;

import com.company.dao.pojo.User;
import com.company.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserAction {
    @Autowired
    UserService userService;

    @RequestMapping("hello.do")
    @ResponseBody
    public String hello(){
        return userService.getName();
    }

    @RequestMapping("findbyid.do")
    public @ResponseBody User findById(@RequestParam Integer id){
        return userService.findById(id);
    }

    @RequestMapping("findall.do")
    public @ResponseBody List<User> findAll(){
        return userService.findAll();
    }

}
