package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BLL.BillBLL;
import DTO.Account;
import DTO.Product;

/**
 * Servlet implementation class PurchaseServlet
 */
@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		Account loginUser=(Account)session.getAttribute("loginUser");
		List<Product> Cart=(List<Product>)session.getAttribute("cart");
		BillBLL getBill=new BillBLL();
		if(loginUser==null) {
			RequestDispatcher dispatcher //
			= this.getServletContext().getRequestDispatcher("/login.jsp");

			dispatcher.forward(request, response);
		}
		else {
			if(getBill.addBill(Cart, loginUser)==true) {
				session.removeAttribute("cart");
				RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/index.jsp");

				dispatcher.forward(request, response);
			}
			else {
				RequestDispatcher dispatcher //
				= this.getServletContext().getRequestDispatcher("/cart.jsp");

				dispatcher.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
