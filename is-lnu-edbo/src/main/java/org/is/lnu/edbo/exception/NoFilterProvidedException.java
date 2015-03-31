package org.is.lnu.edbo.exception;

/**
 * No Filter Provided Exception.
 * @author ivanursul
 *
 */
public class NoFilterProvidedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String edboMessage;
	
	private Integer edboCode;

	public NoFilterProvidedException(final String message, final String edboMessage, final Integer edboCode) {
		super(message);
		this.edboMessage = edboMessage;
		this.edboCode = edboCode;
	}

	public String getEdboMessage() {
		return edboMessage;
	}

	public Integer getEdboCode() {
		return edboCode;
	}
	
}
