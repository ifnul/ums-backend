package org.lnu.is.dao.persistence;

import java.util.List;

import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;

/**
 * Interface, that is used to incapsulate all work
 * with entity manager or other objects, that are
 * working with database.
 * @author ivanursul
 *
 * @param <T> Entity Class
 * @param <I> Identifier Class
 */
public interface PersistenceManager<T, I> {

	/**
	 * Method for creating entity.
	 * @param entity Instance of entity.
	 * @return Entity with Id.
	 */
    T create(T entity);

    /**
     * Finds entity from database by identifier.
     * @param clazz Class instance.
     * @param id identifier.
     * @return Entity instance.
     */
    T findById(Class<T> clazz, I id);

    /**
     * Updates entity.
     * @param entity entity  instance.
     * @return Updated instance.
     */
    T update(T entity);

    /**
     * Removes entity.
     * @param entity entity instance.
     */
    void remove(T entity);
    
    /**
     * Execute single result query.
     * The method is used when you need to execute JPQL query, and need
     * to have single result.
     * @param query query.
     * @return Entity instance.
     */
    T executeSingleResultQuery(Query<T> query);

    /**
     * Execute multiple results.
     * The method is used when u need to execute JPQL, and
     * retrieve multiple results.
     * @param query Queries query.
     * @return List of entity instances.
     */
    List<T> executeMultipleResultQuery(Query<T> query);

    /**
     * Method to search with offset and limit.
     * Method is used to handle pagination approach,
     * when you need to retrieve results by "parts".
     * @param searchRequest request.
     * @return PagedResult with "part" result.
     */
    PagedResult<T> search(PagedQuerySearch<T> searchRequest);
}
