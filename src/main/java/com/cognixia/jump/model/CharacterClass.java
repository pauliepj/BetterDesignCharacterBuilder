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
	
	@Column(name="userId")
	private Integer userId;
	
	@Column(name="characterName")
	private String characterName;
	
	@Column(name="healthPoints")
	private Integer healthPoints;
	
	@Column(name="race")
	private String race;
	
	@Column(name="expPoints")
	private Integer expPoints;
	
	@Column(name="gold")
	private Integer gold;

	public Integer getExpPoints() {
		return expPoints;
	}

	public void setExpPoints(Integer expPoints) {
		this.expPoints = expPoints;
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public Integer getHealthPoints() {
		return healthPoints;
	}

	public void setHealthPoints(Integer healthPoints) {
		this.healthPoints = healthPoints;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public CharacterClass(Integer characterId, Integer userId, String characterName, Integer healthPoints, String race,
			Integer expPoints, Integer gold) {
		super();
		this.characterId = characterId;
		this.userId = userId;
		this.characterName = characterName;
		this.healthPoints = healthPoints;
		this.race = race;
		this.expPoints = expPoints;
		this.gold = gold;
	}

	@Override
	public String toString() {
		return "CharacterClass [characterId=" + characterId + ", userId=" + userId + ", characterName=" + characterName
				+ ", healthPoints=" + healthPoints + ", race=" + race + ", expPoints=" + expPoints + ", gold=" + gold
				+ "]";
	}

	
	
	
}
