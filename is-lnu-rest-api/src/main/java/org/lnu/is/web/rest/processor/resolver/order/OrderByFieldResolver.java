package org.lnu.is.web.rest.processor.resolver.order;

import org.lnu.is.pagination.OrderBy;

import java.util.List;

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
	 * @param orderBy orderBy.
	 * @param resource resource.
	 * @return List of OrderBy class instances.
	 */
	List<OrderBy> getOrdersBy(String orderBy, Object resource);
	
}
