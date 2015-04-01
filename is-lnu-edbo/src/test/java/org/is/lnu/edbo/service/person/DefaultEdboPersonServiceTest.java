package org.is.lnu.edbo.service.person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import org.is.lnu.edbo.handler.ExceptionHandler;
import org.is.lnu.edbo.manager.ServiceManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.EDBOPersonSoap;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonsFind;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEdboPersonServiceTest {

	@InjectMocks
	private DefaultEdboPersonService unit;
	
	@Mock
	private ServiceManager<EDBOPersonSoap> serviceManager;

	@Mock
	private EDBOPersonSoap client;

	@Mock
	private ExceptionHandler exceptionHandler;
	
	private String applicationKey = "applicationKey";
	
	private Integer clearPreviousSession = 1;

	@Before
	public void setup() {
		unit.setApplicationKey(applicationKey);
		unit.setClearPreviousSession(clearPreviousSession);
		
		when(serviceManager.getWebServiceClient()).thenReturn(client);
	}

	@Test
	public void testFindPerson() throws Exception {
		// Given
		PersonsFind person = new PersonsFind();
		ArrayOfDPersonsFind expected = new ArrayOfDPersonsFind();

		// When
		when(client.personsFind(
				anyString(), 
				anyString(), 
				anyInt(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyInt(), 
				anyString(), 
				anyString())).thenReturn(expected);
		ArrayOfDPersonsFind actual = unit.findPerson(person);
		
		// Then
		verify(serviceManager).getWebServiceClient();
		verifyZeroInteractions(exceptionHandler);
		assertEquals(expected, actual);
	}

	@Test(expected = RuntimeException.class)
	public void testFindPersonWithNullPerson() throws Exception {
		// Given
		String sessionGUID = "Session GUID";
		PersonsFind person = new PersonsFind();
		person.setSessionGUID(sessionGUID);
		ArrayOfDPersonsFind expected = new ArrayOfDPersonsFind();
		
		// When
		doThrow(RuntimeException.class).when(exceptionHandler).handle(anyString());
		ArrayOfDPersonsFind actual = unit.findPerson(person);
		
		// Then
		verify(serviceManager).getWebServiceClient();
		verify(exceptionHandler).handle(sessionGUID);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCreateAplicationManually() throws Exception {
		// Given
		String address = "address";
		PersonEntrantAdd request = new PersonEntrantAdd();
		request.setAdress(address);

		ArrayOfDPersonAddRet expected = new ArrayOfDPersonAddRet();
		
		// When
		when(client.personEntrantAdd(
				anyString(), 
				anyInt(), 
				anyInt(), 
				anyString(), 
				anyInt(), 
				anyString(), 
				anyString(),
				anyString(), 
				anyString(), 
				anyInt(), 
				anyString(), 
				anyString(),
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(),
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyInt(), 
				anyInt(), 
				anyInt(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(),
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyInt(),
				anyInt(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyString(), 
				anyInt())).thenReturn(expected );
		
		ArrayOfDPersonAddRet actual = unit.createAplicantManually(request);

		// Then
		assertEquals(expected, actual);
	}
}
