package org.lnu.is.dao.exception;

/**
 * Custom exception, that mean, that entity does not exists.
 * @author ivanursul
 *
 */
public class EntityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Basic constructor.
	 */
	public EntityNotFoundException() {
		super();
	}

	/**
	 * Common constuctor.
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EntityNotFoundException(final String message, final Throwable cause,
			final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Common constuctor.
	 * @param message
	 * @param cause
	 */
	public EntityNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Common constuctor.
	 * @param message
	 */
	public EntityNotFoundException(final String message) {
		super(message);
	}

	/**
	 * Common constuctor.
	 * @param cause
	 */
	public EntityNotFoundException(final Throwable cause) {
		super(cause);
	}

}
