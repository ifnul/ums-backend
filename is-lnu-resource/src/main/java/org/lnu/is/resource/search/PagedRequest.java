package org.lnu.is.resource.search;

import java.util.List;

import org.lnu.is.annotations.Limit;
import org.lnu.is.annotations.Offset;
import org.lnu.is.pagination.OrderBy;


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
	
	private List<OrderBy> orders;

	/**
	 * Default constructor.
	 */
    public PagedRequest() {
		super();
	}
	
	/**
	 * Constructon with all parameters.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @param orders
	 */
	public PagedRequest(final R resource, final Integer offset, final Integer limit, final List<OrderBy> orders) {
		super();
		this.offset = offset;
		this.limit = limit;
		this.resource = resource;
		this.orders = orders;
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

	public List<OrderBy> getOrders() {
		return orders;
	}

	public void setOrders(final List<OrderBy> orders) {
		this.orders = orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((limit == null) ? 0 : limit.hashCode());
		result = prime * result + ((offset == null) ? 0 : offset.hashCode());
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
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
		if (orders == null) {
			if (other.orders != null) {
				return false;
			}
		} else if (!orders.equals(other.orders)) {
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
				+ ", resource=" + resource + ", orders=" + orders + "]";
	}

}
