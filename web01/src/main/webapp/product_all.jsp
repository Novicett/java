<%@page import="db_connect.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db_connect.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
ProductDAO dao = new ProductDAO();
ArrayList<ProductVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>
		게시물 전체 개수 :<%=list.size()%>개</h3>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>내용</th>
			<th>가격</th>
			<th>회사</th>
			<th>이미지</th>
		</tr>
		<%
		for (int i=0; i< list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getID()%></td>
			<td><a href="http://localhost:8989/web01/product_select.jsp?id=<%=list.get(i).getID()%>">
			<%=list.get(i).getNAME()%>
			</a></td>
			<td><%=list.get(i).getCONTENT()%></td>
			<td><%=list.get(i).getPRICE()%></td>
			<td><%=list.get(i).getCOMPANY()%></td>
			<td><img alt="" src="img/<%=list.get(i).getIMG()%>" width="100" height="50"></td>
		</tr>
		<%
		}
		//for
		%>
	</table>
</body>
</html>