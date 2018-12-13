package io.altar.stock.model;

import java.io.Serializable;



public class ProductDto  extends baseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	



	private double discountValue;
	private double iva;
	private double pvp;
	
	
	public ProductDto() {}
	

	public double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}
}
