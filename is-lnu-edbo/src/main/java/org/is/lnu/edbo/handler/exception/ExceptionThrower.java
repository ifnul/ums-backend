package org.is.lnu.edbo.handler.exception;

import ua.edboservice.DLastError;

/**
 * Interface for throwing exceptions.
 * @author ivanursul
 *
 */
public interface ExceptionThrower {

	/**
	 * Method for throwing exception.
	 * @param error
	 */
	void throwException(DLastError error);

}
