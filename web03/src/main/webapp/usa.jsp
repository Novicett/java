<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    String usa = request.getParameter("usa");
    int usa2 = Integer.parseInt(usa);
    int result = usa2 * 1316;
    %>
    
    <%=result +"원"%>