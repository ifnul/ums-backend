package org.lnu.is.security.entrypoint;

import static org.mockito.Mockito.verify;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.AuthenticationException;

@RunWith(MockitoJUnitRunner.class)
public class RestAuthenticationEntryPointTest {

	@InjectMocks
	private RestAuthenticationEntryPoint unit;
	
	@Mock
	private HttpServletRequest request;
	
	@Mock
	private HttpServletResponse response;
	
	@Mock
	private AuthenticationException authException;
	
	@Test
	public void testCommence() throws Exception {
		// When
		unit.commence(request, response, authException);;

		// Then
		verify(response).sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}
}
