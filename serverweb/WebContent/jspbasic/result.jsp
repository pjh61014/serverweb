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
	<h1>�������� ��û �������� ���� -jsp����</h1>
	<hr/>
	
	<%//�ڹ��ڵ带 ���� ��ũ��Ʈ ��� -
		System.out.println(new Date());
	
	%>
	<h3>jsp������ �������� ������ �����͸� ������ ����ϱ� </h3>
	<%
	//�������� ������ �����͸� ������
	MyDeptDTO dept= (MyDeptDTO)request.getAttribute("mydata");
	System.out.println(dept);
	%>
</body>
</html>