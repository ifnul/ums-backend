package org.lnu.is.security.entrypoint;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

/**
 * Rest Authentification Entry Point.
 * @author ivanursul
 *
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(final HttpServletRequest request,
			final HttpServletResponse response,
			final AuthenticationException authException) throws IOException {
		// TODO : Throw custom exception instead of 
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}
}
