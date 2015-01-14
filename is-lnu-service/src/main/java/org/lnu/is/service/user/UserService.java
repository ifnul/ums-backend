package org.lnu.is.service.user;

import org.lnu.is.domain.user.User;

/**
 * User Service interface.
 * @author ivanursul
 *
 */
public interface UserService {

	/**
	 * Method for getting user by login.
	 * @param login
	 * @return User
	 */
	User getUserByLogin(String login);
	
}
