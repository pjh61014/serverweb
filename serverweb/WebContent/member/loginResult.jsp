<%@page import="emp.dto.MyEmpDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%MyEmpDTO login = (MyEmpDTO)session.getAttribute("login"); %>
	<%-- 
	<%=login.getName()+"("+login.getId()+")"+"�� �α��μ���~!" --%>
	
	<h2><%=login.getName()%>(<%=login.getId() %>)�� �α��μ���~!</h2>
	<h4><a href ="/serverweb/member/email.jsp">�����б� </a></h4>
</body>
</html>