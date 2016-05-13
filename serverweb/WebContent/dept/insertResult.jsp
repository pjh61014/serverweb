<%@page import="dept.dto.MyDeptDTO"%>
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
		//서블릿이 공유한 데이터 꺼내오기
		MyDeptDTO dept=(MyDeptDTO) request.getAttribute("dept");
		String result = (String)request.getAttribute("result");
		%>
		<h2>실행결과</h2>
		<hr/
		>
		
		<h3>
		<%if(dept!=null) { %>
		<%= dept.getDeptno() %>(<%=dept.getDeptname() %>)
		<%} %>
		<%=result %></h3>
</body>
</html>