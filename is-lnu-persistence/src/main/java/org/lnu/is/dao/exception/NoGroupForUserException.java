package org.lnu.is.dao.exception;

import org.lnu.is.domain.user.User;

/**
 * Exception, that describes, that user has no groups attached.
 * @author ivanursul
 *
 */
public class NoGroupForUserException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private User currentUser;
	
	/**
	 * Default constructor.
	 * @param message
	 */
	public NoGroupForUserException(final String message) {
		super(message);
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(final User currentUser) {
		this.currentUser = currentUser;
	}
	
}
