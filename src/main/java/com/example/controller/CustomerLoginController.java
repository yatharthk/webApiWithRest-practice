package com.example.controller;


import com.example.model.CustomerLogin;
import com.example.service.CustomerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "home")
public class CustomerLoginController{

    @Autowired
    private CustomerLoginService customerLoginService;

    @GetMapping("/login")
    public ModelAndView authenticate(@RequestParam String username, @RequestParam String password) throws Exception{
        CustomerLogin customerLogin = new CustomerLogin();
        customerLogin.setLoginName(username);
        customerLogin.setPassword(password);

        String result = customerLoginService.authenticateUser(customerLogin);
        if (result.equals("Success")) {
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("username", username);
            return modelAndView;
        } else {
            System.out.println("Reaching here");
            return new ModelAndView("error");
        }
    }
}
