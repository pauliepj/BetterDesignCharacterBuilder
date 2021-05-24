package com.cognixia.jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Characters")
@Entity
public class CharacterClass {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer characterId;
	
	@Column(name="characterName")
	private String characterName;
	
	
	
}
