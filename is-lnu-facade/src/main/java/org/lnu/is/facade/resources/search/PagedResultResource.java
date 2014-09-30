package org.lnu.is.facade.resources.search;

import java.util.List;

import org.lnu.is.facade.resources.ApiResource;

/**
 * PagedResultResource, that is sent to response,
 * when we need to have pagination response.
 * @author ivanursul
 *
 * @param <R> Generic object class of resource
 */
public class PagedResultResource<R> extends ApiResource {

    private Integer offset;
    private Integer limit;
    private long count;
    private List<R> entities;
    private String uri;

    /**
     * Base constructor.
     */
    public PagedResultResource() { }
    
    /**
     * Constructor that takes uri.
     * @param uri uri.
     */
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

	public List<R> getEntities() {
		return entities;
	}

	public void setEntities(final List<R> entities) {
		this.entities = entities;
	}

	public void setUri(final String uri) {
		this.uri = uri;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		final int i = 32;
		result = prime * result + (int) (count ^ (count >>> i));
		result = prime * result
				+ ((entities == null) ? 0 : entities.hashCode());
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
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
		PagedResultResource<?> other = (PagedResultResource<?>) obj;
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
		if (uri == null) {
			if (other.uri != null) {
				return false;
			}
		} else if (!uri.equals(other.uri)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PagedResultResource [offset=" + offset + ", limit=" + limit
				+ ", count=" + count + ", entities=" + entities + ", uri="
				+ uri + "]";
	}
}
