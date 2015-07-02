package org.lnu.is.web.exception;

/**
 * Exception, that describes invalid regex.
 * @author ivanursul
 *
 */
public class InvalidOrderByException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String value;

	/**
	 * Constructor, that takes all required parameters.
	 * @param value value.
	 */
	public InvalidOrderByException(final String value) {
		super("Invalid string for order by field");
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
