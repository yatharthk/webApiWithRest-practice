package main.java.com.dumy.service;

import main.java.com.dummy.dao.CustomerLoginDAO;
import main.java.com.dummy.dao.CustomerLoginDAOImpl;
import main.java.com.dummy.model.CustomerLogin;

public class CustomerLoginServiceImpl implements CustomerLoginService {

	private CustomerLoginDAO customerLoginDAO;
	@Override
	public String authenticateCustomer(CustomerLogin customerLogin) {
		// TODO Auto-generated method stub
		String toReturn=null;
		customerLoginDAO= new CustomerLoginDAOImpl();
		
		CustomerLogin customerLoginFormDao= customerLoginDAO.getCustomerLoginByLoginName(customerLogin.getLoginName());
		
		if(customerLogin.getPassword().equals(customerLoginFormDao.getPassword()))
			toReturn="success";
		else toReturn="fail";
		
		return toReturn;
	}

}
