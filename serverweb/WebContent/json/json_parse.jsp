<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�μ�</h1>
	<hr/>
	<div id="depteval"></div>
	<div id="deptparser"></div>
	<script type="text/javascript">
		var deptlist
		  = '{"depts" :'+ 
			  '[ {"code" : "001","name" : "�����ý�����",'+
				  '"loc" : "4��","tel" : "02-770-111"},'+
		    	'{"code" : "002","name" : "�ý���������",'+
				'"loc" : "4��","tel" : "02-770-111"},'+
				'{"code" : "003","name" : "���������",'+
				'"loc" : "4��","tel" : "02-770-111"},'+
				'{"code" : "004","name" : "����1��",	'+
				'"loc" : "4��","tel" : "02-770-111"} ]}'
		 
		//eval�Լ��� �̿��ؼ�json�� �����ϱ�
		var obj = eval("("+deptlist+")");
		mydata1 = obj.depts[1].code+","+obj.depts[1].name
		alert(mydata1)
		document.getElementById("depteval").innerHTML = mydata1
		
		//JSON ���̺귯���� �̿�
	 	var obj2 = JSON.parse(deptlist)//json->�ڹٽ�ũ��Ʈ��ü
		mydata2 = obj2.depts[2].code+","+obj2.depts[2].name
		alert(mydata2)
		document.getElementById("deptparser").innerHTML = mydata2
	</script>
</body>
</html>