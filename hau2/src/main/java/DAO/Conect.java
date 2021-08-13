package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import DTO.Product;
public class Conect {
    protected Connection conn;
     protected String connectionString ="jdbc:mysql://localhost:3306/web";
     protected String user="hellokitty";
     protected String pass="giaduc23042001";
      public Statement stmt;
     public ResultSet rs;
     public  String query;
    public Conect(){
         try {
             Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(connectionString,user,pass);
            if(conn != null){
                System.out.println("Sucess!");
            }
            
             stmt = conn.createStatement();
        }catch (ClassNotFoundException ex) {
        	System.out.println(ex.toString());
            }  catch (SQLException ex) {
            System.out.println(ex.toString());
            System.out.println(ex.toString());
        }
    }
    public boolean a(){
        try {
            // get data from table 'student'
            rs = stmt.executeQuery(query);
            } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    public boolean b(){
        try {
            // get data from table 'student'
            stmt.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.print(ex);
            return false;
        }
        return true;
    }
    public void SetQuery(String a){
        this.query=a;
    }
   public List<Product> queryProduct(){
	   List<Product> list = new ArrayList<>();
       SetQuery("SELECT * FROM sanpham limit 9");
       a();
       try {
           while(rs.next()){
           	list.add(new Product(rs.getString("ID"),rs.getString("Loai"),rs.getString("Hinh"),rs.getString("Tensp"),rs.getInt("Gia"),rs.getInt("soluong"),rs.getString("Hinh_ct")));
           }
            }
            catch (SQLException ex) {
       }
       return list;
   }
    public static void main(String args[]) {
        Conect ab=new Conect();
        ab.SetQuery("SELECT * FROM sanpham limit 9");
        ab.a();
        try {
            while(ab.rs.next()){
            	System.out.print(ab.stmt);
            }
             }
             catch (SQLException ex) {
                 
        }
    }
}