package com.example.Jwt_project3.controller;

import com.example.Jwt_project3.Service.UserService;
import com.example.Jwt_project3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private UserService userService;
   @GetMapping("/user")
    public List<User> Home(){

        return userService.getUser();
    }

}
