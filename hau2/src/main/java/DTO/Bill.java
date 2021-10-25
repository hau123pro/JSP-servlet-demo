package DTO;

public class Bill {
 private String idBill;
 private String idNv;
 private String Ngaymua;
 private String status;
 private int tongtien;
 public Bill(String idbill,String idnv,String date,String stt,int price) {
	 this.idBill=idbill;
	 this.idNv=idnv;
	 this.Ngaymua=date;
	 this.status=stt;
	 this.tongtien=price;
 }
 public String getIdBill() {
	 return idBill;
 }
 public void setIdBill(String idbill) {
	 this.idBill=idbill;
 }
 public String getIdNv() {
	 return idNv;
 }
 public void setIdNv(String idnv) {
	 this.idNv=idnv;
 }
 public String getNgaymua() {
	 return Ngaymua;
 }
 public void setNgaymua(String date) {
	 this.Ngaymua=date;
 }
 public String getStatus() {
	 return status;
 }
 public void setStatus(String status) {
	 this.status=status;
 }
 public int getPrice() {
	 return tongtien;
 }
 public void setPrice(int price) {
	 this.tongtien=price;
 }
}
