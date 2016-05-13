<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>include 테스트</h1>
	<hr/>
	<h2>include 액션태그는 요청재지정되는 리소스를 실행하고 실행결과를 가지고 다시 되돌아온다. 
		즉, include되는 리소스의 실행결과가 포함된다.
	</h2>
	<jsp:include page="actiontag_sub.jsp"></jsp:include>
	<h2>액션태그 테스트 끝~~~~~~~~~~~~~</h2>
	<h2>include지시자</h2>
	<h3>코드가 copy&paste된다.</h3>
	<%@ include file="actiontag_sub.jsp" %>
	<h2>지시자 테스트 끝~~~~~~~~~~~~~</h2>
</body>
</html>