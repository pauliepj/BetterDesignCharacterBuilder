package com.cognixia.jump.service;

import com.cognixia.jump.dto.UserRegistrationDTO;
import com.cognixia.jump.model.User;

public interface UserService {
	
	User save(UserRegistrationDTO registrationDto);
	
	
}
