package org.lnu.is.dao.dao.user;

import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.user.User;
import org.lnu.is.queries.Query;

import java.util.Collections;
import java.util.Map;

/**
 * Default User Dao interface.
 * @author ivanursul
 *
 */
public class DefaultUserDao implements UserDao {
	private static final String QUERY = "SELECT u FROM User u WHERE u.login=:login";

	private PersistenceManager<User, Long> persistenceManager;

	@Override
	public User getUserByLogin(final String login) {
		String querySql = QUERY;
		Map<String, Object> parameters = Collections.<String, Object>singletonMap("login", login);
		Query<User> query = new Query<User>(User.class, querySql, parameters);
		return persistenceManager.getSingleResult(query);
	}

	public void setPersistenceManager(PersistenceManager<User, Long> persistenceManager) {
		this.persistenceManager = persistenceManager;
	}
}
