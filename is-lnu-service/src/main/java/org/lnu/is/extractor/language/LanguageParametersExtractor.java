package org.lnu.is.extractor.language;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.language.language;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Language parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("languageParametersExtractor")
public class LanguageParametersExtractor extends AbstractParametersExtractor<language> {

	@Override
	public Map<String, Object> getParameters(final language entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
