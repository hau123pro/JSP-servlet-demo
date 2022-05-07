package BLL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import DAO.BillDAO;
import DTO.Account;
import DTO.Bill;
import DTO.Product;

public class BillBLL {
	public ResultSet rs;
	public ResultSet rsct;
	BillDAO billdao=new BillDAO();
	BillDetailsBLL ctBill=new BillDetailsBLL();
	Bill bill;
	public boolean addBill(List<Product> cart,Account user) {
		int tong =0;
		for (Product i: cart) {
			tong=tong+i.getGia()*i.getSoluong();
		}
		rs=billdao.takeIdBill();
		String idbill="";
			try {
				if(rs.next()) {
				 bill=new Bill(rs.getString(1), user.getID(), "0/0/0000", "Not Process", tong);
				 idbill=rs.getString(1);
				}
				else {
				 bill=new Bill("10001", user.getID(), "0/0/0000", "Not Process", tong);
				idbill="10001";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		rs=billdao.addBill(bill);
		rsct=ctBill.addBillDetail(cart, idbill);
		if(rs!=null&&rsct!=null)
		return true;
		else return false;
	}
}
