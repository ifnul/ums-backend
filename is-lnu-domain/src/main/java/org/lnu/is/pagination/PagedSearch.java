package org.lnu.is.pagination;

import java.util.Map;


/**
 * Class for getting paged result for pagination.
 * @author ivanursul
 *
 * @param <T> Generic parameter for entity.
 */
public class PagedSearch<T> {
    
	private Integer offset;
    private Integer limit;
    private Map<String, Object> parameters;
    private Class<T> clazz;
    private T entity;
	
    /**
     * Constructor with no parameters.
     * @author ivanursul
     */
    public PagedSearch() {
		super();
	}

    /**
     * Basic constructor for setting all required fields to PagedSearch.
     * @author ivanursul
     * @param offset start position.
     * @param limit Maximum of elements to be retrieved.
     * @param parameters required parameters(can be empty)
     * @param clazz Class instance for mapping.
     */
	public PagedSearch(final Integer offset, final Integer limit,
			final Map<String, Object> parameters, final Class<T> clazz) {
		super();
		this.offset = offset;
		this.limit = limit;
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

	public T getEntity() {
		return entity;
	}

	public void setEntity(final T entity) {
		this.entity = entity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clazz == null) ? 0 : clazz.hashCode());
		result = prime * result + ((entity == null) ? 0 : entity.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result
				+ ((parameters == null) ? 0 : parameters.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PagedSearch<?> other = (PagedSearch<?>) obj;
		if (clazz == null) {
			if (other.clazz != null) {
				return false;
			}
		} else if (!clazz.equals(other.clazz)) {
			return false;
		}
		if (entity == null) {
			if (other.entity != null) {
				return false;
			}
		} else if (!entity.equals(other.entity)) {
			return false;
		}
		if (limit == null) {
			if (other.limit != null) {
				return false;
			}
		} else if (!limit.equals(other.limit)) {
			return false;
		}
		if (offset == null) {
			if (other.offset != null) {
				return false;
			}
		} else if (!offset.equals(other.offset)) {
			return false;
		}
		if (parameters == null) {
			if (other.parameters != null) {
				return false;
			}
		} else if (!parameters.equals(other.parameters)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PagedSearch [offset=" + offset + ", limit=" + limit + ", parameters=" + parameters
				+ ", clazz=" + clazz + ", entity=" + entity + "]";
	}

}
