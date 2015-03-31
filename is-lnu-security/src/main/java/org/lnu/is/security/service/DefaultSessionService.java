package org.lnu.is.security.service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.security.exception.AccessDeniedException;
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

		return ((Session) principal).getUser();
	}

	@Override
	public List<String> getRoles() {
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		List<String> roles = new ArrayList<String>();
		
		for (GrantedAuthority grantedAuthority : authorities) {
			roles.add(grantedAuthority.getAuthority());
		}
		
		return roles;
	}

	@Override
	public List<String> getGroups() {
		List<String> groups = new ArrayList<>();
		User user = getUser();
		
		for (Group group : user.getGroups()) {
			groups.add(group.getTitle());
		}
		
		return groups;
	}

	@Override
	public Group getDefaultGroup() {
		Group defaultGroup = null;
		User user = getUser();
		
		for (UserGroup userGroup : user.getUserGroups()) {
			
			if (userGroup.getMajor()) {
				defaultGroup = userGroup.getGroup();
				break;
			}
		}
		
		return defaultGroup;
	}

	@Override
	public void verifyGroup(final String title) {
		List<String> groups = getGroups();
		Boolean result = false;
		
		for (String groupTitle : groups) {
			if (groupTitle.equals(title)) {
				result = true;
				break;
			}
		}
		
		if (!result) {
			throw new AccessDeniedException("Access to appropriate group is denied to current user");
		}
		
	}

	@Override
	public Session getSession() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getDetails();
		
		return (Session) principal;
	}
	

}
