package org.lnu.is.extractor.specialty.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Specialty Type Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specialtyTypeParametersExtractor")
public class SpecialtyTypeParametersExtractor extends AbstractParametersExtractor<SpecialtyType> {

	@Override
	public Map<String, Object> getParameters(final SpecialtyType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
