package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeptServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		//1. 요청정보 추출
		String deptno= req.getParameter("deptno");
		String deptname=req.getParameter("deptname");
		String loc=req.getParameter("loc");
		String telnum=req.getParameter("telnum");
		
		//2.비지니스 메소드 호출
		Dept dept = new Dept();
		int result =dept.insert(deptno, deptname, loc, telnum);
		
		//3. 응답화면 생성  
		pw.print("<h1>deptno: "+deptno+"</h1>");
		pw.print("<h1>deptname: "+deptname+"</h1>");
		pw.print("<h1>loc: "+loc+"</h1>");
		pw.print("<h1>전화번호: "+telnum+"</h1>");
		
		if(result<=1){
			pw.print("<h1>"+"삽입성공!! "+"</h1>");
		}
		
		
	}
	



}
