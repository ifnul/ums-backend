package org.lnu.is.facade.facade.gendertype;

import org.lnu.is.facade.resource.gendertype.GenderTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface for gender types.
 * 
 * @author kushnir
 *
 */
public interface GenderTypeFacade {

	/**
	 * Method for getting paged result.
	 * 
	 * @param request
	 * @return paged result
	 */
	PagedResultResource<GenderTypeResource> getEntities(PagedRequest<GenderTypeResource> request);
}
