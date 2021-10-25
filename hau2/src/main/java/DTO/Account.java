package DTO;

public class Account {
	private String ID;
	private String userName;
	private String passWord;
	private String hoTen;
	private String ngaySinh;
	private String soDienThoai;
	private String gioiTinh;
	private String email;
	private String diaChi;
	private String status;
	private String power;
	public Account() {
		
	}
	public Account(String id,String user,String pass,String hoten,String ngaysinh,String sdt,String sex,String email,String dchi,String stt,String power) {
		this.ID=id;
		this.userName=user;
		this.passWord=pass;
		this.hoTen=hoten;
		this.ngaySinh=ngaysinh;
		this.soDienThoai=sdt;
		this.gioiTinh=sex;
		this.email=email;
		this.diaChi=dchi;
		this.status=stt;
		this.power=power;
	}
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		this.ID=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String user) {
		this.userName=user;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String pass) {
		this.passWord=pass;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoten) {
		this.hoTen=hoten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaysinh) {
		this.ngaySinh=ngaysinh;
	}
	public String getSdt() {
		return soDienThoai;
	}
	public void setSdt(String sdt) {
		this.soDienThoai=sdt;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String sex) {
		this.gioiTinh=sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDiaChi(String dchi) {
		this.diaChi=dchi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setStatus(String stt) {
		this.status=stt;
	}
	public String getStatus() {
		return status;
	}
	public void setPower(String power) {
		this.power=power;
	}
	public String getPower() {
		return power;
	}
	
}
