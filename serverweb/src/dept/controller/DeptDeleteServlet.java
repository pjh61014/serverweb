package dept.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;
@WebServlet(name = "delete", urlPatterns = { "/deptDelete.do" })
public class DeptDeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
			
		String deptno =req.getParameter("deptno");
		System.out.println(deptno);
		MyDeptService service = new MyDeptServiceImpl();
		int result =0;
		
		result=service.delete(deptno);
		
		res.sendRedirect("/serverweb/deptlist.do");
		
	
	}
	
	

}
