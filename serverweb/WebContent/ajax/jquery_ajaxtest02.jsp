<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	//get����� ���
	$(document).ready(function(){
		$("#ajaxbtn").on("click",function(){
			$.get("idtest.jsp",{"id":$("#id").val()},success_run);
			
		});
	});
	function success_run(txt){//������ ����� �����ϸ� ó������� success�� ������ �Լ��� ȣ���ϸ� �Ѱ��ش�.
		$("#mydiv").html("get: "+txt);
	}

</script>
</head>
<body>
	<h1>Ajax�½�Ʈ</h1>
	<form name="myform">
			<input type="text" id="id">
	</form>
	
	<button type="button" id="ajaxbtn">Ajax�׽�Ʈ</button>
	<div id="mydiv"></div>
</body>
</html>