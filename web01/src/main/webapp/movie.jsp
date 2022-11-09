<%@page import="db_connect.MovieVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db_connect.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	MovieDAO dao = new MovieDAO();
	ArrayList<MovieVO> list= dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<style type="text/css">
table {
	font-size: 10px
}
</style>
</head>
<body>
	<h3 align="center">최신 영화</h3>
	<hr>
	<div class="table-responsive">
		<table class="table table-bordered">
			<thead>
			<% 
			for(int i=0; i<list.size(); i++){
				
			%>
				<tr align="center">
					<th><%=list.get(i).getID()%></th>
					<th><%=list.get(i).getNAME()%></th>
					<th><img alt="" src="img/<%=list.get(i).getIMG()%>" width="100" height="50"></th>
					<th><%=list.get(i).getCONTENT()%></th>
					<th><%=list.get(i).getGERNE()%></th>
				</tr>
				<%
				}
			
				%>
			</thead>
			<tbody>
				<tr align="center">
					<td><img src="img/1.jpg"></td>
					<td><img src="img/2.jpg"></td>
					<td><img src="img/3.jpg"></td>
					<td><img src="img/4.jpg"></td>
					<td><img src="img/5.jpg"></td>
					<td><img src="img/6.jpg"></td>
					<td><img src="img/7.jpg"></td>
				</tr>
				<tr align="center">
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
					<td><a href="product_insert.html">
							<button class="btn btn-outline-secondary">상세검색</button>
					</a></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>