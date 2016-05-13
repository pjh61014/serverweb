package dept.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dto.MyDeptDTO;
import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;

/**
 * Servlet implementation class DeptReadServlet
 */
@WebServlet(name = "deptread", urlPatterns = { "/deptread.do" })
public class DeptReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
			doPost(req,res);
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		
		String deptno =req.getParameter("deptno");
		String state = req.getParameter("state");
	
			System.out.println("read_deptno"+deptno);
			MyDeptService service = new MyDeptServiceImpl();
			MyDeptDTO deptlist= new MyDeptDTO();
			deptlist=service.read(deptno);
			
			System.out.println(deptlist.getDeptno() + "" +deptlist.getDeptname()+""+deptlist.getLoc()+""+deptlist.getTelNum());
			req.setAttribute("readlist", deptlist);
			String path = "";
			
			if(state.equals("UPDATE")){
				path="/dept/deptupdateMain.jsp";
			}else if(state.equals("READ")){
				path="/dept/deptreadMain.jsp";
			}
			
			RequestDispatcher rd = req.getRequestDispatcher(path);
			rd.forward(req,res);
		
	
	}

}
