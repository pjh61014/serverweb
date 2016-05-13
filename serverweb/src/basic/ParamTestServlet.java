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
		
		//연습용코드 - 브라우저로 응답할 수 있도록 스트림을 얻는다. 
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		System.out.println("아이디: "+id+" "+"패스워드: "+pass);
		
		pw.print("<h1>아이디: "+id+"</h1>");
		pw.print("<h1>패스워드 :"+pass+"</h1>");
	}

}
