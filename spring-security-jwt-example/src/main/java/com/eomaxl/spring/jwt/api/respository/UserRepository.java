package com.eomaxl.spring.jwt.api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eomaxl.spring.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>
{

	User findByUsername(String username);
	
}
