package basic;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookie
 */
//���ϴ� ������ ��Ű�� �����ϱ� 
@WebServlet(name = "setCookie", urlPatterns = { "/setCookie" })
public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ���ϴ� ������ ���� �ִ� ��Ű��ü�� ����
		Cookie cookie1 = new Cookie("title", URLEncoder.encode("��Ŭ����", "euc-kr"));
		Cookie cookie2 = new Cookie("page", "70");
		//��Ű�� ���� ��ȿ�ð� ����
		cookie1.setMaxAge(120);
		cookie2.setMaxAge(120);
		
		//��Ű�� Ŭ���̾�Ʈ�� ���� 
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	}

}
