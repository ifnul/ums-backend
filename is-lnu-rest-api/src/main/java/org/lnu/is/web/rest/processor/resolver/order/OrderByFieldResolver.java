package org.lnu.is.web.rest.processor.resolver.order;

import java.util.List;

import org.lnu.is.pagination.OrderBy;

/**
 * Interface, that declares methods for resolving order by fields
 * for multiple get requests.
 * @author ivanursul
 *
 */
public interface OrderByFieldResolver {

	/**
	 * Method, that takes orderBy field from requests, parses it, replaces all fields with 'Id'
	 * and returns ready object.
	 * @param orderBy
	 * @param resource
	 * @return List of OrderBy class instances.
	 */
	List<OrderBy> getOrdersBy(String orderBy, Object resource);
	
}
