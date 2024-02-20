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
public class JwtProject3Application  {
	//@Autowired
	//private UserRepository userRepository;
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	@Override
//	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setId("1");
//		user.setEmail("sanjay@gmail.com");
//		user.setName("sanjay");
//		user.setRole("NOMAL");
//		user.setPassword(this.passwordEncoder.encode("abcd"));
//
//		this.userRepository.save(user);
//		User user1 = new User();
//		user1.setId("2");
//		user1.setEmail("rakesh@gmail.com");
//		user1.setName("rakesh");
//		user1.setRole("NOMAL");
//		user1.setPassword(this.passwordEncoder.encode("abcde"));
//		this.userRepository.save(user1);
//		User user2 = new User();
//		user2.setId("3");
//		user2.setEmail("rak@gmail.com");
//		user2.setName("rak");
//		user2.setRole("ADMIN");
//		user2.setPassword(this.passwordEncoder.encode("11111"));
//		this.userRepository.save(user2);
//		User user3 = new User();
//		user3.setId("4");
//		user3.setEmail("sanju@gmail.com");
//		user3.setName("sanju");
//		user3.setRole("ADMIN");
//		user3.setPassword(this.passwordEncoder.encode("12345"));
//		this.userRepository.save(user3);
//
//
//
//	}

	public static void main(String[] args) {
		SpringApplication.run(JwtProject3Application.class, args);
	}

}
