package org.lnu.is.security.exception;

/**
 * Exception, that describes, that access is denied.
 * @author ivanursul
 *
 */
public class AccessDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor for exceptions.
	 * @param message
	 */
	public AccessDeniedException(final String message) {
		super(message);
	}

}
