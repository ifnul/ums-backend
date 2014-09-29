package org.lnu.is.content;

public class ContentReadException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public ContentReadException() {
		super();
	}

	/**
	 * Common exception constructor.
	 * @param message message.
	 * @param cause cause.
	 * @param enableSuppression enableSuppression
	 * @param writableStackTrace writableStackTrace
	 */
	public ContentReadException(final String message, final Throwable cause,
			final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Common exception constructor.
	 * @param message message
	 * @param cause cause
	 */
	public ContentReadException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Common exception constructor.
	 * @param message message
	 */
	public ContentReadException(final String message) {
		super(message);
	}

	/**
	 * Common exception constructor.
	 * @param cause cause
	 */
	public ContentReadException(final Throwable cause) {
		super(cause);
	}
}
