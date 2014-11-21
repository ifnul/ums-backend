package org.lnu.is.facade.facade.specialty;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specialty.SpecialtyResource;

/**
 * Interface, that represents all specialty operations.
 * @author ivanursul
 *
 */
public interface SpecialtyFacade {

	/**
	 * CREATE.
	 * @author ivanursul
	 * @param resource resource.
	 * @return specialty with generated identifier.
	 */
	SpecialtyResource createSpecialty(SpecialtyResource resource);

	/**
	 * UPDATE.
	 * @author ivanursul
	 * @param id identifier.
	 * @param resource resource.
	 */
	void updateSpecialty(Long id, SpecialtyResource resource);

	/**
	 * READ.
	 * @author ivanursul
	 * @param id identifier.
	 * @return specialty.
	 */
	SpecialtyResource getSpecialty(Long id);

	/**
	 * DELETE.
	 * @author ivanursul
	 * @param id identifier.
	 */
	void removeSpecialty(Long id);

	/**
	 * READ - multiple.
	 * @author ivanursul
	 * @param request
	 * @return paged result with multiple specialties.
	 */
	PagedResultResource<SpecialtyResource> getSpecialties(PagedRequest<SpecialtyResource> request);

}
