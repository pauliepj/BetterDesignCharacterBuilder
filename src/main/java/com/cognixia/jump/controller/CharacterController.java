package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.CharacterClass;
import com.cognixia.jump.repository.AttributeRepository;
import com.cognixia.jump.repository.CharacterRepository;


@CrossOrigin
@RestController
public class CharacterController {

	@Autowired
	CharacterRepository cRepo;
	
	@Autowired 
	AttributeRepository aRepo;
	
	//CRUD METHODS
//--------------------------------CREATE------------------------
	@PostMapping(value="/character")
	public CharacterClass createCharacter(@RequestBody CharacterClass character) {
		character.setExpPoints(0);
		character.setGold(0);
		
		//3 health for every point of constitution or strength
		Integer initHealth = 10 + (aRepo.findByCharacterId(character.getCharacterId()).getConstitution() + aRepo.findByCharacterId(character.getCharacterId()).getStrength()) * 3;
		character.setHealthPoints(initHealth);
		return cRepo.save(character);
	}
}
