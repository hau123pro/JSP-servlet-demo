package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.CtHd;

public class BillDetailsDAO extends Conect{
	public BillDetailsDAO() {
		super();
	}
	public  ResultSet addBillDetail(CtHd i){
		String query="";
        query="insert into ct_hoadon values ('";
        query=query+i.getIdBill()+"','";
        query=query+i.getIdSp()+"','";
        query=query+i.getTensp()+"',";
        query=query+i.getCount()+",'";
        query=query+i.getPrice()+"')";
        PreparedStatement pstm;
        try {
			pstm = conn.prepareStatement(query);
			 rs=pstm.executeQuery();
			 return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
       
    }

}
