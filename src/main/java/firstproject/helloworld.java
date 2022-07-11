package firstproject;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/helloworld")
public class helloworld extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();

		out.write("<html><body>");
		out.write("<h1>hello world</h1>");
		out.write("<h2>today's date is" + LocalDate.now() + "</h2>");
		out.write("</html></body>");
		
	
	
	}

	
}
