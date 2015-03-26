package org.is.lnu.edbo.exception;

/**
 * Exception for storing information about disabled web service.
 * @author ivanursul
 *
 */
public class DisabledEDBOException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for storing messages.
	 * @param message
	 */
	public DisabledEDBOException(final String message) {
		super(message);
	}

}
