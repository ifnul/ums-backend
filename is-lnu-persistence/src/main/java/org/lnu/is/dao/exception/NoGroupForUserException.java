package org.lnu.is.dao.exception;

import org.lnu.is.domain.user.User;

/**
 * Exception, that describes, that user has no groups attached.
 * @author ivanursul
 *
 */
public class NoGroupForUserException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private User user;
	
	/**
	 * Default constructor.
	 * @param message message
	 */
	public NoGroupForUserException(final String message) {
		super(message);
	}

	public User getUser() {
		return user;
	}

	public void setUser(final User user) {
		this.user = user;
	}
	
}
