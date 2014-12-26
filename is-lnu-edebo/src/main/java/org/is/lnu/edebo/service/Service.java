package org.is.lnu.edebo.service;

/**
 * Service interface.
 * @author ivanursul
 *
 * @param <INPUT> class, which takes input class.
 */
public interface Service<INPUT> {

	/**
	 * Method, which sends request.
	 * @param input
	 * @return ouput.
	 */
	Object execute(INPUT input);
}
