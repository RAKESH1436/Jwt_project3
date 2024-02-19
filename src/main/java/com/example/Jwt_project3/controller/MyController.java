package com.example.Jwt_project3.controller;

import com.example.Jwt_project3.Service.UserService;
import com.example.Jwt_project3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private UserService userService;
   // @PreAuthorize("hasRole('ADMIN')")
   @GetMapping("/user")
    public List<User> Home(){

        return userService.getUser();
    }
    @PostMapping("/add")
    public User getUsre(@RequestBody User user){
        return userService.addUser(user);

    }
    @GetMapping("/current/user")
    public String getLoggenInUser(Principal principal){
       return principal.getName();

    }

}
