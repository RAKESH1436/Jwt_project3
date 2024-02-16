package com.example.Jwt_project3.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user = User.builder().username("sanjay").password(passwordEncoder().encode("abc")).roles("ADMIN").build();
        UserDetails user1 = User.builder().username("rakesh").password(passwordEncoder().encode("abcd")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user,user1);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}