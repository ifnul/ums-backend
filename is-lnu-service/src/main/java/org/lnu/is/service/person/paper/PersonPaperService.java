package org.lnu.is.service.person.paper;

import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Person Paper service.
 * @author ivanursul
 *
 */
public interface PersonPaperService {
	
	/**
	 * Method for creating person paper.
	 * @param personId
	 * @param personPaper
	 */
	void createPersonPaper(PersonPaper personPaper);

	/**
	 * Method for getting person paper by identifier.
	 * @param personPaperId
	 * @return person paper.
	 */
	PersonPaper getPersonPaper(Long personPaperId);

	/**
	 * Method for updating person paper.
	 * @param personPaper
	 */
	void updatePersonPaper(PersonPaper personPaper);

	/**
	 * Method for removing person paper.
	 * @param personPaper
	 */
	void removePersonPaper(PersonPaper personPaper);

	/**
	 * Method for gettig paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<PersonPaper> getPersonPapers(PagedSearch<PersonPaper> pagedSearch);

}
