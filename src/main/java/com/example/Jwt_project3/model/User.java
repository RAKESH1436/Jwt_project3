package com.example.Jwt_project3.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class User {
    private String userid;
    private String name;
    private String Email;

}
