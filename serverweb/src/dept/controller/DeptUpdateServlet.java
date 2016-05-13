package dept.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dto.MyDeptDTO;
import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;

/**
 * Servlet implementation class DeptUpdateServlet
 */
@WebServlet(name = "update", urlPatterns = { "/deptupdate.do" })
public class DeptUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		MyDeptDTO dept = new MyDeptDTO();
		dept.setDeptno(request.getParameter("deptno"));
		dept.setDeptname(request.getParameter("deptname"));
		dept.setLoc(request.getParameter("loc"));
		dept.setTelNum(request.getParameter("telNum"));
		
		MyDeptService service = new MyDeptServiceImpl();
		
		System.out.println(dept.getDeptname()+dept.getDeptno()+dept.getLoc()+dept.getTelNum());
		int result = service.update(dept);
		
		response.sendRedirect("/serverweb/deptlist.do");
		
		
		
	}

}
