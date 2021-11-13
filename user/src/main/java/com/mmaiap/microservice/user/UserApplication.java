package com.mmaiap.microservice.user;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.mmaiap.microservice.user.domain.User;
import com.mmaiap.microservice.user.repositories.UserRepository;

@EnableEurekaClient
@SpringBootApplication
public class UserApplication implements CommandLineRunner {
	
	private UserRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User("Matheus", 27);
		User u2 = new User("Bob", 15);
		User u3 = new User("Maria", 30);

		repo.saveAll(Arrays.asList(u1, u2, u3));

	}

}
