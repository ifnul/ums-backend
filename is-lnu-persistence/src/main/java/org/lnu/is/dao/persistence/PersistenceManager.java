package org.lnu.is.dao.persistence;

import java.util.List;

import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Query;

public interface PersistenceManager<T, I> {

    T create(T entity);

    T findById(Class<T> clazz, I id);

    T update(T entity);

    void remove(T entity);
    
    T executeSingleResultQuery(Query<T> query);

    List<T> executeMultipleResultQuery(Query<T> query);

    PagedResult<T> search(PagedSearch<T> searchRequest);
}
