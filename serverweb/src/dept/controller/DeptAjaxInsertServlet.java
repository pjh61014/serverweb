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
	
		//1. ��û���� ����
		String deptno= req.getParameter("deptno");
		String deptname=req.getParameter("deptname");
		String loc=req.getParameter("loc");
		String telNum=req.getParameter("telNum");
		
		//2.�����Ͻ� �޼ҵ� ȣ��
		MyDeptService service = new MyDeptServiceImpl();
		//Ŭ���̾�Ʈ�� �Է��� �����͸� DTO�� ��ȯ�ؼ� ����
		MyDeptDTO dept = new MyDeptDTO(deptno, deptname, loc, telNum);
		System.out.println("ajax=>"+dept);
		int result =service.register(dept);
		

		
	}
	



}
