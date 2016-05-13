package basic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ActionTestServlet
 */
@WebServlet(name = "sessionTest", urlPatterns = { "/sessionTest" })
public class SessionTestServlet extends HttpServlet {
	
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		/*
		 * 세션을 만들기 -getSession()
		 * 			기존에 만들어서 사용했던 세션에 대한 정보가 있으면(request객체에서 추출해서) 세션을 리턴하고 없으면 무조건 새로 
		 * 			만들어서 리턴
		 * 			getSession(true|false)
		 * 			true는 getSession()과 동일하게 동작
		 * 			false는 기존에 작업하던 세션이 있으면 세션을 리턴하고 없으면 null을 리턴
		 * */
		HttpSession ses = request.getSession();
	//세션에 데이터 저장하기
		ses.setAttribute("id", id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/basic/ses_first.jsp");
		rd.forward(request, response);
		
		
	}

 

}
