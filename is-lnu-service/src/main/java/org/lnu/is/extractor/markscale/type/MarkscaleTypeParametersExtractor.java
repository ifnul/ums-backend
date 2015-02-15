package org.lnu.is.extractor.markscale.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Markscale Type Parameters Extractor.
 * 
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markscaleTypeParametersExtractor")
public class MarkscaleTypeParametersExtractor extends AbstractParametersExtractor<MarkscaleType> {

	@Override
	public Map<String, Object> getParameters(final MarkscaleType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
