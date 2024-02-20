package com.example.Jwt_project3.Repo;

import com.example.Jwt_project3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    public Optional<User>findByEmail(String email);

}
