package DTO;

public class CtHd {
	private String idBill;
	private String idProduct;
	private String Tensp;
	private int Count;
	private int Price;
	public CtHd(String idbill,String idsp,String tensp,int sl,int price) {
		 this.idBill=idbill;
		 this.idProduct=idsp;
		 this.Tensp=tensp;
		 this.Count=sl;
		 this.Price=price;
	 }
	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idbill) {
		this.idBill=idbill;
	}
	public String getIdSp() {
		return idProduct;
	}
	public void setIdSp(String idsp) {
		this.idProduct=idsp;
	}
	public String getTensp() {
		return Tensp;
	}
	public void setTensp(String tensp) {
		this.Tensp=tensp;
	}
	public int getCount() {
		 return Count;
	 }
	 public void setCount(int count) {
		 this.Count=count;
	 }
	 public int getPrice() {
		 return Price;
	 }
	 public void setPrice(int price) {
		 this.Price=price;
	 }
}
