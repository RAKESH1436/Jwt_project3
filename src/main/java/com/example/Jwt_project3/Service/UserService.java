package com.example.Jwt_project3.Service;

import com.example.Jwt_project3.Repo.UserRepository;
import com.example.Jwt_project3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;




    public List<User>getUser(){
        return userRepository.findAll();

    }




    public User addUser(User user) {
        user.setId(UUID.randomUUID().toString());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        this.userRepository.save(user);
        return user;
    }
}
