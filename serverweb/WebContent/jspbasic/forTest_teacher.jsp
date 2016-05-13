<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- html 주석 -->
	<%-- jsp주석 --%>
	<h1>fortest</h1>
	<hr/>
	<%
		for(int i =1; i<=10; i++ ){%>
			<h3><%= i %></h3>
	<%} %>	
	
	
</body>
</html>