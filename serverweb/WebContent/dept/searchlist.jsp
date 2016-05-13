<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.ArrayList"%>
      <%@page import="dept.dto.MyDeptDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% //서블릿이 공유해준 데이터 꺼내기
	ArrayList<MyDeptDTO> searchlist=(ArrayList<MyDeptDTO>)request.getAttribute("searchlist");
	System.out.println("들어왔다네");
	%>
</head>
<body>
<table border="1 solid gray"  width="600" style ="border-collapse:collapse">
<tr bgcolor = "aqua"><th>사원번호</th><th>사원명</th><th>위치</th><th>전화번호</th></tr>
<%
for(int i=0; i<searchlist.size(); i++){
	MyDeptDTO searchInfo = searchlist.get(i);
	/* System.out.println(list.get(i).getDeptno()+" "+list.get(i).getDeptname()+""+list.get(i).getLoc()+" "+list.get(i).getTelNum());
} */
%>
	<tr >
		<td><%=searchInfo.getDeptno()%></td>
		<td><%=searchInfo.getDeptname()%></td>
		<td><%=searchInfo.getLoc()%></td>
		<td><%=searchInfo.getTelNum()%></td>
	
	</tr>

<%} %>
</table>
</body>
</html>