<%@page import="java.net.URLDecoder"%>
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
 			String title = (String)request.getAttribute("title");
			String mypage = (String)request.getAttribute("page");
	%>
	<h2>최근에 보신 책의 제목은 <%=URLDecoder.decode(title, "euc-kr") %>이고 <%=URLDecoder.decode(mypage, "euc-kr")%>까지 읽었습니다.</h2>

</body>
</html>