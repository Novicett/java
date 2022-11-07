
<%@page import="db_connect.BbsVO"%>
<%@page import="db_connect.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String id = request.getParameter("id");
String title = request.getParameter("title");
String content = request.getParameter("content");
String writer = request.getParameter("writer");

BbsDAO bbs = new BbsDAO();
BbsVO bag = new BbsVO();
BbsVO bag2 = new BbsVO();
BbsVO bag3 = new BbsVO();

int id2 = Integer.parseInt(id);
bag.setNo(id2);
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);
bbs.insert(bag);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: orange;
}
</style>
</head>
<body>
	<%=writer%>님이 보내신 데이터
	<hr>
	<%=id%>
	아이디
	<br>
	<%=title%>
	제목
	<br>
	<%=content%>
	내용
	<br>
	<%=writer%>
	<br>
	<hr>
	<a href="bbs.html">이전페이지로 이동</a>


</body>
</html>