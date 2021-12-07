<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Page</title>
</head>
<body>

<%@ page import="com.example.model.CustomerLogin,com.example.service.CustomerLoginServiceImpl" %>

<%

CustomerLogin customerLogin=new CustomerLogin();
customerLogin.setLoginName(request.getParameter("loginName"));
customerLogin.setPassword(request.getParameter("password"));
CustomerLoginServiceImpl customerLoginServiceImpl=new CustomerLoginServiceImpl();
String message=customerLoginServiceImpl.authenticateCustomer(customerLogin);

if(message.contains("success")){
%>

<h3 align="center">
<%= "Welcome "+request.getParameter("loginName")+ "." %></br>
You have successfully logged in.
</h3>

<% } else { %>
<h3 align="center">Invalid login credentials,Please try again
</h3>
<%} %>
</body>
</html>