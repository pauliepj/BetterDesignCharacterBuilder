package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.jump.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findAll();
	
	User findUsersByUserName(String userName);
	User findUserByPassword(String password);
	
	@Query(value = "SELECT admin FROM user WHERE userId = :userId", nativeQuery = true)
	boolean isAdmin(Integer userId);
	
	
	
}
