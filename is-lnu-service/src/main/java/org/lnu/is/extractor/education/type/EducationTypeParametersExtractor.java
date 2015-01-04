package org.lnu.is.extractor.education.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Education Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("educationTypeParametersExtractor")
public class EducationTypeParametersExtractor extends AbstractParametersExtractor<EducationType> {

	@Override
	public Map<String, Object> getParameters(final EducationType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
