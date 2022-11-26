<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
검색된 id는 ${dto.id} <br> 
검색된 title는 ${dto.title} <br>
검색된 contents는 ${dto.singer} <br>
검색된 writer는 ${dto.writer} <br>
</div>
</body>
</html>