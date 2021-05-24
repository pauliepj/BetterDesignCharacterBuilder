package com.cognixia.jump.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Attributes;
import com.cognixia.jump.repository.AttributeRepository;

@CrossOrigin
@RestController
public class AttributesController {
	
	@Autowired
	AttributeRepository aRepo;
	
//CRUD METHODS
//------------------------CREATE-------------------------
	
	@PostMapping(value="/attributes")
	public String postAttributes(@RequestBody Attributes attributes) {
		aRepo.save(attributes);
		return "Attributes saved successfully";
	}

//------------------------READ---------------------------
	
	@GetMapping(value="/attributes/{characterId")
	public Attributes getAttributes(@PathVariable String characterId) {
		return aRepo.findByCharacterId(Integer.parseInt(characterId));
	}
	
//------------------------UPDATE--------------------------
	@PutMapping(value="/attributes")
	public String updateAttributes(@RequestBody Attributes attributes) {
		aRepo.save(attributes);
		return "Attributes saved successfully";
	}
	
	@PatchMapping(value="/attributes/{characterId}/intelligence/{value}")
	public void updateIntelligence(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setIntelligence(Integer.parseInt(value));
	}
	
	@PatchMapping(value="/attributes/{characterId}/charisma/{value}")
	public void updateCharisma(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setCharisma(Integer.parseInt(value));
	}
	
	@PatchMapping(value="/attributes/{characterId}/strength/{value}")
	public void updateStrength(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setStrength(Integer.parseInt(value));
	}
	
	@PatchMapping(value="/attributes/{characterId}/wisdom/{value}")
	public void updateWisdom(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setWisdom(Integer.parseInt(value));
	}
	
	@PatchMapping(value="/attributes/{characterId}/constitution/{value}")
	public void updateConstitution(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setConstitution(Integer.parseInt(value));
	}
	
	@PatchMapping(value="/attributes/{characterId}/dexterity/{value}")
	public void updateDexterity(@PathVariable String characterId, @PathVariable String value) {
		aRepo.findByCharacterId(Integer.parseInt(characterId)).setDexterity(Integer.parseInt(value));
	}
	
//-----------------------DELETE------------------------
	//I don't currently see a need to delete the attributes... but maybe there is? to be seen later on I guess
	
}
