package org.lnu.is.facade.facade.eduformtype;

import org.lnu.is.facade.resource.eduformtype.EduFormTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;


/**
 * Edu Form Type interface.
 * @author ivanursul
 *
 */
public interface EduFormTypeFacade {

	/**
	 * Method for paged result.
	 * @param request
	 * @return method for paged result.
	 */
	PagedResultResource<EduFormTypeResource> getEduFormTypes(PagedRequest<EduFormTypeResource> request);

}
