package io.altar.stock.repositories;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PersistenceContext;



public abstract class EntityRepository <T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager entityManager;



	public T save(T entidade) {
		return entityManager.merge(entidade);

	}

	public T findById(Long id) {
		return entityManager.find(getEntityClass(), id);
	}

	public void removeById(Long id) {

		entityManager.remove(id);
	}

	public T updateById(T entidade) {

		return entityManager.merge(entidade);

	}

	
	protected abstract Class<T> getEntityClass();
}
