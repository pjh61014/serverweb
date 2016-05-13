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
 * Servlet implementation class AjaxdeptRead
 */
@WebServlet(name = "ajaxlist", urlPatterns = {"/ajaxlist.do"})
public class AjaxdeptList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse res)
				throws ServletException, IOException {
			ArrayList<MyDeptDTO> list= null;
			req.setCharacterEncoding("euc-kr");
			
			
			//비지니스 메소드 call
			MyDeptService service = new MyDeptServiceImpl();
			
			MyDeptDTO detp = new MyDeptDTO();
			list= new ArrayList<MyDeptDTO>();
			list= service.select();
			 
			for(int i=0; i<list.size(); i++){
				System.out.println(list.get(i).getDeptno()+" "+list.get(i).getDeptname()+""+list.get(i).getLoc()+" "+list.get(i).getTelNum());
			}
			//데이터 공유
			req.setAttribute("deptlist", list);
			//요청재지정 - 분리해놓은 응답화면이 요청되록 재지정(list.jsp)
			RequestDispatcher rd = req.getRequestDispatcher("/ajax/ajaxlist.jsp");
			rd.forward(req,res);
		/*	PrintWriter pw = res.getWriter();
			
			
			
		
				list= new ArrayList<MyDeptDTO>();
				Dept dao =  new  Dept();
				list =dao.select();
				//
				for(int i=0; i<list.size();i++)
				{	MyDeptDTO dept = deptlist.get(i);
					pw.print("<tr>");
					pw.print("<td>"+dept.getDeptno()+"</td>");
					pw.print("<td>"+dept.getDeptname()+"</td>");
					
					pw.print("<td>"+dept.getLoc()+"</td>");
					pw.print("<td>"+dept.getTelNum()+"</td>");
					pw.print("</tr>");
				}
				
		
				// TODO Auto-generated catch block
			
			pw.print("<table border =1 style ='border-collapse:collapse'>");
			pw.print("<tr>");
			pw.print("<th>부서번호</th><th>부서명</th><th>위치</th><th>전화번호</th>"); 
			pw.print("<th>삭제</th>"); 
			pw.print("</tr>");
			
			
			for(int i=0; i<list.size();i++)
			{		MyDeptDTO dept =list.get(i);
					pw.print("<tr>");
					pw.print("<td>"+dept.getDeptno()+"</td>");
					pw.print("<td>"+dept.getDeptname()+"</td>");
					pw.print("<td>"+dept.getLoc()+"</td>");
					pw.print("<td>"+dept.getTelNum()+"</td>");
					pw.print("<td><a href='/serverweb/del.do?deptno="+dept.getDeptno()+"'>삭제</a></td>");
					pw.print("</tr>");
				}
			pw.print("<tr>");
				pw.print("<td>"+list.get(i).getDeptno()+"</td>");
				pw.print("<td>"+list.get(i).getDeptname()+"</td>");
				
				pw.print("<td>"+list.get(i).getLoc()+"</td>");
				pw.print("<td>"+list.get(i).getTelNum()+"</td>");
				
				pw.print("</tr>");
			}
				
			pw.print("</table>");*/
			
		

		
	}


}
