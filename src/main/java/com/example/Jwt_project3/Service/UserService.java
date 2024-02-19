package com.example.Jwt_project3.Service;

import com.example.Jwt_project3.Repo.UserRepository;
import com.example.Jwt_project3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
   //private List<User> store=new ArrayList<>();


//    public UserService(){
//

//
//
//
//
//
//
//    }
    public List<User>getUser(){
        return this.userRepository.findAll();
    }


    public User addUser(User user) {
        this.userRepository.save(user);
        return user;
    }
}
