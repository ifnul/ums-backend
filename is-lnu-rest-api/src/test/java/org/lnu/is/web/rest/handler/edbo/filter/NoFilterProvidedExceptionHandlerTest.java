package org.lnu.is.web.rest.handler.edbo.filter;

import static org.junit.Assert.assertEquals;

import org.is.lnu.edbo.exception.NoFilterProvidedException;
import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;

public class NoFilterProvidedExceptionHandlerTest {

	private NoFilterProvidedExceptionHandler unit = new NoFilterProvidedExceptionHandler();
	
	@Test
	public void testHandle() throws Exception {
		// Given
		String msg = "No entity found";
		NoFilterProvidedException e = new NoFilterProvidedException(msg, "edbo message", 1004);

    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
    	
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
}
