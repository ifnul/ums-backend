package org.is.lnu.edbo.service.person;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonsFind;

/**
 * Interface, that describes methods for finding person by specific parameters.
 * This methid
 * ЄДБО гавно.
 * @author ivanursul
 *
 */
public interface EdboPersonService {

	/**
	 * Method for finding person by specific parameters.
	 * @param personFind
	 * @return ArrayOfDPersonFind element.
	 */
	ArrayOfDPersonsFind findPerson(PersonsFind personFind);
	
}
