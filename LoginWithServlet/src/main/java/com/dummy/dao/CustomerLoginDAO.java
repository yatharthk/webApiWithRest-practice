package main.java.com.dummy.dao;

import main.java.com.dummy.model.CustomerLogin;

public interface CustomerLoginDAO {
	
	public CustomerLogin getCustomerLoginByLoginName(String loginName);
}
