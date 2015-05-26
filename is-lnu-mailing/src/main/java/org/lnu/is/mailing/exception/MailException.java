package org.lnu.is.mailing.exception;

/**
 * Custom exception for mail exception situations.
 * @author ivanursul
 *
 */
public class MailException extends RuntimeException {
	private static final long serialVersionUID = -2414207564909105820L;

	/**
	 * Default constructor.
	 * @param message message
	 * @param cause cause
	 */
	public MailException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
