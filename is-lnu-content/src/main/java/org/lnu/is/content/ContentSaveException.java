package org.lnu.is.content;

public class ContentSaveException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * Common exception constructor.
	 */
	public ContentSaveException() {
		super();
	}
	
	/**
	 * Common exception constructor.
	 * @param message message.
	 * @param cause cause.
	 * @param enableSuppression enableSuppression
	 * @param writableStackTrace writableStackTrace
	 */
	public ContentSaveException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Common exception constructor.
	 * @param message message
	 * @param cause cause
	 */
	public ContentSaveException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Common exception constructor.
	 * @param message message
	 */
	public ContentSaveException(final String message) {
		super(message);
	}

	/**
	 * Common exception constructor.
	 * @param cause cause
	 */
	public ContentSaveException(final Throwable cause) {
		super(cause);
	}
}
