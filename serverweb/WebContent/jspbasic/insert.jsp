<%@page import="basic.Dept"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- Dept 클래스의 insert 메소드를 호출해서 실제 db에 insert될 수 있도록 구현하기 
			모든 작업을 처리한 후 응답화면
			____개 행 삽입성공!! or 삽입실패-->
			
			
			<%
			
			request.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			//1. 요청정보 추출
			String deptno= request.getParameter("deptno");
			String deptname=request.getParameter("deptname");
			String loc=request.getParameter("loc");
			String telnum=request.getParameter("telnum");
			
			//2.비지니스 메소드 호출
			Dept dept = new Dept();
			int result =dept.insert(deptno, deptname, loc, telnum);
			
			if(result >=1){
				out.print(result +"개 행 삽입성공");
			}else{
				out.println("삽입실패");
			}
			%>
			
			
</body>
</html>