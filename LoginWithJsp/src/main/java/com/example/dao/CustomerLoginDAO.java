package com.example.dao;

import com.example.model.CustomerLogin;

public interface CustomerLoginDAO {
	
	public CustomerLogin getCustomerByLoginName(String loginName);

}
