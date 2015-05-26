package org.lnu.is.extractor.married.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Married Type parameters extractor.
 * @author Bohdan
 *
 */
@ParametersExtractor("marriedTypeParametersExtractor")
public class MarriedTypeParametersExtractor extends AbstractParametersExtractor<MarriedType> {

	@Override
	public Map<String, Object> getParameters(final MarriedType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
