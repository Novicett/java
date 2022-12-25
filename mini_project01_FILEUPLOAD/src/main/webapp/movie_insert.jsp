<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/menuCss.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script>
  $(function(){
    $('#btn').click(function(){
      const imageInput = $("#file")[0];
    
      if(imageInput.files.length === 0){
        alert("파일은 선택해주세요");
        return;
      }
    
      var form = $('#form')[0];
      const formData = new FormData(form);
      formData.append("file", imageInput.files[0]);
    
      $.ajax({
        type:"POST",
        url: "uploadForm",
        processData: false,
        contentType: false,
        cache: false,
        timeout : 600000,
        enctype: 'multipart/form-data',
        data: formData,
        success: function(message){
          console.log("message: ", message)
        },
        err: function(err){
          console.log("err:", err)
        }
      })
    })
  })
</script>
</head>
<body>
	<div id="total">
		<div id="menu">
			<jsp:include page="menu.jsp"></jsp:include>
		</div>
		<div id="center">
			<h3 style="text-align: center;">영화 등록 페이지</h3>
			<hr color="grey">
			<form action="insert" id="form" method="post" enctype="multipart/form-data" >
				<span class="input-group-text">TITLE</span> <input type="text"
					class="form-control input-sm" name="title" placeholder="title"><br>
					
				<span class="input-group-text">IMG</span>
						파일 선택: <input type="file" name="file" id="file"><br>
					
				<span class="input-group-text">GENRE</span> 
				<input type="text"
					class="form-control" name="genre" placeholder="genre"><br>
					
				<span class="input-group-text">RUNNING_TIME</span> 
				<input
					type="text" class="form-control" name="running_time"
					placeholder="running_time"><br> 
					<span
					class="input-group-text">VIDEO</span> 
					<input type="text"
					class="form-control" name="link" placeholder="link"><br>
				<button type="submit" class="btn btn-secondary">등록</button>
			</form>
		</div>
	</div>
</body>
</html>