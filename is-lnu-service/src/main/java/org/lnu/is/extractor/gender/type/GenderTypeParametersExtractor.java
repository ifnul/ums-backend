package org.lnu.is.extractor.gender.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Gender Type Parameters Extractor.
 * 
 * @author kushnir
 *
 */

@ParametersExtractor("genderTypeParametersExtractor")
public class GenderTypeParametersExtractor extends AbstractParametersExtractor<GenderType> {

	@Override
	public Map<String, Object> getParameters(final GenderType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
