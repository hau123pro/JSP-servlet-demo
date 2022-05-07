package BLL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.Conect;
import DAO.ProductDAO;
import DTO.Product;

public class ProductBLL {
	List<Product> list;
	ProductDAO product=new ProductDAO();
	public ResultSet rs;
	public ProductBLL() {
		
	}
	public List<Product> ProductList() {
		 list = new ArrayList<>();
	       rs=product.getListPr();
	       try {
	           while(rs.next()){
	           	list.add(new Product(rs.getString("ID"),rs.getString("Loai"),rs.getString("Hinh"),rs.getString("Tensp"),rs.getInt("Gia"),rs.getInt("soluong"),rs.getString("Hinh_ct")));
	           }
	       return list;
	       } catch (SQLException e) {
				return null;
			}	
	}
	public Product findProduct(String masp) {
		Product find=null;
		rs=product.getPr(masp);
		try {
			if(rs.next()) {
				find=new Product(rs.getString("ID"),rs.getString("Loai"),rs.getString("Hinh"),rs.getString("Tensp"),rs.getInt("Gia"),rs.getInt("soluong"),rs.getString("Hinh_ct")); 
			}
			return find;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
	
}
