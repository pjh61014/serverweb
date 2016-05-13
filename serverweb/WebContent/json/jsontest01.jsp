<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	var person = {
			"name":"김서연",
			"age":"25",
			"like":["자바","서블릿"],
			"isBeautiful":"true",
			"addr":{
				"zipcode":"22222",
				"addr1":"인천시",
				"addr2":"남구"
			},
			"history":[
				{
					"subject":"java",
					"month":"7"
				},
				{
					"subject":"servlet",
					"month":"8"
				},
				{
					"subject":"jsp",
					"month":"9"
				}
				
			]
	}
	document.write("<h3>name:"+person.name+"</h3>")
	document.write("<h3>age:"+person.age+"</h3>")
	document.write("<h3>isBeautiful:"+person.isBeautiful+"</h3>")
	document.write("<h3>zipcode:"+person.addr.zipcode+"</h3>")
	document.write("<h3>배열1:"+person.history[0].subject+"</h3>")
	document.write("<h3>배열2:"+person.history[1].subject+"</h3>")
</script>
</body>
</html>