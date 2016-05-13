package dept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dao.MyDeptDAOImpl;
import dept.dto.MyDeptDTO;
import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;
@WebServlet(name = "ajaxinsert", urlPatterns = { "/ajaxinsert.do" })
public class DeptAjaxInsertServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("utf-8");
	
		//1. 요청정보 추출
		String deptno= req.getParameter("deptno");
		String deptname=req.getParameter("deptname");
		String loc=req.getParameter("loc");
		String telNum=req.getParameter("telNum");
		
		//2.비지니스 메소드 호출
		MyDeptService service = new MyDeptServiceImpl();
		//클라이언트가 입력한 데이터를 DTO로 변환해서 전달
		MyDeptDTO dept = new MyDeptDTO(deptno, deptname, loc, telNum);
		System.out.println("ajax=>"+dept);
		int result =service.register(dept);
		

		
	}
	



}
