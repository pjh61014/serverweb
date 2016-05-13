package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet (){
		System.out.println("LifeCycleServlet��ü ����...");
	}
	
	public void init(){
		System.out.println("init....������ü �ʱ�ȭ �۾�");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("service...���� ���� ������ ó���ϰ� ���� ���� �����ϴ� �޼ҵ�"+req.getMethod());
		//get������� ��û�Ǹ� doget�� ȣ���ϰ� post������� ��û�Ǹ� dopost�޼ҵ带 ȣ�� 
		if(req.getMethod().equals("GET")){
			System.out.println("�Ѿ�Դٳ�");
			doGet(req, res);
		}else{
			doPost(req, res);
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("doGet...���� ���� ������ ó���ϰ� ���� ���� �����ϴ� �޼ҵ�");
		
	}
	 
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		System.out.println("doPost...���� ���� ������ ó���ϰ� ���� ���� �����ϴ� �޼ҵ�");
	}
	
	public void destroy(){
		System.out.println("destroy ... ������ü�� �Ҹ�ɶ� ȣ��Ǵ� �޼ҵ�");
	}

}
