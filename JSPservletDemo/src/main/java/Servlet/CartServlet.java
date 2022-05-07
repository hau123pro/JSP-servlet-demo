package Servlet;



import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BLL.CartBLL;
import DTO.Product;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher //
		= this.getServletContext().getRequestDispatcher("/cart.jsp");

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String id=request.getParameter("ID");
		String type=request.getParameter("type");
		CartBLL cart=new CartBLL();
		List<Product> Cart=(List<Product>)session.getAttribute("cart");
		List<Product> newCart=null;
		if(type.equals("add")) {
			newCart=cart.addToCart(Cart, id);
			if(newCart==null) {
				response.setContentType("text/plain");
		        response.setCharacterEncoding("UTF-8");
		        response.getWriter().print("Số lượng ko đủ đáp ứng");
			}
			else {
				response.setContentType("text/plain");
		        response.setCharacterEncoding("UTF-8");
		        response.getWriter().print("thêm thành công");
			}
		}
		else if(type.equals("cong")) {
			newCart=cart.buttonCongTruCart(Cart, id, type);
			if(newCart==null) {
				response.setContentType("text/plain");
		        response.setCharacterEncoding("UTF-8");
		        response.getWriter().print("Số lượng ko đủ đáp ứng");
			}
		}
		else if(type.equals("tru")) {
			newCart=cart.buttonCongTruCart(Cart, id, type);
		}
		else if(type.equals("change")) {
			int soluong=Integer.parseInt(request.getParameter("soluong"));
			newCart=cart.inputChangeCart(Cart, id, soluong);
		}
		else if(type.equals("xoa")) {
			newCart=cart.deletePrCart(Cart, id);
		}
		if(newCart!=null) {
			session.setAttribute("cart", newCart);	
		}
		
	}

}
