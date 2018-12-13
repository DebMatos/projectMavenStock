package io.altar.stock.model;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class Product extends baseEntity{
	
	
	private static final long serialVersionUID = 1L;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "produtoAlberga")

	
	private ArrayList<Shelf> shelves;
	private double discountValue;
	private double iva;
	private double pvp;
	
	
	public Product() {}
	
	public Product( ArrayList<Shelf> shelves, double discountValue, double iva, double pvp) {
		this.shelves = shelves;
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public Product(double discountValue, double iva, double pvp) {
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}

	public ArrayList<Shelf> getShelvesId() {
		return shelves;
	}

	public void setShelvesId(ArrayList<Long> shelvesId) {
		this.shelves = shelves;
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
		
		return "Product " +this.getId()+ "[shelvesId=" + shelves + ", discountValue=" + discountValue + ", iva=" + iva + ", pvp=" + pvp
				+ "]";
	}

}