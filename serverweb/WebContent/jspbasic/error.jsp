<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<%
	//응답이 정상처리 되었음을 설정
	response.setStatus(HttpServletResponse.SC_OK);
%>
</head>
<body bgcolor="yellow">
	<!-- error가 발생되면 보여질 페이지 -->
	<h3>현재 서버 작업 중입니다.</h3>
	
	<hr/>
</body>
</html>