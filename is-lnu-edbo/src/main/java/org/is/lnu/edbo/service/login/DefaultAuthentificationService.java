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
	
	@Override
	public EdboAuthentification login(final EdboAuthentification auth) {
		EDBOGuidesSoap client = serviceManager.getWebServiceClient();
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), auth.getClearPreviousSession(), auth.getApplicationKey());
		String login = auth.getLogin();
		String password = auth.getPassword();
		String applicationKey = auth.getApplicationKey();
		Integer clearPreviousSession = auth.getClearPreviousSession();
		
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

}
