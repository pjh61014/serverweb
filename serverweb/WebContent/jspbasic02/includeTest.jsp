<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>include �׽�Ʈ</h1>
	<hr/>
	<h2>include �׼��±״� ��û�������Ǵ� ���ҽ��� �����ϰ� �������� ������ �ٽ� �ǵ��ƿ´�. 
		��, include�Ǵ� ���ҽ��� �������� ���Եȴ�.
	</h2>
	<jsp:include page="actiontag_sub.jsp"></jsp:include>
	<h2>�׼��±� �׽�Ʈ ��~~~~~~~~~~~~~</h2>
	<h2>include������</h2>
	<h3>�ڵ尡 copy&paste�ȴ�.</h3>
	<%@ include file="actiontag_sub.jsp" %>
	<h2>������ �׽�Ʈ ��~~~~~~~~~~~~~</h2>
</body>
</html>