package com.example.DAO;

import com.example.model.CustomerLogin;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public CustomerLogin getCustomerByLoginName(String loginName) {

        Map<String,String> customers=new HashMap<>();
        customers.put("tom","tom123");
        customers.put("harry","harry123");
        customers.put("garry","garry123");
        customers.put("monica","monica123");

        CustomerLogin customerLogin=new CustomerLogin();
        customerLogin.setLoginName(loginName);
        customerLogin.setPassword(customers.get(loginName));
        return customerLogin;
    }
}
