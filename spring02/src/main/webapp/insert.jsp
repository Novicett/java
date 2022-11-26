<%@page import="com.multi.mvc02.MemberDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 받아라, 가방을 만들어서 집어넣고, 프린트 -->
    <%
    /* 클라이언트로부터 데이터를 받은 후, 어떻게 사용할 것인가 제어하는 코드 부분 */
    /* Control(제어 부분) --> java!! */
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    
    MemberDTO bag = new MemberDTO();
    // 넣는다. bag.setId(id);
    // jdbc 4단계(MemberDAO) --> java!!!
    // Model(방법클래스, 특정한 방법을 가지고 처리하는 클래스)
    %>
    <!-- View(보여지는 부분) >> html(jsp) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id : <%= id %> <br>
pw : <%= pw %> <br>
name : <%= name %> <br>
tel : <%= tel %> <br>
</body>
</html>