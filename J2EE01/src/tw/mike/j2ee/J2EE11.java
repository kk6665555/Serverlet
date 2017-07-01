package tw.mike.j2ee;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.coyote.http11.filters.BufferedInputFilter;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

import javafx.print.Collation;

@WebServlet("/J2EE11")
@MultipartConfig
public class J2EE11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		counter++;
		response.setContentType("text/htnl;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Part part =  request.getPart("upload");
		
		
		Collection<String> cc = part.getHeaderNames();
		for(String header:cc) {
			String v =part.getHeader(header);
			out.println(header+":"+v+":"+"</br>");
			
		}
		String filename = part.getSubmittedFileName();
		out.println(filename);
		String name =  part.getName(); // html input name
		long size = part.getSize();
		out.println(name + ":" + size);
		
		//讀取資料
		byte[] buf = new byte[(int)size];
		BufferedInputStream bin = new BufferedInputStream(part.getInputStream());
		bin.read(buf);
		bin.close();
		
		ServletContext context = getServletContext();
		Enumeration<String> names = context.getInitParameterNames();
		while(names.hasMoreElements()) {
			String pname = names.nextElement();
			out.print(pname + "=" + context.getInitParameter(pname)+"<br>");
		}
//		File here = new File(".");
//		out.print(here.getAbsolutePath());//取現在的路徑
		
//		FileOutputStream foot = new FileOutputStream("C:\\eclipe j2ee\\Serverlet\\J2EE01\\WebContent\\img" + filename);
//				foot.write(buf);
//		foot.flush();
//		foot.close();
//		
//		out.println(new String(buf));
	}
	
		
		
		protected void dopost(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException{
			doGet(res,resp);
		}

}
