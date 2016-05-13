<%@ page contentType="text/html;charset=euc-kr"%>

<html>
<head>
<title>파일 업로드 예제</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
</head>

<body>
<!-- 파일 업로드를 하기위해서는 method="post" 무조건 포스트여야 하며  enctype="multipart/form-data"를 지켜줘야한다. -->
<form name="fileForm" method="post" enctype="multipart/form-data" action="serverweb/upload.do">
	작성자: 
	<input type="text" name="user"><br>
	제  목: 
	<input type="text" name="title"><br>
	파일명: 
	<input type="file" name="uploadFile"><br>
	<input type="submit" value="파일 올리기"><br>
</form>
</body>
</html>

