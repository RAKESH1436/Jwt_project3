package com.example.Jwt_project3.config;

import com.example.Jwt_project3.Repo.UserRepository;
import com.example.Jwt_project3.Service.UserService;
import com.example.Jwt_project3.model.JwtRequest;
import com.example.Jwt_project3.model.JwtResponse;
import com.example.Jwt_project3.model.User;
import com.example.Jwt_project3.sercurity.JwtHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;


//@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private UserService userService;


    @Autowired
    private JwtHelper helper;

    private Logger logger = LoggerFactory.getLogger(AuthController.class);




        @PostMapping("/login")
        public ResponseEntity<JwtResponse> login(@RequestBody JwtRequest request) {

            this.doAuthenticate(request.getEmail(), request.getPassword());


            UserDetails userDetails = userDetailsService.loadUserByUsername(request.getEmail());
            String token = this.helper.generateToken(userDetails);

            JwtResponse response = JwtResponse.builder()
                    .Jwttoken(token)
                    .username(userDetails.getUsername()).build();
            return new ResponseEntity<>(response, HttpStatus.OK);
        }

        private void doAuthenticate(String email, String password) {

            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(email, password);
            try {
                manager.authenticate(authentication);


            } catch (BadCredentialsException e) {
                throw new BadCredentialsException(" Invalid Username or Password  !!");
            }


        }

        @ExceptionHandler(BadCredentialsException.class)
        public String exceptionHandler() {
            return "Credentials Invalid !!";
        }

        @PostMapping("/created-user")
        public User CreateUser(@RequestBody User user){
            return userService.addUser(user);




        }


    }


