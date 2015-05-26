package org.lnu.is.facade.facade.session;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.converter.Converter;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.role.Role;
import org.lnu.is.domain.session.Session;
import org.lnu.is.domain.user.User;
import org.lnu.is.resource.session.SessionResource;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultSessionFacadeTest {

	@Mock
	private Converter<Session, SessionResource> entityConverter;

	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private DefaultSessionFacade unit;
	
	@Test
	public void testGetCurrentSession() throws Exception {
		// Given
		String login = "login";
		User user = new User();
		user.setLogin(login);

		Session session = new Session();
		session.setUser(user);
		session.setGroups(Collections.<Group>emptyList());
		session.setRoles(Collections.<Role>emptyList());
		
		SessionResource expected = new SessionResource();
		expected.setLogin(login);
		expected.setGroups(Collections.<String>emptyList());
		expected.setRoles(Collections.<String>emptyList());
		
		// When
		when(sessionService.getSession()).thenReturn(session);
		when(entityConverter.convert(any(Session.class))).thenReturn(expected);
		SessionResource actual = unit.getCurrentSession();

		// Then
		verify(sessionService).getSession();
		verify(entityConverter).convert(session);
		
		assertEquals(expected, actual);
	}
}
