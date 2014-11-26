package org.lnu.is.facade.facade.specoffer.subject;

import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;

/**
 * Spec Offer Subject interface.
 * @author ivanursul
 *
 */
public interface SpecOfferSubjectFacade {

	/**
	 * Method for creating spec offer subject.
	 * @param resource
	 * @return subject with generated id.
	 */
	SpecOfferSubjectResource createSubject(SpecOfferSubjectResource resource);

	/**
	 * Method for updating subject.
	 * @param subjectId
	 * @param resource
	 */
	void updateSubject(Long subjectId, SpecOfferSubjectResource resource);

	/**
	 * Method for getting spec offer subject.
	 * @param subjectId
	 * @return subject.
	 */
	SpecOfferSubjectResource getSubject(Long subjectId);

	/**
	 * Method for removing spec offer subject.
	 * @param subjectId
	 */
	void removeSubject(Long subjectId);

	/**
	 * Method for getting spec offer subjects.
	 * @param pagedRequest
	 * @return paged result.
	 */
	PagedResultResource<SpecOfferSubjectResource> getSubjects(PagedRequest<SpecOfferSubjectResource> pagedRequest);

}
