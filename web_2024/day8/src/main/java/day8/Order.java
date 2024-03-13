package day8;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/order")
public class Order extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		
		
		//로그인 확인
		
		HttpSession session  = req.getSession();		
		String id  = (String) session.getAttribute("id");
		
		if( id != null) {
			
			req.getRequestDispatcher("WEB-INF/views/order.jsp").forward(req, resp);
		}else {
			resp.sendRedirect("/day8/login");
		}
		
		
	}
}
