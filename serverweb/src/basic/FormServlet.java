package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		String name= req.getParameter("name");
		String addr=req.getParameter("addr");
		String language=req.getParameter("language");
		String save=req.getParameter("save");
		
		pw.print("<center><h2> client form data ó�� </h2></center>");
		if(name==""){
			pw.print("<h3>�� �̸��� �Է��ϼ���</h3>");
		}else{
			pw.print("<h3>�� �̸�: "+name+"</h3>");
		}
		
		if(addr==""){
			pw.print("<h3>�� �ּҸ� �Է��ϼ���</h3>");
		}else{
			pw.print("<h3>�� �ּ�: "+addr+"</h3>");
		}
		
		if(language==null){
			pw.print("<h3>�� ��밡���� language�� �����ϴ�. </h3>");
		}else{
			pw.print("<h3>�� language: "+language+"</h3>");
		}
		
		if(save==null){
			pw.print("<h3>�� �Է����� ���������� �����ϼ��� </h3>");
		}else{
			pw.print("<h3>�� �Է����� ��������: "+save+"</h3>");
		}
	}

}
