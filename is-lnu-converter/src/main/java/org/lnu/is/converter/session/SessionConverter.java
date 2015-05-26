package org.lnu.is.converter.session;

import java.util.ArrayList;
import java.util.List;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.role.Role;
import org.lnu.is.domain.session.Session;
import org.lnu.is.resource.session.SessionResource;

/**
 * Session converter.
 * @author ivanursul
 *
 */
@Converter("sessionConverter")
public class SessionConverter extends AbstractConverter<Session, SessionResource> {

	@Override
	public SessionResource convert(final Session source, final SessionResource target) {
		
		List<String> roles = getRoles(source);
		List<String> groups = getGroups(source);
		
		target.setGroups(groups);
		target.setRoles(roles);
		
		if (source.getUser() != null) {
			target.setLogin(source.getUser().getLogin());
		}
		
		return target;
	}

	/**
	 * Method for converting groups.
	 * @param source
	 * @return groups.
	 */
	private List<String> getGroups(final Session source) {
		List<String> groups = new ArrayList<>();
		
		for (Group group : source.getGroups()) {
			groups.add(group.getTitle());
		}
		
		return groups;
	}

	/**
	 * Method for converting  Roles.
	 * @param source
	 * @return roles.
	 */
	private List<String> getRoles(final Session source) {
		List<String> roles = new ArrayList<>();
		
		for (Role role : source.getRoles()) {
			roles.add(role.getTitle());
		}
		
		return roles;
	}

	@Override
	public SessionResource convert(final Session source) {
		return convert(source, new SessionResource());
	}

}
