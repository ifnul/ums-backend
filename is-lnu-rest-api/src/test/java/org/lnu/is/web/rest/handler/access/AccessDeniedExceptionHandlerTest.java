package org.lnu.is.web.rest.handler.access;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.security.exception.AccessDeniedException;

public class AccessDeniedExceptionHandlerTest {

	private AccessDeniedExceptionHandler unit = new AccessDeniedExceptionHandler();
	
	@Test
	public void testHandle() throws Exception {
		// Given
		AccessDeniedException e = new AccessDeniedException("");

    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
		
		// When
		MessageResource actual = unit.handle(e);
		
		// Then
		assertEquals(expected, actual);
	}
}
