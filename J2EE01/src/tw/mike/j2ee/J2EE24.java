package tw.mike.j2ee;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J2EE24
 */
@WebServlet("/J2EE24")
public class J2EE24 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=UTF-8");�^�����ɮ���������r���

		response.setContentType("image/jpeg");//�^�����ɮ�����
		
		String rate = request.getParameter("rate");
		float rate1 = Float.parseFloat(rate);
		
		BufferedImage bimg = new BufferedImage(400, 20, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = bimg.createGraphics();
		
		
		
		g2d.setColor(Color.blue);
		g2d.fillRect(0, 0, 400, 20);
		g2d.setColor(Color.red);
		g2d.fillRect(0, 0, (int)(400*rate1)/100, 20);
		
		//Output
		
		OutputStream out =  response.getOutputStream();
		ImageIO.write(bimg, "jpeg", out);
		out.flush();
		out.close();
		
		
		
	}
	
}
