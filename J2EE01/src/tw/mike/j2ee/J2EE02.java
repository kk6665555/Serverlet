package tw.mike.j2ee;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/J2EE02")
public class J2EE02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		Enumeration<String> headers =  request.getHeaderNames();
		
		
		
		while(headers.hasMoreElements()) {
			String header = headers.nextElement();
			String value = request.getHeader(header);
			
			System.out.println(header+":"+value);
			
		}
	}
}
