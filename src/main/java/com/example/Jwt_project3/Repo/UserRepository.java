package com.example.Jwt_project3.Repo;

import com.example.Jwt_project3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
