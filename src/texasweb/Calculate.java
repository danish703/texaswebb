package texasweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculate extends HttpServlet{
  
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int r = Integer.parseInt(req.getParameter("radius"));
		double area = 3.14*r*r;
		double circumference = 2*3.14*r;
		PrintWriter out = res.getWriter();
		out.println("Area = "+area+" and Circumference = "+circumference);
	}
}
