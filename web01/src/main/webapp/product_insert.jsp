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
     	String name=request.getParameter("name");
     	String content=request.getParameter("content");
     	String price=request.getParameter("price");
     	String company=request.getParameter("company");
     	String img=request.getParameter("img");
     	ProductVO bag=new ProductVO();
     	bag.setID(id);
     	bag.setNAME(name);
     	bag.setCONTENT(content);
     	bag.setPRICE(Integer.parseInt(price));
     	bag.setCOMPANY(company);
     	bag.setIMG(img);
   
     	ProductDAO dao= new ProductDAO();
     	dao.insert(bag);
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