package com.shawn.server.entity.pojo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3702373098552138425L;
	
	private Integer userId;
	private String username;
	private String password;
	private String salt;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
