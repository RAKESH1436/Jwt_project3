package com.example.Jwt_project3;

import com.example.Jwt_project3.Repo.UserRepository;
import com.example.Jwt_project3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.UUID;

@SpringBootApplication
public class JwtProject3Application implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setId("1");


		user.setEmail("sanjay@gmail.com");
		user.setName("sanjay");
		user.setRole("NOMAL");
		user.setPassword(this.passwordEncoder.encode("abcd"));

		this.userRepository.save(user);
		User user1 = new User();
		user1.setId("2");

		user1.setEmail("rakesh@gmail.com");
		user1.setName("rakesh");
		user1.setRole("NOMAL");
		user1.setPassword(this.passwordEncoder.encode("abcde"));
		this.userRepository.save(user1);



	}

	public static void main(String[] args) {
		SpringApplication.run(JwtProject3Application.class, args);
	}

}
