package day1.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex03")
public class Ex03  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	 
	 
		
	
		
		PrintWriter out = response.getWriter();		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		 
		out.println("<3 dan>");
		
		for( int i=1; i<=9; i++) {
			
			out.println(3*i  +"<br>");
		}
		
		out.println("</body>");
		out.println("</html>");		
		
	}

}
