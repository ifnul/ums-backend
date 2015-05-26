package org.lnu.is.dao.persistence.verifier.group;

import java.text.MessageFormat;
import java.util.List;

import org.lnu.is.dao.exception.NoGroupForUserException;
import org.lnu.is.dao.persistence.verifier.DefaultVerifierChainLink;
import org.lnu.is.domain.user.User;
import org.lnu.is.security.service.SessionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Verifier that checks is user has some groups.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public class GroupExistanceVerifierChainLink<T> extends DefaultVerifierChainLink<T> {
	private static final Logger LOG = LoggerFactory.getLogger(GroupExistanceVerifierChainLink.class);
	
	private SessionService sessionService;
	
	@Override
	protected void verifyLink(final T resource) {
		List<String> groups = sessionService.getGroups();
		User user = sessionService.getUser();
		
		if (groups.isEmpty()) {
			LOG.info(MessageFormat.format("There is no group for user:{0}", user.getLogin()));
			NoGroupForUserException e = new NoGroupForUserException("There is no group for user");
			e.setUser(user);
			throw e;
		}
		
	}

	public void setSessionService(final SessionService sessionService) {
		this.sessionService = sessionService;
	}

}
