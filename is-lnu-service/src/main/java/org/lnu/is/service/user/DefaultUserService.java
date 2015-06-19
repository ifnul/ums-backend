package org.lnu.is.service.user;

import org.lnu.is.dao.dao.user.UserDao;
import org.lnu.is.domain.user.User;
import org.lnu.is.service.DefaultService;

/**
 * Default User Service.
 * @author ivanursul
 *
 */
public class DefaultUserService extends DefaultService<User, User, Long, UserDao> implements UserService {

	@Override
	public User getUserByLogin(final String login) {
		return getDao().getUserByLogin(login);
	}

}
