package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/counter")
    public String inquiryPost() {
        User user = new User();
        user.setName("Post запрос");
        userService.create(user);
        return null;
    }

    @GetMapping("/counter")
    public Integer counter() {
        User user = new User();
        user.setName("Get запрос");
        userService.create(user);
        return userService.getCounter();
    }

    @GetMapping("/report")
    public List<User> getEntity(){
        User user = new User();
        user.setName("Get запрос");
        userService.create(user);
        return userService.getAllUsers();
    }



}
