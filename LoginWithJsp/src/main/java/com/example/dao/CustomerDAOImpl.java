package com.example.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.model.CustomerLogin;

public class CustomerDAOImpl implements CustomerLoginDAO {

	public CustomerLogin getCustomerByLoginName(String loginName) {
		
		Map<String,String> customerLoginCredentials= new HashMap();
		customerLoginCredentials.put("tom", "tom123");
		customerLoginCredentials.put("harry", "harry123");
		customerLoginCredentials.put("garry", "garry123");
		customerLoginCredentials.put("monica", "monica123");
		// TODO Auto-generated method stub
		
		CustomerLogin customerLogin= new CustomerLogin();
		customerLogin.setLoginName(loginName);
		customerLogin.setPassword(customerLoginCredentials.get(loginName));
		
		return customerLogin;
	}

}
