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
		//1. ��û���� ����
		String deptno= req.getParameter("deptno");
		String deptname=req.getParameter("deptname");
		String loc=req.getParameter("loc");
		String telnum=req.getParameter("telnum");
		
		//2.�����Ͻ� �޼ҵ� ȣ��
		Dept dept = new Dept();
		int result =dept.insert(deptno, deptname, loc, telnum);
		
		//3. ����ȭ�� ����  
		pw.print("<h1>deptno: "+deptno+"</h1>");
		pw.print("<h1>deptname: "+deptname+"</h1>");
		pw.print("<h1>loc: "+loc+"</h1>");
		pw.print("<h1>��ȭ��ȣ: "+telnum+"</h1>");
		
		if(result<=1){
			pw.print("<h1>"+"���Լ���!! "+"</h1>");
		}
		
		
	}
	



}
