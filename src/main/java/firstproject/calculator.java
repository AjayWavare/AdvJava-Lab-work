package firstproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cal")
public class calculator extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numb1 =Integer.parseInt(request.getParameter("num1"));
		int numb2 =Integer.parseInt(request.getParameter("num2"));
	
	if(request.getParameter("add")!=null)
	{  
		int res=numb1+numb2;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Addition = "+ res +"</h1>");
		out.write("</html></body>");
	}
	else if(request.getParameter("sub")!=null){
			int res=numb1-numb2;
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.write("<html><body>");
			out.write("<h1>Substraction = "+ res +"</h1>");
			out.write("</html></body>");
		}
			
	else if(request.getParameter("mul")!=null){
		int res=numb1*numb2;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Multiplication = "+ res +"</h1>");
		out.write("</html></body>");
	}
	
		
	else {
		int res=numb1/numb2;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Division = "+ res +"</h1>");
		out.write("</html></body>");
	}
		
	
	}

	
}
