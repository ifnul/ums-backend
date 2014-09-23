package com.optigra.funnypictures.facade.resources.search;

import java.util.List;

import com.optigra.funnypictures.facade.resources.ApiResource;

public class PagedResultResource<R> extends ApiResource {

    private Integer offset;
    private Integer limit;
    private long count;
    private List<R> entities;
    private String uri;

    public PagedResultResource() { }
    
    public PagedResultResource(final String uri) {
        this.uri = uri;
    }
    
    @Override
    public String getUri() {
        return uri;
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

	public List<R> getEntities() {
		return entities;
	}

	public void setEntities(List<R> entities) {
		this.entities = entities;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (count ^ (count >>> 32));
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
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
		PagedResultResource<?> other = (PagedResultResource<?>) obj;
		if (count != other.count)
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
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PagedResultResource [offset=" + offset + ", limit=" + limit
				+ ", count=" + count + ", entities=" + entities + ", uri="
				+ uri + "]";
	}

}