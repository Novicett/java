<%@page import="db_connect.ProductVO"%>
<%@page import="java.lang.management.GarbageCollectorMXBean"%>
<%@page import="db_connect.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
ProductDAO dao = new ProductDAO();
ProductVO bag = dao.one(Integer.parseInt(id));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link 	rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
	<h3>검색된 결과입니다.</h3>
	<table class="table table-hover">
		<tr>
			<td>항목명</td>
			<td>데이터</td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%=bag.getID()%></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=bag.getNAME()%></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=bag.getCONTENT()%></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><%=bag.getPRICE()%></td>
		</tr>
		<tr>
			<td>회사</td>
			<td><%=bag.getCOMPANY()%></td>
		</tr>
		<tr>
			<td>이미지</td>
			<td><%=bag.getIMG()%></td>
		</tr>
		


	</table>

	
	
</body>
</html>