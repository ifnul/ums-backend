package org.lnu.is.pagination;

import java.util.List;
import java.util.Map;

/**
 * Multiple Search entity.
 * TODO: Think about adding additional field, that will take 
 * T entity field functions.
 * @author ivanursul
 *
 * @param <T> entity or context.
 */
public class MultipleSearch<T> {
	
    private Map<String, Object> parameters;
    private Class<T> clazz;
    private T entity;
    private List<OrderBy> orders;
	
    /**
     * Constructor with no parameters.
     */
    public MultipleSearch() {
		super();
	}

    /**
     * Basic constructor for setting all required fields to PagedSearch.
     * @param parameters required parameters(can be empty)
     * @param clazz Class instance for mapping.
     */
	public MultipleSearch(final Map<String, Object> parameters, final Class<T> clazz) {
		super();
		this.parameters = parameters;
		this.clazz = clazz;
	}

	/**
	 * Constructor for all fields.
	 * @author ivanursul
	 * @param parameters parameters
	 * @param clazz clazz
	 * @param entity entity
	 */
	public MultipleSearch(final Map<String, Object> parameters, final Class<T> clazz, final T entity) {
		super();
		this.parameters = parameters;
		this.clazz = clazz;
		this.entity = entity;
	}

	/**
	 * Constructor for all fields.
	 * @author ivanursul
	 * @param parameters parameters
	 * @param clazz clazz
	 * @param entity entity
     * @param orders orders
	 */	
	public MultipleSearch(final Map<String, Object> parameters, final Class<T> clazz,
			final T entity, final List<OrderBy> orders) {
		super();
		this.parameters = parameters;
		this.clazz = clazz;
		this.entity = entity;
		this.orders = orders;
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
		result = prime * result + ((orders == null) ? 0 : orders.hashCode());
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
		MultipleSearch<?> other = (MultipleSearch<?>) obj;
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
		if (orders == null) {
			if (other.orders != null) {
				return false;
			}
		} else if (!orders.equals(other.orders)) {
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
		return "MultipleSearch [parameters=" + parameters + ", clazz=" + clazz
				+ ", entity=" + entity + ", orders=" + orders + "]";
	}
	
}
