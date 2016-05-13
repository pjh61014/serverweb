<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
		function runAjax(){
			//step1. XMLHttpRequest객체 생성
			var xhr = new XMLHttpRequest();
			mydiv = document.getElementById("mydiv");
			//step2. onreadystatechange를 구현
			xhr.onreadystatechange= function(){
				console.log("상태값"+xhr.readyState);
				if(xhr.readyState==4 && xhr.status==200) {
					mydiv.innerHTML = xhr.responseText;
					
					
				}
			}
			//step3. 요청 설정
			xhr.open("GET", "idtest.jsp?id="+myform.id.value, true);
			//step4. 요청보내기
			xhr.send();
		}

</script>
</head>
<body>
	<h1>Ajax태스트</h1>
	<form name="myform">
			<input type="text" name="id">
	</form>
	
	<button type="button" onclick="runAjax()">Ajax테스트</button>
	<div id="mydiv"></div>
</body>
</html>