package io.altar.stock.repositories;

import io.altar.stock.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf>{
		private static final ShelfRepository  INSTANCE= new ShelfRepository();
		
		public static ShelfRepository getInstance(){
			return INSTANCE;
		}
		
		
		private ShelfRepository(){}


		@Override
		protected Class<Shelf> getEntityClass() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		protected String getAllEntityQueryName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

