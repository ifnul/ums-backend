package org.is.lnu.edebo.service.authentification;

import org.is.lnu.edebo.service.EdeboService;

/**
 * Abstract implementation of authentiffication service.
 * This class declares abstract method for authentification.
 * @author ivanursul
 *
 * @param <INPUT> input.
 */
public abstract class AuthentificationEdeboService<INPUT> implements EdeboService<INPUT> {

	/**
	 * Method for authentification.
	 */
	protected abstract void authentificate();
	
}
