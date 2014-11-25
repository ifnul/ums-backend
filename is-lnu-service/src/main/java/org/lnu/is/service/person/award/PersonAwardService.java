package org.lnu.is.service.person.award;

import org.lnu.is.domain.person.PersonAward;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Person Award service.
 * @author ivanursul
 *
 */
public interface PersonAwardService {

	/**
	 * Method for creating person award.
	 * @param award
	 */
	void createAward(PersonAward award);

	/**
	 * Method for updating award.
	 * @param award
	 */
	void updateAward(PersonAward award);

	/**
	 * Method for getting person award.
	 * @param personAwardId
	 * @return person award.
	 */
	PersonAward getAward(Long personAwardId);

	/**
	 * Method for removing person award.
	 * @param award
	 */
	void removeAward(PersonAward award);

	/**
	 * Method for getting awards paged result.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<PersonAward> getAwards(PagedSearch<PersonAward> pagedSearch);

}
