package org.lnu.is.dao.builder;

import org.lnu.is.pagination.MultiplePagedSearch;


/**
 * Base interface for all query builders.
 * @author ivanursul
 *
 * @param <C> Entity as context.
 */
public interface QueryBuilder<C> {

	/**
	 * Method for building query.
	 * @param pagedSearch pagedSearch
	 * @return Query instance.
	 */
	String build(MultiplePagedSearch<C> pagedSearch);
}
