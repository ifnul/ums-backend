package org.lnu.is.converter.language;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.language.LanguageResource;

/**
 * Language Converter Language -> Language Resource.
 * @author ivanursul
 *
 */
@ResourceConverter("languageConverter")
public class LanguageConverter extends AbstractConverter<Language, LanguageResource> {

	@Override
	public LanguageResource convert(final Language source, final LanguageResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setId(source.getId());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public LanguageResource convert(final Language source) {
		return convert(source, new LanguageResource());
	}

}
