package org.lnu.is.extractor.degree.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Degree Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("degreeTypeParametersExtractor")
public class DegreeTypeParametersExtractor extends AbstractParametersExtractor<DegreeType> {

	@Override
	public Map<String, Object> getParameters(final DegreeType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
