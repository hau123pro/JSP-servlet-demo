package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDAO extends Conect{
	public LoginDAO() {
		super();
	}
	public ResultSet findUser(String user,String pass) {
		String sql="SELECT * from tai_khoan where username=? and password=?";
		PreparedStatement pstm;
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, pass);
			rs=pstm.executeQuery();
			return rs;
		} catch (SQLException e) {
			return null;
		}
	}
}
