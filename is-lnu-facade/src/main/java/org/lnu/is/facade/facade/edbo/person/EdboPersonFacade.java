package org.lnu.is.facade.facade.edbo.person;

import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.lnu.is.resource.person.PersonResource;

/**
 * Interface for describing requests for edbo person.
 * @author ivanursul
 *
 */
public interface EdboPersonFacade {

	/**
	 * Method for finding persons.
	 * @param request
	 * @return list of persons.
	 */
	List<EdboPersonResource> findPersons(EdboPersonFindRequest request);

	/**
	 * Method for sending applicant to edbo.
	 * @param applicantId
	 * @param auto
	 * @return person resource with generated uid and utid.
	 */
	PersonResource createPerson(Long applicantId, Boolean auto);
	
}
