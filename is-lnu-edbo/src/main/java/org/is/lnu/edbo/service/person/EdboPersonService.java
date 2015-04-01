package org.is.lnu.edbo.service.person;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonEntrantAdd;
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

	/**
	 * Method for manual creation of person.
	 * @param person
	 * @return Array of Returned Persons.
	 */
	ArrayOfDPersonAddRet createAplicantManually(PersonEntrantAdd person);
	
}
