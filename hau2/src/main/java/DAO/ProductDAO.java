package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO extends Conect{
	public ProductDAO() {
		super();
	}
	public ResultSet getListPr() {
		String sql="SELECT * FROM sanpham limit 9";
		 try {
				PreparedStatement pstm = conn.prepareStatement(sql);
				rs=pstm.executeQuery();
				return rs;
		 } catch (SQLException e) {
				return null;
			}	
	}
	public ResultSet getPr(String maSp) {
		String sql="SELECT * FROM sanpham where ID=?";
		 try {
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, maSp);
				rs=pstm.executeQuery();
				return rs;
		 } catch (SQLException e) {
				return null;
			}	
	}
}
