package org.lnu.is.facade.facade.edbo.person;

import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;

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
	
}
