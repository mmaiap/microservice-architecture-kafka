package com.mmaiap.microservice.user;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.mmaiap.microservice.user.domain.User;
import com.mmaiap.microservice.user.repositories.UserRepository;

@EnableEurekaClient
@SpringBootApplication
public class UserApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User("Matheus", 27, 0.00);
		User u2 = new User("Pedro", 22, -1.00);
		User u3 = new User("João", 25, -3.00);
		User u4 = new User("Vinicius", 22, 5.00);
		User u5 = new User("Antonio",32 , -9.00);
		User u6 = new User("Julia", 26, 0.00);
		User u7 = new User("Isabelle", 24, 100.00);

		repo.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7));

	}

}
