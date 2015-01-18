package org.lnu.is.dao.exception;

/**
 * Custom exception, that mean, that entity does not exists.
 * @author ivanursul
 *
 */
public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Common constuctor.
	 * @param message
	 */
	public EntityNotFoundException(final String message) {
		super(message);
	}

}
