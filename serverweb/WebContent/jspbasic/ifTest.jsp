<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String str = "java programming";
		int length = str.length();%>
		<h1>자바문법과 스크립트요소</h1>
		<hr/>
		<%if(length>10) {%>
				<h2> 좋아요 :<%= length %></h2>
		<%}else{ %> 
			<h2>싫어요 : <%= length %></h2>
			<%} %>		
</body>
</html>