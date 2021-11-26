package main.java.com.dummy.dao;

import java.util.HashMap;
import java.util.Map;

import main.java.com.dummy.model.CustomerLogin;

public class CustomerLoginDAOImpl implements CustomerLoginDAO {

	@Override
	public CustomerLogin getCustomerLoginByLoginName(String loginName) {
		// TODO Auto-generated method stub
		Map<String,String> customerCredentials = new HashMap();
		customerCredentials.put("tom", "tom123");
		customerCredentials.put("harry", "hary123");
		customerCredentials.put("garry", "garry123");
		customerCredentials.put("monica", "monica123");
		
		CustomerLogin customerLogin= new CustomerLogin();
		customerLogin.setLoginName(loginName);
		customerLogin.setPassword(customerCredentials.get(loginName));
		
		return customerLogin;
	}

}
