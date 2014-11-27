package org.lnu.is.extractor.specialty;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Specialty Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("specialtyParametersExtractor")
public class SpecialtyParametersExtractor extends AbstractParametersExtractor<Specialty> {

	@Resource(name = "specialtyTypeDao")
	private Dao<SpecialtyType, Long> specialtyTypeDao;
	
	@Resource(name = "specialtyDao")
	private Dao<Specialty, Long> specialtyDao;
	
	@Override
	public Map<String, Object> getParameters(final Specialty entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getSpecialtyType(), specialtyTypeDao, "specialtyType", parameters);
		addParameter(entity.getParent(), specialtyDao, "parent", parameters);

		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getCipher(), "cipher", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
