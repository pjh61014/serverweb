package basic;

// ���ϸ� : MemberTestServlet.java
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/member")
public class MemberTestServlet extends HttpServlet{
   String str;
   protected void doGet(HttpServletRequest req,HttpServletResponse res)
           throws ServletException,IOException{
      int number = 0;
      str = req.getParameter("sendmessage");
      res.setContentType("text/html; charset=EUC-KR");
      PrintWriter out = res.getWriter();
      out.println("<html><head><title>MultiThread Test</title></head>");
      out.println("<body><h2>ó�� ���(��� ����)</h2>");
      while (number++ < 10) {
         String strnum = "[" + number + "]";
         out.println("MultiThreadTest : " + str +"  "+ strnum + "<br>");
         out.flush();
         System.out.println("MultiThreadTest : " + str +"  "+ strnum + "<br>");
         try {
            Thread.sleep(1000);
         } catch (Exception e) {
            System.out.println(e);
         }
      }                
      out.println("<h2>Done " + str + " !!</h2>");
      out.println("</body></html>");
      out.close();
   }
}
