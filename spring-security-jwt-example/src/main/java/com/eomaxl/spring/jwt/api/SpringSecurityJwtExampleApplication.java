package com.eomaxl.spring.jwt.api;

import com.eomaxl.spring.jwt.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
	
	@Autowired
	private com.eomaxl.spring.jwt.api.respository.UserRepository repository;

	@PostConstruct
	public void initUsers() {
		List<User> users =Stream.of(
				new User(101,"user1","pass1","abc1@gmail.com"),
				new User(102,"user2","pass2","abc2@gmail.com"),
				new User(103,"user3","pass3","abc3@gmail.com")
				).collect(Collectors.toList());
		repository.saveAll(users);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
	}

}
