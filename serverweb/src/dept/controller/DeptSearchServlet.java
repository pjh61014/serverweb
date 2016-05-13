package dept.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dto.MyDeptDTO;
import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;

/**
 * Servlet implementation class DeptSearchServlet
 */
@WebServlet(name = "search", urlPatterns = { "/search.do" })
public class DeptSearchServlet extends HttpServlet {
	
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		request.setCharacterEncoding("euc-kr");
    		String deptno= request.getParameter("search");
    		System.out.println("�ѿԴٳ�");
    		
    		ArrayList<MyDeptDTO> searchlist= null;
    		    		
    		//�����Ͻ� �޼ҵ� call
    		MyDeptService service = new MyDeptServiceImpl();
    		
    		MyDeptDTO dept = new MyDeptDTO();
    		searchlist= new ArrayList<MyDeptDTO>();
    		searchlist= service.search(deptno);
    		
    		//������ ����
    		request.setAttribute("searchlist", searchlist);
    		//��û������ - �и��س��� ����ȭ���� ��û�Ƿ� ������(list.jsp)
    		System.out.println("��ġ ����Ʈ �ѿ���");
    		RequestDispatcher rd = request.getRequestDispatcher("/dept/deptSearchlist.jsp");
    		rd.forward(request,response);
    		
    	}
    	
    }
