package org.lnu.is.pagination;

import java.util.Map;

import org.lnu.is.queries.Queries;

/**
 * Paged Query Search.
 * @author ivanursul
 *
 * @param <E> Entity.
 */
public class PagedQuerySearch<E> extends PagedSearch<E> {

	private Queries<E> query;

	/**
	 * Constructor with no parameters.
	 */
	public PagedQuerySearch() {
		super();
	}

	/**
	 * Basic constructor.
	 * @param query
	 * @param offset
	 * @param limit
	 * @param parameters
	 * @param clazz
	 */
	public PagedQuerySearch(final Queries<E> query, final Integer offset, final Integer limit, final Map<String, Object> parameters, final Class<E> clazz) {
		super(offset, limit, parameters, clazz);
		this.query = query;
	}

	public Queries<E> getQuery() {
		return query;
	}

	public void setQuery(final Queries<E> query) {
		this.query = query;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PagedQuerySearch<?> other = (PagedQuerySearch<?>) obj;
		if (query == null) {
			if (other.query != null) {
				return false;
			}
		} else if (!query.equals(other.query)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PagedQuerySearch [query=" + query + "]";
	}
	
}
