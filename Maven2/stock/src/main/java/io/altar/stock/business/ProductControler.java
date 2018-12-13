package io.altar.stock.business;

import java.util.ArrayList;
import java.util.Iterator;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.stock.model.Product;
import io.altar.stock.model.Shelf;
import io.altar.stock.repositories.ProductRepository;
import io.altar.stock.repositories.ShelfRepository;

public class ProductControler {
	
	
	@Inject
	private static ProductRepository productRepository;
	
	@Transactional
	public static Product createProduct(Product product1) {
		
		productRepository.save(product1);
		return product1;
	}
	 

	static ShelfRepository shelfRepository = ShelfRepository.getInstance();



	public static Product createProduct(double discountValue, double iva, double pvp) {

		Product produto = new Product(discountValue, iva, pvp);
		productRepository.save(produto);
		return produto;
	}
	
	public static Product createProductWhithShelf( double discountValue, double iva, double pvp, Long id) {
		
		ArrayList<Long> shelves = new ArrayList<Long>();
		//shelvesIds=allShelvesIds();
		shelves.add(id);
		Product produto = new Product(shelves, discountValue, iva, pvp);
		productRepository.save(produto);
		
		Shelf shelf = shelfRepository.findById(id);
		
		shelf.setProduct(produto.getId());
		
		return produto;
	}
	
	public boolean hasIdInShelf(Long id) {
		if (shelfRepository.findById(id) == null) {
			return false;
		} else
			return true;
	}

	
	public static ArrayList<Long> allShelvesIds() {
		
			ArrayList<Long> shelvesIds = new ArrayList<Long>();
			Iterator<Shelf> it = shelfRepository.getAll();
			while (it.hasNext()) {
				Long ids = it.next().getId();
				shelvesIds.add(ids);
			}
		
		return shelvesIds;
		
	}
	public static ArrayList<String> getAllProducts() {

		ArrayList<String> produtos = new ArrayList<String>();
		Iterator<Product> it = productRepository.getAll();
		while (it.hasNext()) {
			String produto = it.next().toString();
			produtos.add(produto);
		}
		return produtos;
	}
}