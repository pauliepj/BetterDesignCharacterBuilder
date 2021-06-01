package com.cognixia.jump.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.CharacterClass;
import com.cognixia.jump.model.User;
import com.cognixia.jump.repository.UserRepository;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;
	//CRUD METHODS
//------------------------CREATE---------------------
	@CrossOrigin
	@PostMapping(value="/user")
	public void addUser(@RequestBody User user) {
		userRepo.save(user);
	}

//------------------------READ------------------------
	@GetMapping(value="/character")
	public List<User> getAllCharacters(){
		return userRepo.findAll();
		
	}
	
	@GetMapping(value="/user/{userName}")
	public User findByUsername(@PathVariable String userName)
	{
		return userRepo.findUsersByUserName(userName);
	}
	
	@GetMapping("/user/id/{id}")
	public Optional<User> findUserById(@PathVariable String id)
	{
		 return userRepo.findById(Integer.parseInt(id));
	}
	
	@GetMapping(value="/user/{userId}/admin/")
	public boolean isAdmin(@PathVariable String userId) {
		if(userRepo.isAdmin(Integer.parseInt(userId))) {
			return true;
		}
		return false;
	}

//----------------------UPDATE---------------------
	@PutMapping(value="/user")
	public User updateUser(@RequestBody User user)
	{
		//adds new info into a current user ID from json
		return userRepo.save(user);		
	}

//-----------------------DELETE--------------------
	//again, I don't think we need to delete users. maybe there could be a method deleting users if their account is
	//inactive for a while or something

	
}
