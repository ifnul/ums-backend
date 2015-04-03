package org.lnu.is.service.person;

import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;

/**
 * Service Interface for Person Entrant View.
 * @author ivanursul
 *
 */
public interface PersonEntrantService {

	/**
	 * Method for getting Entrant By id.
	 * @param id
	 * @return Entrant.
	 */
	PersonEntrant getEntrant(Long id);

	/**
	 * Method for getting Auto Enrant By Id.
	 * @param entrantId
	 * @return Entrant Auto.
	 */
	PersonEntrantAuto getEntrantAuto(Long entrantId);
	
}
