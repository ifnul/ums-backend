package org.lnu.is.extractor.street.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * StreetTypeParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("streetTypeParametersExtractor")
public class StreetTypeParametersExtractor extends AbstractParametersExtractor<StreetType> {

	@Override
	public Map<String, Object> getParameters(final StreetType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
