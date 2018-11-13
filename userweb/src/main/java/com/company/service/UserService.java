package com.company.service;

import com.company.dao.pojo.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserService {
    public String getName(){
        return "HAOHAO";
    }

    public User findById(Integer id){
        User user = new User("haohao",new BigDecimal(8000),new Date());
        user.setId(id);
        return user;
    }

    public List<User> findAll(){
        User user1 = new User(1001,"zhao",new BigDecimal(8000),new Date());
        User user2 = new User(1002,"qian",new BigDecimal(8000),new Date());
        User user3 = new User(1003,"sun",new BigDecimal(8000),new Date());
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
}
