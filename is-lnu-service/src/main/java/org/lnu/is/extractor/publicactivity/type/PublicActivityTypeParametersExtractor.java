package org.lnu.is.extractor.publicactivity.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * PublicActivity Type Parameters Extractor.
 * 
 * @author kushnir
 *
 */

@ParametersExtractor("publicActivityTypeParametersExtractor")
public class PublicActivityTypeParametersExtractor extends AbstractParametersExtractor<PublicActivityType> {

	@Override
	public Map<String, Object> getParameters(final PublicActivityType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
