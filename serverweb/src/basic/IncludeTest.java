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
//컴파일러에게 미리 명시 ->어노테이션 
@WebServlet(name = "include", urlPatterns = { "/include.do" })
public class IncludeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		pw.println("<h1>요청재지정 연습 -include</h1>");
		System.out.println("요청재지정 연습 -include");
		
		//데이터 공유 -db에서 가져온 데이터 or 비지니스로직을 실행한 결과
		MyDeptDTO dto = new MyDeptDTO("001","전산실","10층","02");
		request.setAttribute("mydata", dto);
				
		//요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/jspbasic/result.jsp");
		rd.include(request, response);
		System.out.println("서블릿종료");
		pw.println("<hr/>");
		pw.println("<h1>요청재지정 연습 -end</h1>");//포워드 시 제어권을 리절트jsp로 넘기기 때문에 
	}

}
