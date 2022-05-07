package BLL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.Conect;
import DAO.LoginDAO;
import DTO.Account;

public class LoginBLL {
	public Account loginUser;
	public String err="";
	public ResultSet rs;
	LoginDAO Login=new LoginDAO();
	public LoginBLL() {
		
	}
	public Account checkLogin(String user,String pass) {
		rs=Login.findUser(user, pass);
		try {
			if(rs.next()) {
				loginUser=new Account(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11));
				return loginUser;
			}
			err="Tai khoan hoac mat khau khong dung";
			return null;
			
		} catch (SQLException e) {
			err=e.getMessage();
			return null;
		}
		
		
	}
}
