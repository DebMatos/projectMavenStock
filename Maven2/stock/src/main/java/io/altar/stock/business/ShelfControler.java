package io.altar.stock.business;

import java.util.ArrayList;
import java.util.Iterator;

import javax.inject.Inject;

import io.altar.stock.model.Product;
import io.altar.stock.model.Shelf;
import io.altar.stock.repositories.ProductRepository;
import io.altar.stock.repositories.ShelfRepository;

public class ShelfControler {
	@Inject
	protected ProductRepository repository;

	

	
	
	
	public static String createShelf(String capacity, double rentPrice) {
		
		Shelf shelf= new Shelf( capacity, rentPrice);
		shelfRepository.save(shelf);
		return shelf.toString();
	}
	
public static Shelf createShelfWhithProduct( String capacity, double rentPrice, Long id) {
		
		
		
		Shelf prateleira=new Shelf(capacity, id, rentPrice);
		
		shelfRepository.save(prateleira);
		
		Product produto = productRepository.findById(id);
		
		ArrayList<Long> shelvesIds = new ArrayList<Long>();
		if(produto.getShelvesId()==null) {
		shelvesIds.add(id);
		
		produto.setShelvesId(shelvesIds);
		
		return prateleira;	
		}else {
	     shelvesIds=produto.getShelvesId();
	     shelvesIds.add(id);
			
			produto.setShelvesId(shelvesIds);
	 	return prateleira;	
	     }
		
	
}
	public static ArrayList<String> getAllShelves() {

		ArrayList<String> prateleiras = new ArrayList<String>();
		Iterator<Shelf> it = shelfRepository.getAll();
		while (it.hasNext()) {
			String shelf = it.next().toString();
			prateleiras.add(shelf);
		}
		return prateleiras;
	}
	public static ArrayList<Long> getAllShelvesIds() {
 
		ArrayList<Long> prateleiras = new ArrayList<Long>();
		Iterator<Shelf> it = shelfRepository.getAll();
		while (it.hasNext()) {
			Long ids = it.next().getId();
			prateleiras.add(ids);
		}
		return prateleiras;
	}
	
	
	public static Shelf UpdateShelf(Long id, String capacity, double rentPrice, Long prodId) {
		Shelf shelfAEditar = shelfRepository.findById(id);
		shelfAEditar.setCapacity(capacity);
		shelfAEditar.setRentPrice(rentPrice);
		shelfAEditar.setProduct(prodId);
			shelfRepository.updateById(shelfAEditar);
		return shelfAEditar;
	}
	
	public static ArrayList<Long> allProductsIds() {
		
		ArrayList<Long> productIds = new ArrayList<Long>();
		Iterator<Product> it = productRepository.getAll();
		while (it.hasNext()) {
			Long ids = it.next().getId();
			productIds.add(ids);
			
			
			
		
		}
	
	return productIds;
	
	
	
}
}