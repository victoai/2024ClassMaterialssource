package w01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/requestIinfo")
public class 요청정보얻어오기  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
		   
		  //프로토콜 
		 String scheme =   req.getScheme() ;		 
		 //프로토콜 버전
		 String protocol = req.getProtocol() ;		 
		 //parameter?
		 //클라이언트가 서버쪽에 보낸 데이터 얻어오기
		 String name=  req.getParameter( "name" ); 		 
		 //프로젝트명(하나의 웹서비스)   얻어오기  
		 String contextPath = req.getContextPath(); 
		 
	
		 //서버이름 얻어오기
		 String serverName  = req.getServerName();
		 //서블릿경로 얻어오기 ( 서블릿이름)
		 String servletPath   = req.getServletPath();
		 
		 System.out.println( scheme);
		 System.out.println( protocol);
		 System.out.println( name);
		 System.out.println( contextPath);
		 System.out.println( serverName);
		 System.out.println( servletPath);		 
	
	}
	
	

}
