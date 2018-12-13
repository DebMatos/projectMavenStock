package io.altar.stock.model;

public class ShelfDto extends baseEntity{
	
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

		
		public ShelfDto() {}

}
