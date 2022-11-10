<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id=request.getParameter("id");
    	String pw=request.getParameter("pw");
    	String pw2=request.getParameter("pw2");
    	String name=request.getParameter("name");
    	String birth=request.getParameter("birth");
    	String sex=request.getParameter("sex");
    	String phone=request.getParameter("phone");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력해보기</title>
</head>
<body>
	서버에서 받은 id ?? <%= id%><br>
	서버에서 받은 pw >> <%=pw %><br>
	서버에서 받은 pw2 >> <%=pw2 %><br>
	서버에서 받은 name >> <%=name %><br>
	서버에서 받은 birth >> <%=birth %><br>
	서버에서 받은 sex >> <%=sex %><br>
	서버에서 받은 phone >> <%=phone %><br>
</body>
</html>