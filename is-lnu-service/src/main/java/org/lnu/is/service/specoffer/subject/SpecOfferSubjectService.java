package org.lnu.is.service.specoffer.subject;

import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * 
 * @author ivanursul
 *
 */
public interface SpecOfferSubjectService {

	/**
	 * Method for creating subject.
	 * @param subject
	 */
	void createSubject(SpecofferSubject subject);

	/**
	 * Method for subject.
	 * @param subjectId
	 * @return spec offer subject.
	 */
	SpecofferSubject getSubject(Long subjectId);

	/**
	 * Method for updating subject.
	 * @param subject
	 */
	void updateSubject(SpecofferSubject subject);

	/**
	 * Method for removing subject.
	 * @param subject
	 */
	void removeSubject(SpecofferSubject subject);

	/**
	 * Methof for getting paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<SpecofferSubject> getSubjects(PagedSearch<SpecofferSubject> pagedSearch);

}
