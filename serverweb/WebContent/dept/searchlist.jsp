<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="java.util.ArrayList"%>
      <%@page import="dept.dto.MyDeptDTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<% //������ �������� ������ ������
	ArrayList<MyDeptDTO> searchlist=(ArrayList<MyDeptDTO>)request.getAttribute("searchlist");
	System.out.println("���Դٳ�");
	%>
</head>
<body>
<table border="1 solid gray"  width="600" style ="border-collapse:collapse">
<tr bgcolor = "aqua"><th>�����ȣ</th><th>�����</th><th>��ġ</th><th>��ȭ��ȣ</th></tr>
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