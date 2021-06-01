package com.cognixia.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognixia.jump.model.CharacterClass;

public interface CharacterRepository extends JpaRepository<CharacterClass, Integer>{
	
	CharacterClass findByCharacterId(Integer characterId);
	
	List<CharacterClass> findByUserId(Integer userId);
	
	List<CharacterClass> findAll();
	
	CharacterClass findByCharacterName(String characterName);
	

}
