package org.lnu.is.security.service;

import java.text.MessageFormat;
import java.util.Collection;

import org.lnu.is.domain.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Default implementation of session service.
 * @author ivanursul
 *
 */
public class DefaultSessionService implements SessionService {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSessionService.class);
	
	@Override
	public User getUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getDetails();
		LOG.info(MessageFormat.format("Getting session user: {0}", principal));

		return (User) principal;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		return authorities;
	}
	
}
