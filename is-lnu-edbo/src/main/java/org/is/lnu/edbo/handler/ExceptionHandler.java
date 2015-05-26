package org.is.lnu.edbo.handler;

/**
 * Interface, that declares method for handling
 * exceptions from edbo.
 * @author ivanursul
 *
 */
public interface ExceptionHandler {

	/**
	 * Method for handling.
	 * @param sessionGUID sessionGUID.
	 */
	void handle(String sessionGUID);
	
}
