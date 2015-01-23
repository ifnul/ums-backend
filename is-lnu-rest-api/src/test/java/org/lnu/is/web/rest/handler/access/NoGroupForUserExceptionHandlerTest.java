package org.lnu.is.web.rest.handler.access;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.dao.exception.NoGroupForUserException;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;

public class NoGroupForUserExceptionHandlerTest {

	private NoGroupForUserExceptionHandler unit = new NoGroupForUserExceptionHandler();
	
	@Test
	public void testHandle() throws Exception {
		// Given
		NoGroupForUserException e = new NoGroupForUserException("");

    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
		
		// When
		MessageResource actual = unit.handle(e);
		
		// Then
		assertEquals(expected, actual);
	}
}
