package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.jump.model.CharacterClass;

public interface CharacterRepository extends JpaRepository<CharacterClass, Integer>{
	
	CharacterClass findByCharacterId(Integer characterId);
	
	CharacterClass findByUserId(Integer userId);
	
	CharacterClass findByCharacterName(String characterName);
	

}
