<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<!-- @: page 지시자(tomcat WAS에게!!) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1.입력
    2.처리(db처리)	`
    3.출력(브라우저로 출력)
     -->
    <!-- 
    1. 데이터를 product_insert.html에서 입력해서 넘김 값을 받으면 될 것.
    
     -->
     <%
     	//스크립트릿(scriptlet--> 자바코드를 쓰는 부분)
     	//주소부분 중에서 id=110
     	String id=request.getParameter("id");
     	ProductDAO dao= new ProductDAO();
     	dao.delete(id);
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>