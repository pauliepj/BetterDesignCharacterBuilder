package com.cognixia.jump.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Table(name="Attributes")
@Entity
public class Attributes {

	@Column(name="characterId")
	private Integer characterId;
	@Column(name="charisma")
	private Integer charisma;
	@Column(name="chaPointCost")
	private Integer chaPointCost;
	@Column(name="strength")
	private Integer strength;
	@Column(name="strPointCost")
	private Integer strPointCost;
	@Column(name="wisdom")
	private Integer wisdom;
	@Column(name="wisPointCost")
	private Integer wisPointCost;
	@Column(name="constitution")
	private Integer constitution;
	@Column(name="conPointCost")
	private Integer conPointCost;
	@Column(name="intelligence")
	private Integer intelligence;
	@Column(name="intPointCost")
	private Integer intPointCost;
	@Column(name="dexterity")
	private Integer dexterity;
	@Column(name="dexPointCost")
	private Integer dexPointCost;
	
	public Integer getCharacterId() {
		return characterId;
	}
	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
	public Integer getCharisma() {
		return charisma;
	}
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
	}
	
	
	
	public Integer getChaPointCost() {
		return chaPointCost;
	}
	public void setChaPointCost(Integer chaPointCost) {
		this.chaPointCost = chaPointCost;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getStrPointCost() {
		return strPointCost;
	}
	public void setStrPointCost(Integer strPointCost) {
		this.strPointCost = strPointCost;
	}
	public Integer getWisdom() {
		return wisdom;
	}
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
	}
	public Integer getWisPointCost() {
		return wisPointCost;
	}
	public void setWisPointCost(Integer wisPointCost) {
		this.wisPointCost = wisPointCost;
	}
	public Integer getConstitution() {
		return constitution;
	}
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
	}
	public Integer getConPointCost() {
		return conPointCost;
	}
	public void setConPointCost(Integer conPointCost) {
		this.conPointCost = conPointCost;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public Integer getIntPointCost() {
		return intPointCost;
	}
	public void setIntPointCost(Integer intPointCost) {
		this.intPointCost = intPointCost;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getDexPointCost() {
		return dexPointCost;
	}
	public void setDexPointCost(Integer dexPointCost) {
		this.dexPointCost = dexPointCost;
	}
	public Attributes(Integer characterId, Integer charisma, Integer chaPointCost, Integer strength,
			Integer strPointCost, Integer wisdom, Integer wisPointCost, Integer constitution, Integer conPointCost,
			Integer intelligence, Integer intPointCost, Integer dexterity, Integer dexPointCost) {
		super();
		this.characterId = characterId;
		this.charisma = charisma;
		this.chaPointCost = chaPointCost;
		this.strength = strength;
		this.strPointCost = strPointCost;
		this.wisdom = wisdom;
		this.wisPointCost = wisPointCost;
		this.constitution = constitution;
		this.conPointCost = conPointCost;
		this.intelligence = intelligence;
		this.intPointCost = intPointCost;
		this.dexterity = dexterity;
		this.dexPointCost = dexPointCost;
	}
	@Override
	public String toString() {
		return "Attributes [characterId=" + characterId + ", charisma=" + charisma + ", chaPointCost=" + chaPointCost
				+ ", strength=" + strength + ", strPointCost=" + strPointCost + ", wisdom=" + wisdom + ", wisPointCost="
				+ wisPointCost + ", constitution=" + constitution + ", conPointCost=" + conPointCost + ", intelligence="
				+ intelligence + ", intPointCost=" + intPointCost + ", dexterity=" + dexterity + ", dexPointCost="
				+ dexPointCost + "]";
	}

	
}
