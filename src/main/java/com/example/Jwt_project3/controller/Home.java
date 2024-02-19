package com.example.Jwt_project3.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class Home {
    @GetMapping("/homepage")
    public String HomePage(){

        return "thi is home page";

    }
    @GetMapping("/login")
    public String login(){
        return "thi is home login";

    }
    @GetMapping("/register")
    public String register(){
        return "thi is resiter";

    }
}
