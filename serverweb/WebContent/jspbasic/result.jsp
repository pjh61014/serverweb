<%@page import="java.util.Date, dto.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>서블릿에서 요청 재지정된 문서 -jsp문서</h1>
	<hr/>
	
	<%//자바코드를 쓰는 스크립트 요소 -
		System.out.println(new Date());
	
	%>
	<h3>jsp에서는 서블릿에서 공유한 데이터를 꺼내서 출력하기 </h3>
	<%
	//서블릿에서 공유한 데이터를 꺼내기
	MyDeptDTO dept= (MyDeptDTO)request.getAttribute("mydata");
	System.out.println(dept);
	%>
</body>
</html>