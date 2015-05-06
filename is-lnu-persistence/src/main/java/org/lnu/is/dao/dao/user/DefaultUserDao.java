package org.lnu.is.dao.dao.user;

import java.util.Collections;
import java.util.Map;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.user.User;
import org.lnu.is.queries.Query;

/**
 * Default User Dao interface.
 * @author ivanursul
 *
 */
public class DefaultUserDao extends DefaultDao<User, User, Long> implements UserDao {
	private static final String QUERY = "SELECT u FROM User u WHERE u.login=:login";

	@Override
	public User getUserByLogin(final String login) {
		String querySql = QUERY;
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("login", login);
		Query<User> query = new Query<User>(getEntityClass(), querySql, parameters);		
		return getPersistenceManager().getSingleResult(query);
	}

}
