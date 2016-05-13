package basic;

// ���ϸ� : HeaderInfoServlet.java
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HeaderInfoServlet")
public class HeaderInfoServlet extends HttpServlet {
	public void doGet (HttpServletRequest req, HttpServletResponse res)	
                     		throws ServletException, IOException {
    		PrintWriter out;
    		res.setContentType("text/html; charset=EUC-KR");
		out = res.getWriter ();
		out.println("<html>");
		out.println("<head><title>Request ���� ��� Servlet</title></head>");
		out.println("<body>");
		out.println("<h3>��û ��� ����</h3>");
		out.println("<pre>");
		Enumeration em = req.getHeaderNames();
		while (em.hasMoreElements()){
       			String s = (String)em.nextElement();
       			out.println(s +" : " + req.getHeader(s));
		}
		out.println("</pre>");
		out.println("</body></html>");
   }  	
}
