package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.service.MyEmpService;
import emp.service.MyEmpServiceImpl;

@WebServlet(name = "idcheck", urlPatterns = { "/idcheck.do" })
public class idCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("id");
		boolean status;
		
		System.out.println("컨트롤러"+id);
		MyEmpService service = new MyEmpServiceImpl();
		status = service.idcheck(id);
		System.out.println("컨트롤러 상태: "+status);
		if(status==true){
			pw.print("중복아이디가 있습니다  ");
		}else{
			pw.print("사용 가능한 아이디입니다 ");
		}

	}

}
