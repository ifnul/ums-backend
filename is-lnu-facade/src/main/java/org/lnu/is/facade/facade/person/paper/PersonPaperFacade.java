package org.lnu.is.facade.facade.person.paper;

import org.lnu.is.facade.resource.person.paper.PersonPaperResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Person paper facade.
 * @author ivanursul
 *
 */
public interface PersonPaperFacade {

	/**
	 * Method for creating person paper.
	 * @author ivanursul
	 * @param personPaperResource
	 * @return person paper with generated identifier.
	 */
	PersonPaperResource createPersonPaper(PersonPaperResource personPaperResource);

	/**
	 * Method for updating person paper.
	 * @author ivanursul
	 * @param personPaperId
	 * @param personPaperResource
	 */
	void updatePersonPaper(Long personPaperId, PersonPaperResource personPaperResource);

	/**
	 * Method for getting person paper identifier.
	 * @author ivanursul
	 * @param personId
	 * @param personPaperId
	 * @return person paper.
	 */
	PersonPaperResource getPersonPaper(Long personPaperId);

	/**
	 * Method for removing person paper.
	 * @author ivanursul
	 * @param personId
	 * @param personPaperId
	 */
	void removePersonPaper(Long personPaperId);

	/**
	 * Method for getting paged result for person papers.
	 * @author ivanursul
	 * @param personId
	 * @param pagedRequest
	 * @return paged result.
	 */
	PagedResultResource<PersonPaperResource> getPersonPapers(PagedRequest<PersonPaperResource> pagedRequest);

}
