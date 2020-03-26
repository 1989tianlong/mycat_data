package com.data.cat.mycatdata.controller;

import com.data.cat.mycatdata.domain.User;
import com.data.cat.mycatdata.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/save")
    public String save(User user) {
        userMapper.insert(user);
        return "success";
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userMapper.selectAll();
    }

}
