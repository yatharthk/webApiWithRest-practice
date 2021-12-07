package com.example.DAO;

import com.example.model.CustomerLogin;

public interface CustomerDAO {

    public CustomerLogin getCustomerByLoginName(String loginName);

}
