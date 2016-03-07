package org.lnu.is.converter.language;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.language.language;
import org.lnu.is.resource.language.LanguageResource;

/**
 * Language Converter Language Language Resource.
 * @author ivanursul
 *
 */
@Converter("languageConverter")
public class LanguageConverter extends AbstractConverter<language, LanguageResource> {

	@Override
	public LanguageResource convert(final language source, final LanguageResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setId(source.getId());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public LanguageResource convert(final language source) {
		return convert(source, new LanguageResource());
	}

}
