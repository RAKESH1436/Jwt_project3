package com.example.Jwt_project3.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String Jwttoken;
    private String username;
}
