package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String opr = req.getParameter("method");

		Calc cal = new Calc();
		int total = cal.calc(num1, num2, opr);
		
		pw.print("<h1>연산결과 ("+opr+")</h1>");
		pw.print("---------------------------");
		pw.print("<h2>결과값 ==>"+total+"</h2>");

	}

}
