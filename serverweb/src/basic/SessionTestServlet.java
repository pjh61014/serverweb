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
		 * ������ ����� -getSession()
		 * 			������ ���� ����ߴ� ���ǿ� ���� ������ ������(request��ü���� �����ؼ�) ������ �����ϰ� ������ ������ ���� 
		 * 			���� ����
		 * 			getSession(true|false)
		 * 			true�� getSession()�� �����ϰ� ����
		 * 			false�� ������ �۾��ϴ� ������ ������ ������ �����ϰ� ������ null�� ����
		 * */
		HttpSession ses = request.getSession();
	//���ǿ� ������ �����ϱ�
		ses.setAttribute("id", id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/basic/ses_first.jsp");
		rd.forward(request, response);
		
		
	}

 

}
