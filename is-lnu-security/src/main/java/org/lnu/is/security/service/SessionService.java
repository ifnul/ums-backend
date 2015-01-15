package org.lnu.is.security.service;

import java.util.Collection;

import org.lnu.is.domain.user.User;
import org.springframework.security.core.GrantedAuthority;

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

	/**
	 * Method for getting authorities.
	 * @return collection of authorities.
	 */
	Collection<? extends GrantedAuthority> getAuthorities();
	
}
