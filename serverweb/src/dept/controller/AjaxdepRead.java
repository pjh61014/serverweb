package dept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import dept.dto.MyDeptDTO;
import dept.service.MyDeptService;
import dept.service.MyDeptServiceImpl;

/**
 * Servlet implementation class AjaxdepRead
 */
@WebServlet(name = "AjaxdeptRead", urlPatterns = { "/ajaxread.do" })
public class AjaxdepRead extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptno =request.getParameter("deptno");
		response.setContentType("application/json;charset=utf-8");
		MyDeptService service = new MyDeptServiceImpl();
		MyDeptDTO dto = service.read(deptno);
		System.out.println(deptno);
		JSONObject myjson = new JSONObject();
		myjson.put("deptno", dto.getDeptno());
		myjson.put("deptname", dto.getDeptname());
		myjson.put("loc", dto.getLoc());
		myjson.put("telNum",dto.getTelNum());
		System.out.println(myjson.toJSONString());
		PrintWriter pw = response.getWriter();
		pw.print(myjson.toJSONString());
	}

}
