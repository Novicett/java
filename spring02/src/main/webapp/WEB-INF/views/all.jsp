<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
	body {
		background: lime;
	}
	
	* {
		text-align: center; /* 가로 가운데 정렬 */
		vertical-align: middle; /* 세로 가운데 정렬 */
	}
	
	#cetner {
		width: 800px;
		height: 700px;
	}
</style>
</head>
<body>
<div id="cetner">
<h3>받은 노래 정보</h3>
<table class="table table-hover">
	<tr class="table-info">
		<th>곡명</th>
		<th>가수명</th>
		<th>작곡가</th>
	</tr>
	<c:forEach var="dto" items="${list}">
	<tr class="table-info">
		<td> 곡 명: ${dto.title}</td>
		<td> 가 수: ${dto.singer}</td>
		<td> 작곡가: ${dto.writer}</td>
	</tr>
</c:forEach>

</table>
</div>
</body>
</html>