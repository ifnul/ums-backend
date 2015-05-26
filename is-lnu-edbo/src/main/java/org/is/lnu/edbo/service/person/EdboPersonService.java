package org.is.lnu.edbo.service.person;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;
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
	 * @param personFind personFind
	 * @return ArrayOfDPersonFind element.
	 */
	ArrayOfDPersonsFind findPerson(PersonsFind personFind);

	/**
	 * Method for manual creation of person.
	 * @param person person
	 * @return Array of Returned Persons.
	 */
	ArrayOfDPersonAddRet createApplicantManually(PersonEntrantAdd person);
	
	/**
	 * Method for automatic creation of person.
	 * @param person person
	 * @return Array of Returned Persons.
	 */
	ArrayOfDPersonAddRet createApplicantAutomatically(PersonEntrantAutoAdd person);
}
