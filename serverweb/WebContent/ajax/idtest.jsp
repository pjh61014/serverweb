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
		String id = request.getParameter("id");
		if(id.equals("jang")){ %>
			<h3>가능한 아이디</h3>
		<%}else{ %>
			<h3>불가능 아이디</h3>
		
		<%} %>
</body>
</html>