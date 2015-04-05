package org.lnu.is.extractor.sallary.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.salary.type.SallaryType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * SallaryTypeParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("sallaryTypeParametersExtractor")
public class SallaryTypeParametersExtractor extends AbstractParametersExtractor<SallaryType> {

	@Override
	public Map<String, Object> getParameters(final SallaryType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
