package org.lnu.is.dao;

public interface Dao<E, T> {

	/**
	 * Method for finding Entities by Id.
	 * @param id identifier.
	 * @return Entity.
	 */
	E findById(T id);
	
	/**
	 * Method for saving entity.
	 * @param entity entity.
	 */
	void save(E entity);
	
	/**
	 * Method for updating entity.
	 * @param entity entity.
	 */
	void update(E entity);
	
	/**
	 * Method for deleting entity.
	 * @param entity entity.
	 */
	void delete(E entity);
	
}

