package org.is.lnu.edbo.service.language;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;

/**
 * Default implementation of language service.
 * Mocked with default id.
 * @author ivanursul
 *
 */
public class DefaultEdboLanguageService implements EdboLanguageService {

	private static final Integer DEFAULT_LANGUAGE = 1;

	@Override
	public Integer getDefaultLanguage(final EdboAuthentification authentification) {
		return DEFAULT_LANGUAGE;
	}

}
