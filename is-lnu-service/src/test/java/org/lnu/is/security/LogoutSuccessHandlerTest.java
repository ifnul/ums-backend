package org.lnu.is.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.session.Session;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LogoutSuccessHandlerTest {

	@InjectMocks
	private LogoutSuccessHandler unit;

	@Mock
	private HttpServletRequest request;

	@Mock
	private HttpServletResponse response;

	@Mock
	private Authentication authentication;
	
	@Test
	public void testOnLogouSuccess() throws Exception {
		// Given
		Session session = new Session();

		// When
		when(authentication.getDetails()).thenReturn(session);
		
		unit.onLogoutSuccess(request, response, authentication);
	}

	@Test
	public void testOnLogouSuccessWithEmptySession() throws Exception {
		// Given
		Session session = new Session();

		// When
		
		unit.onLogoutSuccess(request, response, authentication);

		// Then
		verify(authentication, times(0)).getDetails();
	}
}
