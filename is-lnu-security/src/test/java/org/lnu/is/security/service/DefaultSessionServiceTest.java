package org.lnu.is.security.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.user.User;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSessionServiceTest {

	@InjectMocks
	private DefaultSessionService unit;
	
	@Mock
	private SecurityContext context;

	@Mock
	private Authentication authentification;
	
	@Before
	public void setup() {
		SecurityContextHolder.setContext(context);
	}
	
	@Test
	public void testGetUser() throws Exception {
		// Given
		User expected = new User();

		// When
		when(context.getAuthentication()).thenReturn(authentification);
		when(authentification.getDetails()).thenReturn(expected);
		
		User actual = unit.getUser();
		
		// Then
		assertEquals(expected, actual);
	}
}
