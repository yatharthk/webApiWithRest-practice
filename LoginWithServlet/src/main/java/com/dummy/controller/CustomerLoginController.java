package main.java.com.dummy.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.com.dummy.model.CustomerLogin;
import main.java.com.dumy.service.CustomerLoginService;
import main.java.com.dumy.service.CustomerLoginServiceImpl;

@WebServlet("/loginServlet")
public class CustomerLoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CustomerLogin customerLogin= new CustomerLogin();
		customerLogin.setLoginName(req.getParameter("username"));
		customerLogin.setPassword(req.getParameter("password"));
		
		CustomerLoginService customerLoginService= new CustomerLoginServiceImpl();
		String message=customerLoginService.authenticateCustomer(customerLogin);
	
		String successMessage="<!doctype html>"+"<html>"+"<head>"
				+ "<title>Login Successfull</title>"
				+ "</head>"+"<body>"+"<div align='center'>" +"<h3> Welcome"+req.getParameter("username")+"."
						+ "</br></br> You have been logged in successfully.</h3>"
						+ "</div> </body> </html>";
		
		String failMessage="<!doctype html>"+"<html>"+"<head>" + 
							"<title> Login Failed</title>" + 
				"</head> <body> <div align='center'> <h3> Invalid credentials. Please try again.</h3> </div> </body> </html>";
		PrintWriter writer= resp.getWriter();
		
		writer.write(message.equals("success")?successMessage:failMessage);
	}

}
