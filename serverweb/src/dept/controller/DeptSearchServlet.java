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
    		System.out.println("넘왔다네");
    		
    		ArrayList<MyDeptDTO> searchlist= null;
    		    		
    		//비지니스 메소드 call
    		MyDeptService service = new MyDeptServiceImpl();
    		
    		MyDeptDTO dept = new MyDeptDTO();
    		searchlist= new ArrayList<MyDeptDTO>();
    		searchlist= service.search(deptno);
    		
    		//데이터 공유
    		request.setAttribute("searchlist", searchlist);
    		//요청재지정 - 분리해놓은 응답화면이 요청되록 재지정(list.jsp)
    		System.out.println("서치 리스트 넘오옴");
    		RequestDispatcher rd = request.getRequestDispatcher("/dept/deptSearchlist.jsp");
    		rd.forward(request,response);
    		
    	}
    	
    }
