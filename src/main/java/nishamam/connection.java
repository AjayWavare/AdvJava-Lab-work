package nishamam;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connection")
public class connection extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid=Integer.parseInt(request.getParameter("empid"));
		String empname=request.getParameter("empname");
		

		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");//driver package
			//advjava is database created and cdac is password for root user
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","cdac");//connecction code
			PreparedStatement st = conn.prepareStatement("insert into emp(empid,empname)values(?,?)");
			st.setInt(1, empid); 
			st.setString(2, empname); 
			st.executeUpdate();
			conn.close();
		 }
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>data inserted</h1>");
		out.write("</body></html>");
	}

}
