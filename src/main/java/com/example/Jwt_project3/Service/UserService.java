package com.example.Jwt_project3.Service;

import com.example.Jwt_project3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();
    public UserService(){

        store.add(new User(UUID.randomUUID().toString(),"sanjaygupta","sanjay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"rakesh","rakesh@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"sanjaykumar","rakesh14@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"rahul","rahul@gmail.com"));





    }
    public List<User>getUser(){
        return this.store;
    }


}
