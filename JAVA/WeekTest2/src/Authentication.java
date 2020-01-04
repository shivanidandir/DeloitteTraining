
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticateServlet
 */
@WebServlet("/Auth")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		PrintWriter pw=res.getWriter();
		String lid=req.getParameter("loginid");
		String pwd=req.getParameter("password");
		
		if(lid.equals("1010") && pwd.equals("Qwerty")){
			pw.println("<h1>Login Successfull</h1>");
			res.sendRedirect("Search.html");
			}
		
		else
		{
			pw.println("<h1>Login Unsuccessfull..</h1>");
			res.sendRedirect("Home.html");
		}
			
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		doGet(req,res);
	}
}
