package io.altar.stock.model;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Product extends baseEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "produtoAlberga")

	
	private ArrayList<Long> shelvesId;
	private double discountValue;
	private double iva;
	private double pvp;
	
	
	public Product() {}
	
	public Product( ArrayList<Long> shelvesId, double discountValue, double iva, double pvp) {
		this.shelvesId = shelvesId;
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product(double discountValue, double iva, double pvp) {
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}

	public ArrayList<Long> getShelvesId() {
		return shelvesId;
	}

	public void setShelvesId(ArrayList<Long> shelvesId) {
		this.shelvesId = shelvesId;
	}
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
	@Override
	public String toString() {
		
		return "Product " +this.getId()+ "[shelvesId=" + shelvesId + ", discountValue=" + discountValue + ", iva=" + iva + ", pvp=" + pvp
				+ "]";
	}

}