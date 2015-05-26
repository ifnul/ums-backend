package org.lnu.is.pagination;

import java.util.Map;


/**
 * Class for getting paged result for pagination.
 * @author ivanursul
 *
 * @param <T> Generic parameter for entity.
 */
public class MultiplePagedSearch<T> extends MultipleSearch<T> {
    
	private Integer offset;
    private Integer limit;
	
    /**
     * Constructor with no parameters.
     */
    public MultiplePagedSearch() {
		super();
	}

    /**
     * Constructor for all fields.
     * @param offset offset
     * @param limit limit
     * @param parameters parameters
     * @param clazz clazz
     */
	public MultiplePagedSearch(final Integer offset, final Integer limit, final Map<String, Object> parameters, final Class<T> clazz) {
		super(parameters, clazz, null, null);
		this.offset = offset;
		this.limit = limit;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
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
		MultiplePagedSearch<?> other = (MultiplePagedSearch<?>) obj;
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

		return true;
	}

	@Override
	public String toString() {
		return "PagedSearch [offset=" + offset + ", limit=" + limit + "]";
	}

}
