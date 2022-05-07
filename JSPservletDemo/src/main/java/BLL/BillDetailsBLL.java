package BLL;

import java.sql.ResultSet;
import java.util.List;

import DAO.BillDAO;
import DAO.BillDetailsDAO;
import DTO.Account;
import DTO.CtHd;
import DTO.Product;

public class BillDetailsBLL {
	public ResultSet rs;
	CtHd ctBill;
	BillDetailsDAO billdetailsdao=new BillDetailsDAO();
	public ResultSet addBillDetail(List<Product> cart,String idBill) {
		for (Product i: cart) {
			ctBill=new CtHd(idBill,i.getID(),i.getTensp(),i.getSoluong(),i.getGia()*i.getSoluong());
			rs=billdetailsdao.addBillDetail(ctBill);
		}
		
		return rs;
	}
}
