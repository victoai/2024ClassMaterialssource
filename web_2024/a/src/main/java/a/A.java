package a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class A   extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		
		
		req.getRequestDispatcher("WEB-INF/views/a.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String result="2";
		if(result.equals("1")) {
			
			//
			
		}else {
			
			req.setAttribute("a", "a");
			req.getRequestDispatcher("WEB-INF/views/a.jsp").forward(req, resp);
		}
		 
	}
}
