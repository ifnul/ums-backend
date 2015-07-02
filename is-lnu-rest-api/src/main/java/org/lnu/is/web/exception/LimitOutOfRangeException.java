package org.lnu.is.web.exception;

/**
 * Limit out of range exception.
 * This exception occurs, when limit will be out of range.
 * @author ivanursul
 *
 */
public class LimitOutOfRangeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private Integer actualLimit;
	
	/**
	 * Default constructor.
	 * @param actualLimit actualLimit.
	 * @param message message.
	 */
	public LimitOutOfRangeException(final Integer actualLimit, final String message) {
		super(message);
		this.actualLimit = actualLimit;
	}

	public Integer getActualLimit() {
		return actualLimit;
	}

}
