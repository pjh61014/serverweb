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
		//1. 실제 업로드될 폴더의 경로를 구한다. - 서버가 인식하는 위치 
		//===> ServletContext객체(Context에 대한 정보를 담고 있고, 할 수 있는 기능을 지원)
		
		ServletContext context = getServletContext();
		realFolder = context.getRealPath(saveFolder);
		System.out.println(realFolder);
		
		//2. cos.jar에서 지원하는 MultipartRequest객체만 생성하면 파일업로드가 완료
		// 요청객체, 실제 저장될 서버가 인식하는 위치. 파일사이즈, 인코딩
		// FIleRenamePolicy객체를 생성해서 전달
		// FIleRenamePolicy객체는 동일한 파일명이 업로되는 경우 파일명을 어떻게 변경할지를 적용할 객체로 실체 파일명 뒤에 1,2,..등 숫자가 시퀀스하게 
		//추가된다.
		
		MultipartRequest multipart = new MultipartRequest(request, realFolder, size, encType, new DefaultFileRenamePolicy());
		
		//3.파일정보 추출
		Enumeration<String> files = multipart.getFileNames();
		while(files.hasMoreElements()){
			String file = files.nextElement();
			System.out.println(file);
			System.out.println(multipart.getFilesystemName(file));
			System.out.println(multipart.getOriginalFileName(file));
		}
		//4. 다른 요청정보 추출하기 - 파일 업로드를 진행하는 경우에는 무조건 MultipartRequest의 getparameter를 이용해서
		// 요청정보를 추출한다.
		System.out.println("사용자명: "+multipart.getParameter("user"));
		System.out.println("제목: "+multipart.getParameter("title"));
		
	}

}
