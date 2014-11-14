package org.lnu.is.service.specialty;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specialty.SpecialtyDao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default implementation of specialty service layer.
 * @author ivanursul
 *
 */
@Service("specialtyService")
public class DefaultSpecialtyService implements SpecialtyService {

	@Resource(name = "specialtyDao")
	private SpecialtyDao specialtyDao;
	
	@Resource(name = "specialtyParametersExtractor")
	private ParametersExtractor<Specialty> parametersExtractor;
	
	@Override
	public Specialty createSpecialty(final Specialty specialty) {
		specialtyDao.save(specialty);
		return specialty;
	}

	@Override
	public Specialty getSpecialty(final Long id) {
		return specialtyDao.findById(id);
	}

	@Override
	public void updateSpecialty(final Specialty specialty) {
		specialtyDao.update(specialty);
	}

	@Override
	public void removeSpecialty(final Specialty specialty) {
		specialtyDao.delete(specialty);
	}

	@Override
	public PagedResult<Specialty> getSpecialties(final PagedSearch<Specialty> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch);
		pagedSearch.setParameters(parameters);
		
		return specialtyDao.getEntities(pagedSearch);
	}

}
