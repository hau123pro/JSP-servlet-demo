package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import DTO.Product;
public class Conect {
    protected Connection conn;
     protected String connectionString ="jdbc:mysql://localhost:3306/web";
     protected String user="hellokitty";
     protected String pass="giaduc23042001";
     protected ResultSet rs;
     protected  String query;
    public Conect(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionString,user,pass);
            if(conn != null){
                System.out.println("Sucess!");
            }
            
             
        }catch (ClassNotFoundException ex) {
        	System.out.println(ex.toString());
            }  catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println(ex.toString());
        }
    }
    
   public List<Product> queryProduct(){
	   List<Product> list = new ArrayList<>();
       String sql="SELECT * FROM sanpham limit 9";
       try {
		PreparedStatement pstm = conn.prepareStatement(sql);
		rs=pstm.executeQuery();
		
       
       try {
           while(rs.next()){
           	list.add(new Product(rs.getString("ID"),rs.getString("Loai"),rs.getString("Hinh"),rs.getString("Tensp"),rs.getInt("Gia"),rs.getInt("soluong"),rs.getString("Hinh_ct")));
           }
            }
            catch (SQLException ex) {
       }
       return list;
       } catch (SQLException e) {
			return null;
		}
   }
    public static void main(String args[]) {
        Conect ab=new Conect();
        List<Product> list = new ArrayList<>();
    	list=ab.queryProduct();
    	for(Product i:list)
    	System.out.print(i.getTensp());
    }
}