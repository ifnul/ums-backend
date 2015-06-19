package org.lnu.is.dao.persistence.verifier.group;

import org.lnu.is.dao.persistence.verifier.DefaultVerifierChainLink;
import org.lnu.is.domain.EntityModel;
import org.lnu.is.security.service.SessionService;

/**
 * Verifier, that will check whether user velongs to appropriate
 * group from entity, or not.
 * @author ivanursul
 *
 * @param <T> model.
 */
public class GroupVerifierChainLink<T extends EntityModel> extends DefaultVerifierChainLink<T> {

	private SessionService sessionService;
	
	@Override
	protected void verifyLink(final T resource) {
		sessionService.verifyGroup(resource.getCrtUserGroup());
	}

	public void setSessionService(final SessionService sessionService) {
		this.sessionService = sessionService;
	}

}
