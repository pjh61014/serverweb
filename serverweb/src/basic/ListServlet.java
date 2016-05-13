package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dto.MyDeptDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ArrayList<MyDeptDTO> list= null;
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");

		PrintWriter pw = res.getWriter();
		
		
	
			list= new ArrayList<MyDeptDTO>();
			Dept dao =  new  Dept();
			list =dao.select();
			//
		/*	for(int i=0; i<list.size();i++)
			{	MyDeptDTO dept = deptlist.get(i);
				pw.print("<tr>");
				pw.print("<td>"+dept.getDeptno()+"</td>");
				pw.print("<td>"+dept.getDeptname()+"</td>");
				
				pw.print("<td>"+dept.getLoc()+"</td>");
				pw.print("<td>"+dept.getTelNum()+"</td>");
				pw.print("</tr>");
			}*/
			
	
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
		/*pw.print("<tr>");
			pw.print("<td>"+list.get(i).getDeptno()+"</td>");
			pw.print("<td>"+list.get(i).getDeptname()+"</td>");
			
			pw.print("<td>"+list.get(i).getLoc()+"</td>");
			pw.print("<td>"+list.get(i).getTelNum()+"</td>");
			
			pw.print("</tr>");
		}*/
			
		pw.print("</table>");
		pw.print("<h1>잘나온데이</h1>");
	}

	

}
