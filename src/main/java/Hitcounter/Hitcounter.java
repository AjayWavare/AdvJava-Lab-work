package Hitcounter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class Hitcounter
 */
@WebFilter("/*")//this means whole project..
public class Hitcounter extends HttpFilter implements Filter {
   
	/**
	 *
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		ServletContext sctx = request.getServletContext();//here we made the object of servletcontext now we can get values of attribute from any servlet file
		
		Integer hitCounter =(Integer) sctx.getAttribute("hitCounter");
		if(hitCounter==null)
			hitCounter=0;
		hitCounter++;
		sctx.setAttribute("hitCounter",hitCounter);
		chain.doFilter(request, response);//these line needed to move code to next file after filter
	}

	//this filter will invoke whenever we make request from any page of the project...this filter is user here to count the no. of visitores visiting the website 
//in commont terms filter known as interceptor....
}
