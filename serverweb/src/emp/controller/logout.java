package emp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logout
 */
@WebServlet(name = "logout", urlPatterns = { "/logout.do" })
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용하는 세션을 얻어오기
		HttpSession ses = request.getSession(false);
		if(ses!=null){
			//세션을 제거하기
			ses.invalidate();
		}
		//첫번째 페이지로 리다이렉트
		response.sendRedirect("/serverweb/index.jsp");
	}
}
