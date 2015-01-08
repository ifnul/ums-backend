package org.lnu.is.extractor.honor.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Honor Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */

@ParametersExtractor("honorTypeParametersExtractor")
public class HonorTypeParametersExtractor extends AbstractParametersExtractor<HonorType> {

	@Override
	public Map<String, Object> getParameters(final HonorType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
