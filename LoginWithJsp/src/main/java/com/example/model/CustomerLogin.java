package com.example.model;

public class CustomerLogin {

	private String loginName;
	private String password;
	
	public CustomerLogin() {}

	public CustomerLogin(String loginName, String password) {
		super();
		this.loginName = loginName;
		this.password = password;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerLogin [loginName=" + loginName + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
