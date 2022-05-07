package BLL;

import java.util.ArrayList;
import java.util.List;
import DTO.Product;


public class CartBLL {
	public CartBLL() {
		
	}
	public List<Product> addToCart(List<Product> list,String maSP){
		ProductBLL find=new ProductBLL();
		Product sp=find.findProduct(maSP);
		if(sp!=null&&sp.getSoluong()>0) {
			if(list!=null) {
				for(Product i:list) {
					if(i.getID().equals(sp.getID())) {
						if(i.getSoluong()<sp.getSoluong())
						{
							i.setSoluong(i.getSoluong()+1);
							return list;
						}
						else {
							return null;
						}
					}
				}
				sp.setSoluong(1);
				list.add(sp);
				return list;
			}
			list=new ArrayList<Product>();
			sp.setSoluong(1);
			list.add(sp);
			return list;
		}
	 return null;
	}
	public List<Product> buttonCongTruCart(List<Product> list,String maSP,String type){
		ProductBLL find=new ProductBLL();
		Product sp=find.findProduct(maSP);
		if(sp!=null&&sp.getSoluong()>0) {
			if(list!=null) {
				for(Product i:list) {
					if(i.getID().equals(sp.getID())) {
						if(type.equals("cong")) {
							if(i.getSoluong()<sp.getSoluong())
							{
								i.setSoluong(i.getSoluong()+1);
								return list;
							}
							else {
								return null;
							}
						}
						else if(type.equals("tru")) {
							if(i.getSoluong()>1)
							{
								i.setSoluong(i.getSoluong()-1);
								return list;
							}
							else {
								return null;
							}
						}
					}
				}
			}
		}
		return null;
	}
	public List<Product> inputChangeCart(List<Product> list,String maSP,int sluong){
		ProductBLL find=new ProductBLL();
		Product sp=find.findProduct(maSP);
		if(sp!=null&&sp.getSoluong()>0) {
			if(list!=null) {
				for(Product i:list) {
					if(i.getID().equals(sp.getID())) {
						if(sluong<=sp.getSoluong()) {
							i.setSoluong(sluong);
							return list;
						}
						else return list;
					}
				}
			}
		}
		return null;
	}
	public List<Product> deletePrCart(List<Product> list,String maSP){
		ProductBLL find=new ProductBLL();
		Product sp=find.findProduct(maSP);
			if(list!=null) {
				for(Product i:list) {
					if(i.getID().equals(sp.getID())) {
						
						list.remove(i);
						return list;
					}
				}
			}
		return null;
	}
}
