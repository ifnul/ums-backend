package org.lnu.is.pagination;

import java.util.Map;

import org.lnu.is.queries.Queries;


/**
 * Class for paged queries.
 * @date Feb 6, 2014
 * @author ivanursul
 *
 */
public class PagedSearch<T> {
    
	private Integer offset;
    private Integer limit;
    private Queries query;
    private Map<String, Object> parameters;
    private Class<T> clazz;
	
    /**
     * Constructor with no parameters.
     * @date Sep 28, 2014
     * @author ivanursul
     */
    public PagedSearch() {
		super();
	}

    /**
     * Basic constructor for setting all required fields to PagedSearch.
     * @date Sep 28, 2014
     * @author ivanursul
     * @param offset start position.
     * @param limit Maximum of elements to be retrieved.
     * @param query query, that will be executed.
     * @param parameters required parameters(can be empty)
     * @param clazz Class instance for mapping.
     */
	public PagedSearch(final Integer offset, final Integer limit, final Queries query,
			final Map<String, Object> parameters, final Class<T> clazz) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.query = query;
		this.parameters = parameters;
		this.clazz = clazz;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(final Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(final Integer limit) {
		this.limit = limit;
	}

	public Queries getQuery() {
		return query;
	}

	public void setQuery(final Queries query) {
		this.query = query;
	}

	public Map<String, Object> getParameters() {
		return parameters;
	}

	public void setParameters(final Map<String, Object> parameters) {
		this.parameters = parameters;
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(final Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result
				+ ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((query == null) ? 0 : query.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagedSearch<?> other = (PagedSearch<?>) obj;
		if (clazz == null) {
			if (other.clazz != null)
				return false;
		} else if (!clazz.equals(other.clazz))
			return false;
		if (limit == null) {
			if (other.limit != null)
				return false;
		} else if (!limit.equals(other.limit))
			return false;
		if (offset == null) {
			if (other.offset != null)
				return false;
		} else if (!offset.equals(other.offset))
			return false;
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		if (query == null) {
			if (other.query != null)
				return false;
		} else if (!query.equals(other.query))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PagedSearch [offset=" + offset + ", limit=" + limit
				+ ", query=" + query + ", parameters=" + parameters
				+ ", clazz=" + clazz + "]";
	}

}
