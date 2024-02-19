package com.example.Jwt_project3.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user_table")
public class User {
    @Id()


    private String id;
    private String name;
    private String password;
    private String Email;
    private String role;

}
