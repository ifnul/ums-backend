package org.is.lnu.edbo.service.login;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.is.lnu.edbo.manager.ServiceManager;
import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.EDBOGuidesSoap;

@RunWith(MockitoJUnitRunner.class)
public class DefaultAuthentificationServiceTest {

	@Mock
	private ServiceManager<EDBOGuidesSoap> serviceManager;
	
	@Mock
	private EDBOGuidesSoap edboGuidesSoap;

	@InjectMocks
	private DefaultAuthentificationService unit;
	
	private String applicationKey = "application key";
	
	private Integer clearPreviousSession = 1;
	
	@Before
	public void setup() {
		when(serviceManager.getWebServiceClient()).thenReturn(edboGuidesSoap);
		
		unit.setApplicationKey(applicationKey);
		unit.setClearPreviousSession(clearPreviousSession);
	}
	
	@Test
	public void testLogin() throws Exception {
		// Given
		String login = "login";
		String password = "password";
		String sessionGUID = "sessionGUID";
		
		EdboAuthentification auth = new EdboAuthentification();
		auth.setLogin(login);
		auth.setPassword(password);

		EdboAuthentification expected = new EdboAuthentification(login, password, applicationKey, clearPreviousSession, sessionGUID);
		
		// When
		when(edboGuidesSoap.login(anyString(), anyString(), anyInt(), anyString())).thenReturn(sessionGUID);
		EdboAuthentification actual = unit.login(auth);

		// Then
		verify(serviceManager).getWebServiceClient();
		verify(edboGuidesSoap).login(login, password, clearPreviousSession, applicationKey);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLogout() throws Exception {
		// Given
		String applicationKey = "applicationKey";
		Integer clearPreviousSession = 1;
		String login = "login";
		String password = "password";
		String sessionGUID = "sessionGUID";
		
		EdboAuthentification auth = new EdboAuthentification();
		auth.setApplicationKey(applicationKey);
		auth.setClearPreviousSession(clearPreviousSession);
		auth.setLogin(login);
		auth.setPassword(password);
		auth.setSessionGUID(sessionGUID);

		// When
		unit.logout(auth);

		// Then
		verify(serviceManager).getWebServiceClient();
		verify(edboGuidesSoap).logout(sessionGUID);
	}
}
