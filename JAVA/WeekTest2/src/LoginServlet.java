import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PrintWriter out;
	User1 u;
	USerdao UDao;
	    
    public LoginServlet() {
        super();
        UDao=new USerdao();

        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		out=response.getWriter();
		String uid=request.getParameter("loginid");
		String password=request.getParameter("password");
		String email="";
		
		u=new User1(uid, password, email);
		boolean ra=UDao.validateUser(u);
		if(ra==false)
			out.println("<font color=yellow Login Unsucccessful.</font>");
		else{
			out.println("<font color=blue>Login Successful</font>");
			//out.println("Search for a Product <a href='http://localhost:9080/Week2Assessment/search.html'>Click Here</a>");
			//out.println("List all the products<a href='http://localhost:9080/Week2Assessment/getproducts.html'>Click Here</a>");
		}
		//out.println("To Go Back To The Form <a href='http://localhost:9080/Week2Assessment/home.html'>Click Here</a>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		out=response.getWriter();
		String uid=request.getParameter("loginid");
		String password=request.getParameter("password");
		String email=request.getParameter("Email");
		
		u=new User1(uid, password, email);
		
		int ra=UDao.insertUser(u);
		if(ra>0)
			out.println("<font color=yellow>User Registered Succcessfully.</font>");
		else
			out.println("<font color=blue>User not registered.</font>");
		//out.println("To Go Back To The Form <a href='http://localhost:9080/Examples/home.html'>Click Here</a>");
		
	}

}
