package org.lnu.is.pagination;

import java.util.List;


/**
 * Class for getting paged result.
 * This class is used when you need to get pagination result.
 * @author ivanursul
 *
 * @param <E> E is a generic for entities.
 */
public class PagedResult<E> {

	private Integer offset;
    private Integer limit;
    private long count;
    private List<E> entities;
    
    /**
     * Basic constructor for all required parameters.
     * @param offset start position.
     * @param limit Maximum of elements to be retrieved.
     * @param count Count of all elements.
     * @param entities list of elements, that will be returned.
     */
	public PagedResult(final Integer offset, final Integer limit, final long count, final List<E> entities) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.count = count;
		this.entities = entities;
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

	public long getCount() {
		return count;
	}

	public void setCount(final long count) {
		this.count = count;
	}

	public List<E> getEntities() {
		return entities;
	}

	public void setEntities(final List<E> entities) {
		this.entities = entities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		final int local = 32;
		result = prime * result + (int) (count ^ (count >>> local));
		result = prime * result
				+ ((entities == null) ? 0 : entities.hashCode());
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
		PagedResult<?> other = (PagedResult<?>) obj;
		if (count != other.count) {
			return false;
		}
		if (entities == null) {
			if (other.entities != null) {
				return false;
			}
		} else if (!entities.equals(other.entities)) {
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
		return true;
	}

	@Override
	public String toString() {
		return "PagedResult [offset=" + offset + ", limit=" + limit
				+ ", count=" + count + ", entities=" + entities + "]";
	}
    
}
