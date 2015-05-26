package org.lnu.is.pagination;

import java.util.Map;

import org.lnu.is.queries.Query;

/**
 * Paged Query Search.
 * @author ivanursul
 *
 * @param <E> Entity.
 */
public class MultiplePagedQuerySearch<E> extends MultiplePagedSearch<E> {

	private Query<E> query;

	/**
	 * Constructor with no parameters.
	 */
	public MultiplePagedQuerySearch() {
		super();
	}

	/**
	 * Basic constructor.
	 * @param query query
	 * @param offset offset
	 * @param limit limit
	 * @param parameters parameters
	 * @param clazz clazz
	 */
	public MultiplePagedQuerySearch(final Query<E> query, final Integer offset, final Integer limit, final Map<String, Object> parameters, final Class<E> clazz) {
		super(offset, limit, parameters, clazz);
		this.query = query;
	}

	public Query<E> getQuery() {
		return query;
	}

	public void setQuery(final Query<E> query) {
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
		MultiplePagedQuerySearch<?> other = (MultiplePagedQuerySearch<?>) obj;
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
