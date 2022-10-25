package com.example.springjwt;

import com.example.springjwt.domain.Role;
import com.example.springjwt.domain.User;
import com.example.springjwt.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJwtApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner runner(UserService userService){
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser((new User(null, "John Travolta","john","1234",new ArrayList<>())));
			userService.saveUser((new User(null, "austin iqer","austin","1234",new ArrayList<>())));
			userService.saveUser((new User(null, "abdulhakim maha","hakim","1234",new ArrayList<>())));
			userService.saveUser((new User(null, "Jett Korea","jett","1234",new ArrayList<>())));

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("austin", "ROLE_USER");
			userService.addRoleToUser("austin", "ROLE_ADMIN");
			userService.addRoleToUser("jett", "ROLE_USER");
			userService.addRoleToUser("jett", "ROLE_MANAGER");
			userService.addRoleToUser("hakim", "ROLE_USER");
			userService.addRoleToUser("austin", "ROLE_SUPER_ADMIN");
		};
	}

}
