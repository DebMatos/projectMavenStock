package io.altar.stock.repositories;

import io.altar.stock.model.Product;

public class ProductRepository  extends EntityRepository <Product> {

	private static final ProductRepository  INSTANCE= new ProductRepository();
	
	private ProductRepository() {}
	
	public static ProductRepository getInstance(){
		return INSTANCE;
	}
	
	

	
}
