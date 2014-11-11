package org.lnu.is.service.specialty;

import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Interface that declares all operations of Specialty entity.
 * @author ivanursul
 *
 */
public interface SpecialtyService extends Service<Specialty> {

	/**
	 * Method for creating.
	 * @author ivanursul
	 * @param specialty 
	 * @return specialty with generated identifier.
	 */
	Specialty createSpecialty(Specialty specialty);

	/**
	 * Get's specialty by identifier.
	 * @author ivanursul
	 * @param id
	 * @return Specialty.
	 */
	Specialty getSpecialty(Long id);

	/**
	 * Updates specialty.
	 * @author ivanursul
	 * @param specialty
	 */
	void updateSpecialty(Specialty specialty);

	/**
	 * Remove specialty.
	 * @author ivanursul
	 * @param specialty
	 */
	void removeSpecialty(Specialty specialty);

	/**
	 * Get's paged result of specialties.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return collection of specialties.
	 */
	PagedResult<Specialty> getSpecialties(PagedSearch<Specialty> pagedSearch);

}
