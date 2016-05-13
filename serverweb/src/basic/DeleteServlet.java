package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		String deptno =req.getParameter("deptno");
		System.out.println(deptno);
		Dept dao = new Dept();
		int result =0;
		
		result=dao.delete(deptno);
		System.out.println(result);
		
		if(result>=1){
			pw.print("¶ó");
		}else{
			pw.print("¤±¤©¤·");
		}
		
		
	
	}
	
	

}
