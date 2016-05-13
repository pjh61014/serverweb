<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%String number = request.getParameter("dan"); 
			StringBuffer sb = new StringBuffer();
			int num = Integer.parseInt(number);
	
			for(int i=1; i<=9; i++){
				sb.append(String.format("%d * %d = %d<br/>", num, i,(num*i)));
			}
			out.write(sb.toString());
		%>
		
	
		
		
		
	
</body>
</html>