<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
    	String korea = request.getParameter("korea");
    	int won2 = Integer.parseInt(korea);
    	double result= won2 * 0.00076;
 %>
<%=result +"$" %>