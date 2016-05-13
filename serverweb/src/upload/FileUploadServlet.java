package upload;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet(name = "upload", urlPatterns = { "/upload.do" })
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ServletConfig, ServletContext
		request.setCharacterEncoding("euc-kr");
		String saveFolder = "/upload";
		String encType="euc-kr";
		int size = 5*1024*1024;
		String realFolder = "";
		//1. ���� ���ε�� ������ ��θ� ���Ѵ�. - ������ �ν��ϴ� ��ġ 
		//===> ServletContext��ü(Context�� ���� ������ ��� �ְ�, �� �� �ִ� ����� ����)
		
		ServletContext context = getServletContext();
		realFolder = context.getRealPath(saveFolder);
		System.out.println(realFolder);
		
		//2. cos.jar���� �����ϴ� MultipartRequest��ü�� �����ϸ� ���Ͼ��ε尡 �Ϸ�
		// ��û��ü, ���� ����� ������ �ν��ϴ� ��ġ. ���ϻ�����, ���ڵ�
		// FIleRenamePolicy��ü�� �����ؼ� ����
		// FIleRenamePolicy��ü�� ������ ���ϸ��� ���εǴ� ��� ���ϸ��� ��� ���������� ������ ��ü�� ��ü ���ϸ� �ڿ� 1,2,..�� ���ڰ� �������ϰ� 
		//�߰��ȴ�.
		
		MultipartRequest multipart = new MultipartRequest(request, realFolder, size, encType, new DefaultFileRenamePolicy());
		
		//3.�������� ����
		Enumeration<String> files = multipart.getFileNames();
		while(files.hasMoreElements()){
			String file = files.nextElement();
			System.out.println(file);
			System.out.println(multipart.getFilesystemName(file));
			System.out.println(multipart.getOriginalFileName(file));
		}
		//4. �ٸ� ��û���� �����ϱ� - ���� ���ε带 �����ϴ� ��쿡�� ������ MultipartRequest�� getparameter�� �̿��ؼ�
		// ��û������ �����Ѵ�.
		System.out.println("����ڸ�: "+multipart.getParameter("user"));
		System.out.println("����: "+multipart.getParameter("title"));
		
	}

}
