package org.lnu.is.extractor.language;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.language.Language;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Language parameters extractor.
 * @author ivanursul
 *
 */
@Component("languageParametersExtractor")
public class LanguageParametersExtractor extends AbstractParametersExtractor<Language> {

	@Override
	public Map<String, Object> getParameters(final Language entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
