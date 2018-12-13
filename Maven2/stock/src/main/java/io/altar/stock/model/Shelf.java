package io.altar.stock.model;

import javax.persistence.Entity;

@Entity
public class Shelf extends baseEntity {
	private static final long serialVersionUID = 1L;

	private String capacity;
	private Product product;
	private double rentPrice;

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Shelf(String capacity,Product product, double rentPrice) {

		this.capacity = capacity;
		this.product = product;
		this.rentPrice = rentPrice;
	}

	public Shelf(String capacity, double rentPrice) {

		this.capacity = capacity;

		this.rentPrice = rentPrice;
	}
	public Shelf() {}

	@Override
	public String toString() {
		return "Shelf " + getId() + "[capacity=" + capacity + ", productId=" + product + ", rentPrice=" + rentPrice
				+ "]";
	}

}