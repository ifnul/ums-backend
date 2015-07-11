package org.lnu.is.resource.search;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotations.Limit;
import org.lnu.is.annotations.Offset;
import org.lnu.is.pagination.OrderBy;

import java.util.List;
import java.util.Map;


/**
 * /**
 * Paged Request with parameters, that comes from controller.
 *
 * @param <R> Resource.
 * @author ivanursul
 */
public class PagedRequest<R> {

    @Offset
    private Integer offset;

    @Limit
    private Integer limit;

    private R resource;

    private List<OrderBy> orders;

    private Map<String, Object> parameters;

    /**
     * Default constructor.
     */
    public PagedRequest() {
        super();
    }

    /**
     * Constructor with all parameters.
     *
     * @param offset     offset
     * @param limit      limit
     * @param resource   resource
     * @param orders     orders
     * @param parameters parameters
     */
    public PagedRequest(final R resource, final Integer offset, final Integer limit, final List<OrderBy> orders, final Map<String, Object> parameters) {
        super();
        this.offset = offset;
        this.limit = limit;
        this.resource = resource;
        this.orders = orders;
        this.parameters = parameters;
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

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(final Map<String, Object> parameters) {
        this.parameters = parameters;
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

        return new EqualsBuilder()
                .append(offset, that.offset)
                .append(limit, that.limit)
                .append(resource, that.resource)
                .append(orders, that.orders)
                .append(parameters, that.parameters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(offset)
                .append(limit)
                .append(resource)
                .append(orders)
                .append(parameters)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("offset", offset)
                .append("limit", limit)
                .append("resource", resource)
                .append("orders", orders)
                .append("parameters", parameters)
                .toString();
    }
}
