package org.lnu.is.dao.verifier.group;

import org.lnu.is.dao.verifier.DefaultVerifierChainLink;
import org.lnu.is.domain.Model;
import org.lnu.is.security.service.SessionService;

/**
 * Verifier, that will check whether user velongs to appropriate
 * group from entity, or not.
 * @author ivanursul
 *
 * @param <T>
 */
public class GroupVerifierChainLink<T extends Model> extends DefaultVerifierChainLink<T> {

	private SessionService sessionService;
	
	@Override
	protected void verifyLink(final T resource) {
		sessionService.verifyGroup(resource.getCrtUserGroup());
	}

	public void setSessionService(final SessionService sessionService) {
		this.sessionService = sessionService;
	}

}
