<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
		function runAjax(){
			//step1. XMLHttpRequest��ü ����
			 xhr = new XMLHttpRequest();
			mydiv = document.getElementById("mydiv");
			//step2. onreadystatechange�� ����
			xhr.onreadystatechange= test
			xhr.open("POST", "idtest.jsp",true);
			xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
			//step4. ��û������
			xhr.send("id="+myform.id.value);				
				
			function test(){
				console.log("���°�"+xhr.readyState);
				if(xhr.readyState==4 && xhr.status==200) {
					mydiv.innerHTML = xhr.responseText;
			}
		}
			//step3. ��û ����
			
		}

</script>
</head>
<body>
	<h1>Ajax�½�Ʈ</h1>
	<form name="myform">
			<input type="text" name="id">
	</form>
	
	<button type="button" onclick="runAjax()">Ajax�׽�Ʈ</button>
	<div id="mydiv"></div>
</body>
</html>