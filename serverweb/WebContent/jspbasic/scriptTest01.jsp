<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP�������� �� �� �ִ� ��ũ��Ʈ ���</h1>
	<h3>1. ��ũ��Ʈ�� - �ڹ��ڵ带 �� �� �ִ� ��ũ��Ʈ ���</h3>
	<%
			String str = new String("JSP�׽�Ʈ");
			out.println("<h3>"+str.length()+"</h3>");
			Random rand = new Random();
	%>
	<h2>2. ǥ���� - out.print()�� ����</h2>
	<h4>==> ǥ������ ���ؼ� �ۼ��ϴ� �ڵ�� �޼ҵ� ������ �Ű������� ���޵ȴ�
					���� ;�� �߰����� �ʴ´� 
					�޼ҵ��� �Ű������� ���޵ǹǷ� ����Ÿ���� �ִ� �޼ҵ� ȣ�⹮�̳� �⺻�� ������ or
					String or ����� �� �߰� �� �� �ִ�.
	</h4>
	<%= "java" %>
	<h4><%= str.length() %></h4>
	
	
	<h3>3. ���� - ����� �����ϱ� ���ؼ� ���(_jspInit()�޼ҵ带 �������̵� �ϰų� �Ҷ� ���)</h3>
	<% int j= 10000; %><%-- jsp�ּ��� 
									=> ��ũ��Ʈ���� ����Ǵ� ������ ������ __jspService()������ ���������� ����
									 --%>
<%! int j=100; %>
<%! public void test(){}%>	 

									 
</body>
</html>