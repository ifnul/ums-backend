package com.optigra.funnypictures.dao;

public interface Dao<E,T> {

	E findById(T id);
	
	void save(E entity);
	
	void update(E entity);
	
	void delete(E entity);
	
}
