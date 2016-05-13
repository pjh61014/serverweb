package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dto.MyDeptDTO;
//�����Ϸ����� �̸� ��� ->������̼� 
@WebServlet(name = "RedirectTest", urlPatterns = { "/RedirectTest.do" })
public class SendRedirectTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>��û������ ���� -sendredirection</h1>");
		System.out.println("��û������ ���� -sendredirection");
		//������ ���� -db���� ������ ������ or �����Ͻ������� ������ ���
		MyDeptDTO dto = new MyDeptDTO("001","�����","10��","02");
		request.setAttribute("mydata", dto);
				
		//��û������
		response.sendRedirect("/serverweb/jspbasic/result.jsp");
		System.out.println("��������");
	}

}
