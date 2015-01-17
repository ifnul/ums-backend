package org.lnu.is.security.service;

import org.lnu.is.domain.user.User;

/**
 * Interface for declaring all operations with session user.
 * @author ivanursul
 *
 */
public interface SessionService {

	/**
	 * Method for getting authorized user.
	 * @return session.
	 */
	User getUser();

}
