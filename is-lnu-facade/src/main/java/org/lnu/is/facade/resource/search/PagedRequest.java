package org.lnu.is.facade.resource.search;

import org.lnu.is.facade.annotations.Limit;
import org.lnu.is.facade.annotations.Offset;


/**
/**
 * Paged Request, that comes from controller.
 * @author ivanursul
 *
 * @param <R> Resource.
 */
public class PagedRequest<R> {

	@Offset
    private Integer offset;
    
	@Limit
	private Integer limit;
	
	private R resource;

	/**
	 * Default constructor.
	 * @author ivanursul
	 */
    public PagedRequest() {
		super();
	}

	/**
	 * Constructor with all parameters.
	 * @param resource resoruce from form.
	 * @param offset start position.
	 * @param limit limit count.
	 */
	public PagedRequest(final R resource, final Integer offset, final Integer limit) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.resource = resource;
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

	public R getResource() {
		return resource;
	}

	public void setResource(final R resource) {
		this.resource = resource;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result
				+ ((resource == null) ? 0 : resource.hashCode());
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
		PagedRequest<?> other = (PagedRequest<?>) obj;
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
		if (resource == null) {
			if (other.resource != null) {
				return false;
			}
		} else if (!resource.equals(other.resource)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PagedRequest [offset=" + offset + ", limit=" + limit
				+ ", resource=" + resource + "]";
	}

}
