package com.cognixia.jump.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognixia.jump.dto.UserRegistrationDTO;
import com.cognixia.jump.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDTO registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
}
