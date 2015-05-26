package org.is.lnu.edbo.service.login;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.BaseEdboService;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Service for loggin into edbo system.
 * @author ivanursul
 *
 */
public class DefaultAuthentificationService extends BaseEdboService<EDBOGuidesSoap> implements AuthentificationService {

	@Override
	public EdboAuthentification login(final EdboAuthentification auth) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		
		String sessionGuid = client.login(auth.getLogin(), auth.getPassword(), getClearPreviousSession(), getApplicationKey());
		String login = auth.getLogin();
		String password = auth.getPassword();
		
		return new EdboAuthentification(login, password, getApplicationKey(), getClearPreviousSession(), sessionGuid);
	}

	@Override
	public void logout(final EdboAuthentification authentification) {
		EDBOGuidesSoap client = getServiceManager().getWebServiceClient();
		client.logout(authentification.getSessionGUID());
	}

}
