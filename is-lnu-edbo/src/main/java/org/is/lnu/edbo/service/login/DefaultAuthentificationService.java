package org.is.lnu.edbo.service.login;

import org.is.lnu.edbo.manager.ServiceManager;
import org.is.lnu.edbo.model.authentification.EdboAuthentification;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Service for loggin into edbo system.
 * @author ivanursul
 *
 */
public class DefaultAuthentificationService implements AuthentificationService {

	private ServiceManager<EDBOGuidesSoap> serviceManager;
	
	private String applicationKey;
	
	private Integer clearPreviousSession;
	
	@Override
	public EdboAuthentification login(final EdboAuthentification auth) {
		EDBOGuidesSoap client = serviceManager.getWebServiceClient();
		
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), clearPreviousSession, applicationKey);
		String login = auth.getLogin();
		String password = auth.getPassword();
		
		return new EdboAuthentification(login, password, applicationKey, clearPreviousSession, sessionGuid);
	}

	@Override
	public void logout(final EdboAuthentification authentification) {
		EDBOGuidesSoap client = serviceManager.getWebServiceClient();
		client.logout(authentification.getSessionGUID());
	}

	public void setServiceManager(final ServiceManager<EDBOGuidesSoap> serviceManager) {
		this.serviceManager = serviceManager;
	}

	public void setApplicationKey(final String applicationKey) {
		this.applicationKey = applicationKey;
	}

	public void setClearPreviousSession(final Integer clearPreviousSession) {
		this.clearPreviousSession = clearPreviousSession;
	}

}
