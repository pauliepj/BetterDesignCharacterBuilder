package com.cognixia.jump.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.jump.model.Attributes;

@Repository
public interface AttributeRepository extends JpaRepository<Attributes, Integer>{

	Attributes findByCharacterId(Integer characterId);
	
	
	
}
