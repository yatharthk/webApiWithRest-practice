package com.example.service;

import com.example.dao.CustomerDAOImpl;
import com.example.dao.CustomerLoginDAO;
import com.example.model.CustomerLogin;

public class CustomerLoginServiceImpl implements CustomerLoginService{

private CustomerLoginDAO customerLoginDAO;


	public String authenticateCustomer(CustomerLogin customerLogin) {
		String toReturn=null;
		customerLoginDAO= new CustomerDAOImpl();
		CustomerLogin tempCustomer=customerLoginDAO.getCustomerByLoginName(customerLogin.getLoginName());
		
		if(customerLogin.getPassword().equals(tempCustomer.getPassword())) {
			toReturn="success";
		}
		else {
			toReturn="failed";
		}
		return toReturn;
	}

}
