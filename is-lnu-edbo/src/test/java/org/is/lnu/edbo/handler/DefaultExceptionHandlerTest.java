package org.is.lnu.edbo.handler;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.is.lnu.edbo.handler.exception.ExceptionThrower;
import org.is.lnu.edbo.manager.ServiceManager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.ArrayOfDLastError;
import ua.edboservice.DLastError;
import ua.edboservice.EDBOPersonSoap;


@RunWith(MockitoJUnitRunner.class)
public class DefaultExceptionHandlerTest {

	private static final String NO_THROWER_MESSAGE = "There is no handler for this type of edbo error code. Please, contact dev team with information about: errorCode:{0} , message: {1}";
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@InjectMocks
	private DefaultExceptionHandler unit;
	
	@Mock
	private ServiceManager<EDBOPersonSoap> serviceManager;

	@Mock
	private ExceptionThrower noFilterProvidedExceptionThrower;

	@Mock
	private EDBOPersonSoap client;

	private Map<Integer, ExceptionThrower> exceptionThrowers = new HashMap<Integer, ExceptionThrower>();

	@Before
	public void setup() {
		exceptionThrowers.put(1004, noFilterProvidedExceptionThrower);
		unit.setExceptionThrowers(exceptionThrowers);
	}
	
	@Test
	public void testHandle() throws Exception {
		// Given
		DLastError error = new DLastError();
		error.setLastErrorCode(1004);
		error.setLastErrorDescription("description");
		
		List<DLastError> dLastError = Arrays.asList(error);
		String sessionGUID = "SessionGUID";
		ArrayOfDLastError arrayOfDLastError = new ArrayOfDLastError();
		arrayOfDLastError.setdLastError(dLastError);

		// When
		when(serviceManager.getWebServiceClient()).thenReturn(client);
		when(client.getLastError(anyString())).thenReturn(arrayOfDLastError);
		unit.handle(sessionGUID);

		// Then
		verify(serviceManager).getWebServiceClient();
		verify(client).getLastError(sessionGUID);
		verify(noFilterProvidedExceptionThrower).throwException(error);
	}

	@Test
	public void testHandleWithUnsupportedOperationException() throws Exception {
		// Given
		exceptionThrowers.clear();
		DLastError error = new DLastError();
		error.setLastErrorCode(1004);
		error.setLastErrorDescription("description");
		
		List<DLastError> dLastError = Arrays.asList(error);
		String sessionGUID = "SessionGUID";
		ArrayOfDLastError arrayOfDLastError = new ArrayOfDLastError();
		arrayOfDLastError.setdLastError(dLastError);
		
		// When
		when(serviceManager.getWebServiceClient()).thenReturn(client);
		when(client.getLastError(anyString())).thenReturn(arrayOfDLastError);
		
		exception.expect(UnsupportedOperationException.class);
		exception.expectMessage(MessageFormat.format(NO_THROWER_MESSAGE, error.getLastErrorCode(), error.getLastErrorDescription()));
		
		unit.handle(sessionGUID);
		
		// Then
		verify(serviceManager).getWebServiceClient();
		verify(client).getLastError(sessionGUID);
		verify(noFilterProvidedExceptionThrower).throwException(error);
	}
}
