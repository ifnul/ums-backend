package org.is.lnu.edebo.service;

/**
 * Abstract implementation of authentiffication service.
 * This class declares abstract method for authentification.
 * @author ivanursul
 *
 * @param <INPUT> input.
 */
public abstract class AuthentificationService<INPUT> implements Service<INPUT> {

	/**
	 * Method for authentification.
	 */
	protected abstract void authentificate();
	
}
