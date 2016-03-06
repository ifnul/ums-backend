package org.lnu.is.service.user;

import org.lnu.is.dao.dao.user.UserDao;
import org.lnu.is.domain.user.User;

/**
 * Default User Service.
 * @author ivanursul
 *
 */
public class DefaultUserService implements UserService {

	private UserDao dao;

	@Override
	public User getUserByLogin(final String login) {
		return dao.getUserByLogin(login);
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}
