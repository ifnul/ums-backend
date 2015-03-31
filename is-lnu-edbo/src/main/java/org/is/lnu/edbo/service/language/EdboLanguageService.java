package org.is.lnu.edbo.service.language;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;

/**
 * Interface for Languages in EDBO.
 * @author ivanursul
 *
 */
public interface EdboLanguageService {

	/**
	 * Method for getting default language.
	 * @param authentification
	 * @return default language id.
	 */
	Integer getDefaultLanguage(EdboAuthentification authentification);

}
