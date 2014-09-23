package com.optigra.funnypictures.pagination;

import java.util.List;


public class PagedResult<E> {

	private Integer offset;
    private Integer limit;
    private long count;
    private List<E> entities;
    
	public PagedResult(Integer offset, Integer limit, long count, List<E> entities) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.count = count;
		this.entities = entities;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<E> getEntities() {
		return entities;
	}

	public void setEntities(List<E> entities) {
		this.entities = entities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (count ^ (count >>> 32));
		result = prime * result
				+ ((entities == null) ? 0 : entities.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PagedResult<?> other = (PagedResult<?>) obj;
		if (count != other.count)
			return false;
		if (entities == null) {
			if (other.entities != null)
				return false;
		} else if (!entities.equals(other.entities))
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
		return true;
	}

	@Override
	public String toString() {
		return "PagedResult [offset=" + offset + ", limit=" + limit
				+ ", count=" + count + ", entities=" + entities + "]";
	}
    
}
