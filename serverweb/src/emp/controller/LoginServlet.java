package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;
import emp.service.MyEmpServiceImpl;

@WebServlet(name = "login", urlPatterns = { "/login.do" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		System.out.println("controller 넘어왔다네"+"id :"+id+"pass"+pass);
		
		MyEmpDTO emp= new MyEmpDTO();
		MyEmpService service = new MyEmpServiceImpl();
		
		emp = service.login(id, pass);
		//로그인과 동시에 무조건 세션을 생성 
		HttpSession ses = request.getSession();
		ses.setAttribute("login", emp);
		
		RequestDispatcher rd = request.getRequestDispatcher("/member/loginResultMain.jsp");
		rd.forward(request, response);
		
	}

}
