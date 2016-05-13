package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		
		String userId = req.getParameter("userId");
		String userName = req.getParameter("userName");
		String passwd = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		//String item = req.getParameter("item");
		String[] item = req.getParameterValues("item");
		int itemLength = item.length;
		
		System.out.println("유저아이디 :"+userId+"이름: "+userName+
				"비밀번호: "+passwd+"성별: "+gender+"직업: "+job+"아이템 : "+item);
		
		pw.print("<h1>아이디: "+userId+"</h1>");
		pw.print("<h1>이름: "+userName+"</h1>");
		pw.print("<h1>비밀번호: "+passwd+"</h1>");
		pw.print("<h1>성별: "+gender+"</h1>");
		pw.print("<h1>직업: "+job+"</h1>");
		pw.print("<h1>아이템 :");
		for(int i=0;i<itemLength;i++){
			pw.print(item[i]+" ");
		}
		pw.print("</h1>");
		
	}

}
