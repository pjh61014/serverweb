<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="dept.dto.MyDeptDTO,emp.dto.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
	<% //서블릿이 공유해준 데이터 꺼내기
	ArrayList<MyDeptDTO> list=(ArrayList<MyDeptDTO>)request.getAttribute("deptlist");
	
	%>
</head>
<body>
	<h1>부서목록 </h1>
<table border="1 solid gray"  width="600" style ="border-collapse:collapse">
<tr bgcolor = "aqua"><th>사원번호</th><th>사원명</th><th>위치</th><th>전화번호</th><th>삭제</th></tr>
<%
for(int i=0; i<list.size(); i++){
	MyDeptDTO deptInfo = list.get(i);
	/* System.out.println(list.get(i).getDeptno()+" "+list.get(i).getDeptname()+""+list.get(i).getLoc()+" "+list.get(i).getTelNum());
} */
%>
	<tr >
		<td><%=deptInfo.getDeptno()%></td>
		<td><a href="/serverweb/deptread.do?deptno=<%=deptInfo.getDeptno()%>&state=READ"><%=deptInfo.getDeptname()%></a></td>
		<td><%=deptInfo.getLoc()%></td>
		<td><%=deptInfo.getTelNum()%></td>
		<td><a href="/serverweb/deptDelete.do?deptno=<%=deptInfo.getDeptno()%>">삭제</a></td>
	</tr>

<%} %>


</table>

</body>
</html>