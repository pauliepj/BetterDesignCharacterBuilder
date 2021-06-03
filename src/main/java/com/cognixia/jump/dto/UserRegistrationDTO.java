package com.cognixia.jump.dto;

public class UserRegistrationDTO {

	private String userName;
	private String password;
	private boolean isAdmin;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public UserRegistrationDTO(String userName, String password, boolean isAdmin) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	
}
