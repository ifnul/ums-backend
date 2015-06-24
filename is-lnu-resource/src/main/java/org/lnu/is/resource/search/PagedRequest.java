package org.lnu.is.resource.search;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotations.Limit;
import org.lnu.is.annotations.Offset;
import org.lnu.is.pagination.OrderBy;

import java.util.List;


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
	 * @param offset offset
	 * @param limit limit
	 * @param resource resource
	 * @param orders orders
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
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		PagedRequest<?> that = (PagedRequest<?>) o;

		if (offset != null ? !offset.equals(that.offset) : that.offset != null) {
			return false;
		}
		if (limit != null ? !limit.equals(that.limit) : that.limit != null) {
			return false;
		}
		if (resource != null ? !resource.equals(that.resource) : that.resource != null) {
			return false;
		}
		return !(orders != null ? !orders.equals(that.orders) : that.orders != null);

	}

	@Override
	public int hashCode() {
		int result = offset != null ? offset.hashCode() : 0;
		result = 31 * result + (limit != null ? limit.hashCode() : 0);
		result = 31 * result + (resource != null ? resource.hashCode() : 0);
		result = 31 * result + (orders != null ? orders.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("offset", offset)
				.append("limit", limit)
				.append("resource", resource)
				.append("orders", orders)
				.toString();
	}
}
