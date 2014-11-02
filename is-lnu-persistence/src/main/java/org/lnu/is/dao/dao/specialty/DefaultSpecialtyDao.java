package org.lnu.is.dao.dao.specialty;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default implemetation of specialty dao.
 * @author ivanursul
 *
 */
@Repository("specialtyDao")
public class DefaultSpecialtyDao extends AbstractDao<Specialty, Long> implements SpecialtyDao {

	@Override
	public Class<Specialty> getEntityClass() {
		return Specialty.class;
	}

	@Override
	public PagedResult<Specialty> getSpecialties(final PagedSearch<Specialty> pagedSearch) {

		Queries query = Queries.FIND_SPECIALTIES;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);

		return search(pagedSearch);
	}

}
