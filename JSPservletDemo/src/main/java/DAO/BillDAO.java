package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.Bill;

public class BillDAO extends Conect{
	public BillDAO() {
		super();
	}
	public  ResultSet addBill(Bill i){
		String query="";
        query="insert into hoa_don values ('";
        query=query+i.getIdBill()+"','";
        query=query+i.getIdNv()+"','";
        query=query+i.getNgaymua()+"',";
        query=query+i.getStatus()+",'";
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
	public ResultSet takeIdBill() {
		String query="SELECT id_hd FROM hoa_don ORDER BY id_hd DESC Limit 1";
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
