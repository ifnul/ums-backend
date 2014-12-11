package org.lnu.is.extractor.gendertype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.gendertype.GenderType;
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
	public Map<String, Object> getParameters(final GenderType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
