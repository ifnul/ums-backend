package com.optigra.funnypictures.dao.persistence;

import java.util.List;

import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;
import com.optigra.funnypictures.queries.Query;

public interface PersistenceManager<T, I> {

    T create(T entity);

    T findById(Class<T> clazz, I id);

    T update(T entity);

    void remove(T entity);

    T executeSingleResultQuery(Query<T> query);

    List<T> executeMultipleResultQuery(Query<T> query);

    PagedResult<T> search(PagedSearch<T> searchRequest);
}
