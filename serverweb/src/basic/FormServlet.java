package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = res.getWriter();
		String name= req.getParameter("name");
		String addr=req.getParameter("addr");
		String language=req.getParameter("language");
		String save=req.getParameter("save");
		
		pw.print("<center><h2> client form data 처리 </h2></center>");
		if(name==""){
			pw.print("<h3>ㆍ 이름을 입력하세요</h3>");
		}else{
			pw.print("<h3>ㆍ 이름: "+name+"</h3>");
		}
		
		if(addr==""){
			pw.print("<h3>ㆍ 주소를 입력하세요</h3>");
		}else{
			pw.print("<h3>ㆍ 주소: "+addr+"</h3>");
		}
		
		if(language==null){
			pw.print("<h3>ㆍ 사용가능한 language가 없습니다. </h3>");
		}else{
			pw.print("<h3>ㆍ language: "+language+"</h3>");
		}
		
		if(save==null){
			pw.print("<h3>ㆍ 입력정보 저장유무를 선택하세요 </h3>");
		}else{
			pw.print("<h3>ㆍ 입력정보 저장유무: "+save+"</h3>");
		}
	}

}
