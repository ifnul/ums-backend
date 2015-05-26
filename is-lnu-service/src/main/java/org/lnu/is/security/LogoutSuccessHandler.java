package org.lnu.is.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.login.AuthentificationService;
import org.lnu.is.domain.session.Session;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

/**
 * Logout Success Handler.
 * Needed for closing session of edbo service.
 * @author ivanursul
 *
 */
public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

	private AuthentificationService authentificationService;
	
	@Override
	public void onLogoutSuccess(final HttpServletRequest request, final HttpServletResponse response, final Authentication authentication) throws IOException, ServletException {
		Object details = authentication.getDetails();
		
		if (details != null) {
			Session session = (Session) details;
			EdboAuthentification edboAuthentification = session.getEdboAuthentification();
			
			if (edboAuthentification != null) {
				authentificationService.logout(edboAuthentification);
			}
		}
		
		super.onLogoutSuccess(request, response, authentication);
	}

	public void setAuthentificationService(final AuthentificationService authentificationService) {
		this.authentificationService = authentificationService;
	}

}
