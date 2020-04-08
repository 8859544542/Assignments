package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
		    String un=request.getParameter("username");
	        String pw=request.getParameter("password");
	        String r=request.getParameter("rmb");
	       
	        Cookie cUserName = new Cookie("cookuser", un.trim());
	        response.addCookie(cUserName);
	        cUserName.setMaxAge(60 * 60 * 24 * 15);
			Cookie cPassword = new Cookie("cookpass", pw.trim());
			response.addCookie(cPassword);
			cPassword.setMaxAge(60 * 60 * 24 * 15);
			if(r!=null)
			{
			Cookie cRemember = new Cookie("cookrem", r.trim());
			response.addCookie(cRemember);
			cRemember.setMaxAge(60 * 60 * 24 * 15);
			}
			// 15 days
			
			
			
		
			
	        
	        out.print("<form action='InformationServlet'>");  
	        out.print("<input type='submit' value='Get Data'>");  
	        out.print("</form>");  
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
