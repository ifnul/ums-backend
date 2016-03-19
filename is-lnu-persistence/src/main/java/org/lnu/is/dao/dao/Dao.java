package org.lnu.is.dao.dao;

import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;

/**
 * Interface, that has all methods, that are needed 
 * to work with entities.
 * @author ivanursul
 *
 * @param <ENTITY> Entity class.
 * @param <ENTITYLIST> Entity class or MultySearch.
 * @param <KEY> Identifier class.
 */
public interface Dao<ENTITY, ENTITYLIST, KEY> {

	/**
	 * Method for finding Entities by Id.
	 * @param id identifier.
	 * @return Entity.
	 */
	ENTITY getEntityById(KEY id);
	
	/**
	 * Method for saving entity.
	 * @param entity entity.
	 */
	void save(ENTITY entity);
	
	/**
	 * Method for updating entity.
	 * @param entity entity.
	 */
	void update(ENTITY entity);
	
	/**
	 * Method for deleting entity.
	 * @param entity entity.
	 */
	void delete(ENTITY entity);

	ENTITY getByUid(long uid);

	ENTITY getByUidAndUap(long uid, String uapp);

	ENTITY getByUidOrUtidAndUap(long uid, String utid, String uapp);

	ENTITY getByUtid(String utid);
	/**
	 * Method for getting paged Result.
	 * @param pagedSearch pagedSearch
	 * @return paged result.
	 */
	PagedResult<ENTITY> getEntities(MultiplePagedSearch<ENTITYLIST> pagedSearch);


}

