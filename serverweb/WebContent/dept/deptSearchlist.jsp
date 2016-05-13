<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	#menu{
		width: 30%;
		float: left;
	}
	#content{
		width: 70%;
		float: left;
	}
	#footer{
		clear: both;
		text-align: center;
	}

</style>
</head>
<body>
	<div id="header">
		<jsp:include page="../top.jsp"></jsp:include>
	</div>
	<div id="menu">
		<jsp:include page="deptleftmenu.jsp"></jsp:include>
	</div>
	<div id="content">
		<jsp:include page="searchlist.jsp"></jsp:include>
	</div>
	<div id="footer">
		<h4><a href="/serverweb/deptlist.do">자바나라 - 2016</a></h4>
	</div>
</body>
</html>