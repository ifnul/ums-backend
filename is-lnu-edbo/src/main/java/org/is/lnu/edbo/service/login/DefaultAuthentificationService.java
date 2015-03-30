package org.is.lnu.edbo.service.login;

import org.is.lnu.edbo.manager.ServiceManager;
import org.is.lnu.edbo.model.authentification.Authentification;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Service for loggin into edbo system.
 * @author ivanursul
 *
 */
public class DefaultAuthentificationService implements AuthentificationService {

	private ServiceManager<EDBOGuidesSoap> serviceManager;
	
	@Override
	public Authentification login(final Authentification auth) {
		EDBOGuidesSoap client = serviceManager.getWebServiceClient();
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), auth.getClearPreviousSession(), auth.getApplicationKey());
		String login = auth.getLogin();
		String password = auth.getPassword();
		String applicationKey = auth.getApplicationKey();
		Integer clearPreviousSession = auth.getClearPreviousSession();
		
		return new Authentification(login, password, applicationKey, clearPreviousSession, sessionGuid);
	}

	@Override
	public void logout(final Authentification authentification) {
		EDBOGuidesSoap client = serviceManager.getWebServiceClient();
		client.logout(authentification.getSessionGUID());
	}

	public void setServiceManager(final ServiceManager<EDBOGuidesSoap> serviceManager) {
		this.serviceManager = serviceManager;
	}

}
