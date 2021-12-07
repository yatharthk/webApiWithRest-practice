package com.example.service;

import com.example.DAO.CustomerDAO;
import com.example.model.CustomerLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLoginServiceImpl  implements  CustomerLoginService{

    @Autowired
    private CustomerDAO customerDAO;
    @Override
    public String authenticateUser(CustomerLogin customerLogin) {
        String toReturn;
        CustomerLogin tempCustomer= customerDAO.getCustomerByLoginName(customerLogin.getLoginName());
        if(tempCustomer.getPassword().equals(customerLogin.getPassword())){
            toReturn="Success";
        }
        else{
            toReturn="Failed";
        }
        System.out.println(toReturn);
        return toReturn;
    }
}
