package org.lnu.is.extractor.mark.scale.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * MarkScale Type Parameters Extractor.
 * 
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markScaleTypeParametersExtractor")
public class MarkScaleTypeParametersExtractor extends AbstractParametersExtractor<MarkScaleType> {

	@Override
	public Map<String, Object> getParameters(final MarkScaleType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
