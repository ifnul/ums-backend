package org.lnu.is.security.service;

import java.util.List;

import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;

/**
 * Interface for declaring all operations with session user.
 * @author ivanursul
 *
 */
public interface SessionService {

	
	/**
	 * Method for getting session details.
	 * @return session.
	 */
	Session getSession();
	
	/**
	 * Method for getting authorized user.
	 * @return session.
	 */
	User getUser();

	/**
	 * Method for gettings roles.
	 * @return roles
	 */
	List<String> getRoles();
	
	/**
	 * Method for gettings user groups.
	 * @return groups
	 */
	List<String> getGroups();
	
	/**
	 * Method for getting default group of authentificated user.
	 * @return default group.
	 */
	Group getDefaultGroup();

	/**
	 * Method for verifying groups.
	 * @param title
	 */
	void verifyGroup(String title);
}
