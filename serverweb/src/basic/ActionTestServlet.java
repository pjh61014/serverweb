package basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionTestServlet
 */
@WebServlet(name = "action", urlPatterns = { "/action" })
public class ActionTestServlet extends HttpServlet {
	
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		
	}

  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String deptno= request.getParameter("deptno");
		String state= request.getParameter("state");
		System.out.println(deptno+""+state);
		String path="";
		if(state.equals("READ")){
			path="/basic/dept_read.jsp";
		}else if(state.equals("UPDATE")){
			path="/basic/dept_update.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
		
	}


}
