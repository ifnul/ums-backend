package org.lnu.is.facade.facade.person.award;

import org.lnu.is.facade.resource.person.award.PersonAwardResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;

/**
 * Interface for Person Awards.
 * @author ivanursul
 *
 */
public interface PersonAwardFacade {

	/**
	 * Method for creating person award.
	 * @param personAwardResource
	 * @return person award with generated id.
	 */
	PersonAwardResource createEntity(PersonAwardResource personAwardResource);

	/**
	 * Updating person award.
	 * @param personAwardId
	 * @param personAwardResource
	 */
	void updateEntity(Long personAwardId, PersonAwardResource personAwardResource);

	/**
	 * Getting person award by id.
	 * @param personAwardId
	 * @return person award.
	 */
	PersonAwardResource getEntity(Long personAwardId);

	/**
	 * Method for removing person award.
	 * @param personAwardId
	 */
	void removeEntity(Long personAwardId);

	/**
	 * Method for getting paged result.
	 * @param pagedRequest
	 * @return paged results.
	 */
	PagedResultResource<PersonAwardResource> getEntities(PagedRequest<PersonAwardResource> pagedRequest);

}
