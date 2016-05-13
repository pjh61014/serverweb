package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet (){
		System.out.println("LifeCycleServlet객체 생성...");
	}
	
	public void init(){
		System.out.println("init....서블릿객체 초기화 작업");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("service...ㅇㅇ 실제 웹에서 처리하고 싶은 일을 정의하는 메소드"+req.getMethod());
		//get방식으로 요청되면 doget을 호출하고 post방식으로 요청되면 dopost메소드를 호출 
		if(req.getMethod().equals("GET")){
			System.out.println("넘어왔다네");
			doGet(req, res);
		}else{
			doPost(req, res);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("doGet...ㅇㅇ 실제 웹에서 처리하고 싶은 일을 정의하는 메소드");
		
	}
	 
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("doPost...ㅇㅇ 실제 웹에서 처리하고 싶은 일을 정의하는 메소드");
	}
	
	public void destroy(){
		System.out.println("destroy ... 서블릿객체가 소멸될때 호출되는 메소드");
	}

}
