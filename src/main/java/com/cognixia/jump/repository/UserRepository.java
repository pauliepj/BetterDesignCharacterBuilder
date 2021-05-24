package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.jump.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
	User findUsersByUsername(String userName);
	User findUserByPassword(String password);
	
	@Query(value = "SELECT admin FROM user WHERE userName = :userName", nativeQuery = true)
	boolean isAdmin(String userName);
	
	
	
}
