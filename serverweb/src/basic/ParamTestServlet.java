package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamTestServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		
		//�������ڵ� - �������� ������ �� �ֵ��� ��Ʈ���� ��´�. 
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		System.out.println("���̵�: "+id+" "+"�н�����: "+pass);
		
		pw.print("<h1>���̵�: "+id+"</h1>");
		pw.print("<h1>�н����� :"+pass+"</h1>");
	}

}
