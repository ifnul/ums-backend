package org.lnu.is.dao.dao.specialty;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface, that declares all custom operations with entity.
 * @author ivanursul
 *
 */
public interface SpecialtyDao extends Dao<Specialty, Long> {

	/**
	 * Method for getting specialties.
	 * @author ivanursul
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<Specialty> getSpecialties(PagedSearch<Specialty> pagedSearch);

}
