package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import dept.dto.MyDeptDTO;
//�����Ϸ����� �̸� ��� ->������̼� 
@WebServlet(name = "forward", urlPatterns = { "/forward.do" })
public class ForwardTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>��û������ ���� -forward</h1>");
		System.out.println("��û������ ���� -forward");
		
		//������ ���� -db���� ������ ������ or �����Ͻ������� ������ ���
		MyDeptDTO dto = new MyDeptDTO("001","�����","10��","02");
		request.setAttribute("mydata", dto);
				
		//��û������
		RequestDispatcher rd = request.getRequestDispatcher("/jspbasic/result.jsp");
		rd.forward(request, response);
		System.out.println("��������");
		pw.println("<h1>��û������ ���� -end</h1>");
	}

}
