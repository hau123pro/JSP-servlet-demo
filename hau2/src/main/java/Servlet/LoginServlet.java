package Servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BLL.LoginBLL;
import DTO.Account;

/**
 * Servlet implementation class LoginSerlet
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
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher //
		= this.getServletContext().getRequestDispatcher("/login.jsp");

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		LoginBLL check=new LoginBLL();
		Account loginUser=check.checkLogin(user, pass);
		System.out.print(check.err);
		System.out.print(user);
		System.out.print(pass);

		if(loginUser==null) {
			String err=check.err;
			request.setAttribute("error", err);
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/login.jsp");
	        dispatcher.forward(request, response);
		}
		else {
			System.out.print(loginUser);
			session.setAttribute("loginUser", loginUser);
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/index.jsp");
	        dispatcher.forward(request, response);
		}
		
	}
}
