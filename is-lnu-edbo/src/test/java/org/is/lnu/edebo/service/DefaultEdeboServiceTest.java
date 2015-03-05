package org.is.lnu.edebo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.ws.client.core.WebServiceTemplate;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEdeboServiceTest {

	@Mock
    private WebServiceTemplate webServiceTemplate;
	
	@InjectMocks
	private DefaultEdeboService<Object> unit;
	
	@Test
	public void testExecute() throws Exception {
		// Given
		Object input = new Object();

		Object expected = new Object();
		// When
		when(webServiceTemplate.marshalSendAndReceive(any())).thenReturn(expected);
		Object actual = unit.execute(input);

		// Then
		verify(webServiceTemplate).marshalSendAndReceive(input);
		assertEquals(expected, actual);
	}
}
