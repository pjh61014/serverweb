<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%String id =(String)session.getAttribute("id"); %>
	<h3>세션을 꺼낸 데이터:(두번째 데이터)"<%=id %></h3>
	<hr/>
	<h3><a href = "/serverweb/basic/ses_second.jsp">공유되는거 맞아??</a></h3>
	
</body>
</html>