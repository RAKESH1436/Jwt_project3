package com.example.Jwt_project3.config;

import com.example.Jwt_project3.sercurity.JwtAuthEntryPoint;
import com.example.Jwt_project3.sercurity.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    private JwtAuthEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .authorizeRequests().requestMatchers("/public/**").hasRole("NOMAL")
                .requestMatchers("/home/**").hasRole("/ADMIN")
                .requestMatchers("/home/**").authenticated().requestMatchers("/auth/login").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
    @Bean
    public DaoAuthenticationProvider daoAutheProvider(){
        DaoAuthenticationProvider dodaoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAutheProvider().setUserDetailsService(userDetailsService);
        daoAutheProvider().setPasswordEncoder(passwordEncoder);
        return dodaoAuthenticationProvider;


    }


}