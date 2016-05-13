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
	<h1>JSP문서에서 쓸 수 있는 스크립트 요소</h1>
	<h3>1. 스크립트릿 - 자바코드를 쓸 수 있는 스크립트 요소</h3>
	<%
			String str = new String("JSP테스트");
			out.println("<h3>"+str.length()+"</h3>");
			Random rand = new Random();
	%>
	<h2>2. 표현식 - out.print()로 생성</h2>
	<h4>==> 표현식을 통해서 작성하는 코드는 메소드 내부의 매개변수로 전달된다
					따라서 ;은 추가하지 않는다 
					메소드의 매개변수로 전달되므로 리턴타입이 있는 메소드 호출문이나 기본형 데이터 or
					String or 연산식 을 추가 할 수 있다.
	</h4>
	<%= "java" %>
	<h4><%= str.length() %></h4>
	
	
	<h3>3. 선언문 - 멤버를 정의하기 위해서 사용(_jspInit()메소드를 오버라이딩 하거나 할때 사용)</h3>
	<% int j= 10000; %><%-- jsp주석문 
									=> 스크립트릿에 선언되는 변수는 무조건 __jspService()내부의 지역변수로 정의
									 --%>
<%! int j=100; %>
<%! public void test(){}%>	 

									 
</body>
</html>