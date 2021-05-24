package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.CharacterClass;
import com.cognixia.jump.repository.AttributeRepository;
import com.cognixia.jump.repository.CharacterRepository;
import com.cognixia.jump.repository.UserRepository;

@CrossOrigin
@RestController
public class CharacterController {

//----------------------------REPOSITORIES------------------------
	@Autowired
	CharacterRepository cRepo;

	@Autowired
	AttributeRepository aRepo;

	@Autowired
	UserRepository uRepo;
	
	
	// CRUD METHODS
//--------------------------------CREATE------------------------
	@PostMapping(value = "/character")
	public CharacterClass createCharacter(@RequestBody CharacterClass character) {
		character.setExpPoints(0);
		character.setGold(0);

		// 3 health for every point of constitution or strength
		Integer initHealth = 10 + ((aRepo.findByCharacterId(character.getCharacterId()).getConstitution()
				+ aRepo.findByCharacterId(character.getCharacterId()).getStrength()) *3);
		character.setHealthPoints(initHealth);
		return cRepo.save(character);
	}
	
//-------------------------------READ---------------------------
	@GetMapping(value="/character/{userId}/{characterId}")
	public CharacterClass getCharacterById(@PathVariable String userId, @PathVariable String characterId) {
	if(cRepo.findByUserId(Integer.parseInt(userId)).contains(cRepo.findByCharacterId(Integer.parseInt(characterId)))){
		return cRepo.findByCharacterId(Integer.parseInt(characterId));
		}
	return null;
	}

//------------------------------UPDATE---------------------------
	
	@PutMapping(value="/character")
	public CharacterClass updateCharacter(@RequestBody CharacterClass character) {
		character.setExpPoints(0);
		character.setGold(0);

		// 3 health for every point of constitution or strength
		Integer initHealth = 10 + (aRepo.findByCharacterId(character.getCharacterId()).getConstitution()
				+ aRepo.findByCharacterId(character.getCharacterId()).getStrength()) * 3;
		character.setHealthPoints(initHealth);
		return cRepo.save(character);
	}
	
	@PatchMapping(value="/character/{characterId}/{userId}/gold")
	public void updateGold(@PathVariable String characterId, @PathVariable String userId, @RequestBody String gold) {
		CharacterClass ch = cRepo.findByCharacterId(Integer.parseInt(characterId));
		if(uRepo.isAdmin(Integer.parseInt(userId))) {
			ch.setGold(Integer.parseInt(gold));
			cRepo.save(ch);
		} else {
			ch.setGold(0);
			cRepo.save(ch);
		}
	}
	
	@PatchMapping(value="/character/{characterId}/{userId}/exp")
	public void updateExp(@PathVariable String characterId, @PathVariable String userId, @RequestBody String exp) {
		CharacterClass ch = cRepo.findByCharacterId(Integer.parseInt(characterId));
		if(uRepo.isAdmin(Integer.parseInt(userId))) {
			ch.setExpPoints(Integer.parseInt(exp));
			cRepo.save(ch);
		} else {
			ch.setExpPoints(0);
			cRepo.save(ch);
		}
	}
	
	
//------------------------------DELETE-------------------------------------
	@DeleteMapping(value="/character/{userId}/{characterId}")
	@ResponseBody
	public String deleteCharacter(@PathVariable String userId, @PathVariable String characterId) {
		if(cRepo.findByUserId(Integer.parseInt(userId)).contains(cRepo.findByCharacterId(Integer.parseInt(characterId)))){
			cRepo.deleteById(Integer.parseInt(userId));
			return "Successfully deleted character with ID" + characterId;
		} else {
			return "Could not delete character with ID" + characterId;
		}
	}
	
	
	
}
