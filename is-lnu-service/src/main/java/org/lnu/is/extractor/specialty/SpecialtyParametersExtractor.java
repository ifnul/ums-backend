package org.lnu.is.extractor.specialty;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specialty.SpecialtyDao;
import org.lnu.is.dao.dao.specialtytype.SpecialtyTypeDao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialtype.SpecialtyType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Specialty Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("specialtyParametersExtractor")
public class SpecialtyParametersExtractor implements ParametersExtractor<Specialty> {

	@Resource(name = "specialtyTypeDao")
	private SpecialtyTypeDao specialtyTypeDao;
	
	@Resource(name = "specialtyDao")
	private SpecialtyDao specialtyDao;
	
	@Override
	public Map<String, Object> getParameters(final PagedSearch<Specialty> pagedSearch) {
		Specialty entity = pagedSearch.getEntity();
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (entity.getSpecialtyType() != null) {
			SpecialtyType specialtyType = specialtyTypeDao.findById(entity.getSpecialtyType().getId());
			parameters.put("specialtyType", specialtyType);
		}
		
		if (entity.getParent() != null) {
			Specialty parent = specialtyDao.findById(entity.getParent().getId());
			parameters.put("parent", parent);
		}
		
		if (entity.getAbbrName() != null) {
			parameters.put("abbrName", entity.getAbbrName());
		}
		
		if (entity.getName() != null) {
			parameters.put("name", entity.getName());
		}
		
		if (entity.getCipher() != null) {
			parameters.put("cipher", entity.getCipher());
		}
		
		if (entity.getBegDate() != null) {
			parameters.put("begDate", entity.getBegDate());
		}
		
		if (entity.getEndDate() != null) {
			parameters.put("endDate", entity.getEndDate());
		}
		
		return parameters;
	}

}
