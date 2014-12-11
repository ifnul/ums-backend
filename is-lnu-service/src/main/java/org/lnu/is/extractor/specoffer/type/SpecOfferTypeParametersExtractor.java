package org.lnu.is.extractor.specoffer.type;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Spec Offer Type Parameter extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferTypeParametersExtractor")
public class SpecOfferTypeParametersExtractor extends AbstractParametersExtractor<SpecOfferType> {

	@Resource(name = "specialtyTypeDao")
	private Dao<Specialty, Long> specialtyTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecOfferType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);

		addParameter(entity.getSpecialtyType(), specialtyTypeDao, "specialtyType", parameters);
		
		return parameters;
	}

}
