<%@page import="basic.Dept"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- Dept Ŭ������ insert �޼ҵ带 ȣ���ؼ� ���� db�� insert�� �� �ֵ��� �����ϱ� 
			��� �۾��� ó���� �� ����ȭ��
			____�� �� ���Լ���!! or ���Խ���-->
			
			
			<%
			
			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			//1. ��û���� ����
			String deptno= request.getParameter("deptno");
			String deptname=request.getParameter("deptname");
			String loc=request.getParameter("loc");
			String telnum=request.getParameter("telnum");
			
			//2.�����Ͻ� �޼ҵ� ȣ��
			Dept dept = new Dept();
			int result =dept.insert(deptno, deptname, loc, telnum);
			
			if(result >=1){
				out.print(result +"�� �� ���Լ���");
			}else{
				out.println("���Խ���");
			}
			%>
			
			
</body>
</html>