package org.lnu.is.extractor.specialty;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Specialty Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specialtyParametersExtractor")
public class SpecialtyParametersExtractor extends AbstractParametersExtractor<Specialty> {

	@Resource(name = "specialtyTypeDao")
	private Dao<SpecialtyType, SpecialtyType, Long> specialtyTypeDao;
	
	@Resource(name = "specialtyDao")
	private Dao<Specialty, Specialty, Long> specialtyDao;
	
	@Override
	public Map<String, Object> getParameters(final Specialty entity, final Map<String, Object> parameters) {
		
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
