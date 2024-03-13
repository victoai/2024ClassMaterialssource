package day8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet{ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		 
		
		
		 
			req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
			 
		 
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//
		
		String  id  = req.getParameter("id");
		String  pw =   req.getParameter("pw");
		
		if( id.equals(pw)) {
			
			//
			
			HttpSession session  =	req.getSession();
			session.setAttribute("id", id);
			
			//로그인 성공
			
			 resp.sendRedirect("day8/main.html");
			
		}else {
			req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
		}
		
	}
}
