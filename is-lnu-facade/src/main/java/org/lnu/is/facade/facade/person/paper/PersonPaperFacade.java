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
	 * @param resource
	 * @return person paper with generated identifier.
	 */
	PersonPaperResource createPersonPaper(PersonPaperResource resource);

	/**
	 * Method for updating person paper.
	 * @param id
	 * @param resource
	 */
	void updatePersonPaper(Long id, PersonPaperResource resource);

	/**
	 * Method for getting person paper identifier.
	 * @param personId
	 * @param id
	 * @return person paper.
	 */
	PersonPaperResource getPersonPaper(Long id);

	/**
	 * Method for removing person paper.
	 * @param personId
	 * @param id
	 */
	void removePersonPaper(Long id);

	/**
	 * Method for getting paged result for person papers.
	 * @param personId
	 * @param request
	 * @return paged result.
	 */
	PagedResultResource<PersonPaperResource> getPersonPapers(PagedRequest<PersonPaperResource> request);

}
