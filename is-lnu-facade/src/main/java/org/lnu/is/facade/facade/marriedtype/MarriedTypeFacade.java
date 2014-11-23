package org.lnu.is.facade.facade.marriedtype;

import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Married Type Facade.
 * @author Bohdan
 *
 */
public interface MarriedTypeFacade {
	
	/**
	 * Method for getting Married Types paged result.
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<MarriedTypeResource> getMarriedTypes(PagedRequest<MarriedTypeResource> request);

}
