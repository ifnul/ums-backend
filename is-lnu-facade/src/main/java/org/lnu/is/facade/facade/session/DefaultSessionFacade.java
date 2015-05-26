package org.lnu.is.facade.facade.session;

import javax.annotation.Resource;

import org.lnu.is.converter.Converter;
import org.lnu.is.domain.session.Session;
import org.lnu.is.resource.session.SessionResource;
import org.lnu.is.security.service.SessionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Facade for session operations.
 * @author ivanursul
 *
 */
@Component("sessionFacade")
@Transactional
public class DefaultSessionFacade implements SessionFacade {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultSessionFacade.class);

	@Resource(name = "sessionConverter")
	private Converter<Session, SessionResource> entityConverter;

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Override
	public SessionResource getCurrentSession() {
		Session session = sessionService.getSession();
		SessionResource resource = entityConverter.convert(session);
		LOG.info("Exposing session details: {}", resource);
		return resource;
	}

}
