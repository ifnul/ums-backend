package org.lnu.is.converter.language;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.language.Language;
import org.lnu.is.resource.language.LanguageResource;

/**
 * Language resource converter.
 * @author ivanursul
 *
 */
@ResourceConverter("languageResourceConverter")
public class LanguageResourceConverter extends AbstractConverter<LanguageResource, Language> {

	@Override
	public Language convert(final LanguageResource source, final Language target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public Language convert(final LanguageResource source) {
		return convert(source, new Language());
	}

}
