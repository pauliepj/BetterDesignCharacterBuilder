package com.cognixia.jump.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;
import com.cognixia.jump.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	@Autowired
	private UserRepository userRepo;
	
	
	
	public UserServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}



	@Override
	public User save(UserRegistrationDTO registrationDto) {
		User user = new User(registrationDto.getUserName(), registrationDto.getPassword(), registrationDto.isAdmin());
		return userRepo.save(user);
	}

	
	
}
