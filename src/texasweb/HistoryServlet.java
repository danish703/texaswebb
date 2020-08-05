package texasweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HistoryServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter writer = res.getWriter();
		Cookie cookies[] = req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("area") || c.getName().equals("circumference")) {
				double b = Double.parseDouble(c.getValue());
				writer.println(c.getName()+" = "+b);
			}
		}
		writer.println("this is past history");
		
	}

}
