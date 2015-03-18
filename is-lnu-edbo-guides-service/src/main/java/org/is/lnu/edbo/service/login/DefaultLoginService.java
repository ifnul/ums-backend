package org.is.lnu.edbo.service.login;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.is.lnu.edbo.model.Authentification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Login service for edbo.
 * @author ivanursul
 *
 */
public class DefaultLoginService implements LoginService {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultLoginService.class);
	
	private Authentification auth;
	private EDBOGuidesSoap soap;
	
	@Override
	@PostConstruct
	public void login() {
		//String sessionGUID = soap.login(auth.getLogin(), auth.getPassword(), auth.getClearPreviousSession(), auth.getApplicationKey());
		String sessionGUID = "sessionGUID";
		auth.setSessionGUID(sessionGUID);
	}

	@Override
	@PreDestroy
	public void logout() {
		LOG.info(auth.getSessionGUID());
	}

	public void setAuthentification(final Authentification authentification) {
		this.auth = authentification;
	}

	public void setSoap(final EDBOGuidesSoap soap) {
		this.soap = soap;
	}

}
