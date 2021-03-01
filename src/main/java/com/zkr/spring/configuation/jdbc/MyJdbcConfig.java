package com.zkr.spring.configuation.jdbc;

public class MyJdbcConfig {
	
	private String username;
	
	private String password;

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

	@Override
	public String toString() {
		return "MyJdbcConfig [username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
}
