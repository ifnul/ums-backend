package org.lnu.is.web.rest.handler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;

public class DefaultExceptionHandlerTest {

	private DefaultExceptionHandler unit = new DefaultExceptionHandler();
	
	@Test
	public void testHandle() throws Exception {
		// Given
		String msg = "No entity found";
		IllegalArgumentException e = new IllegalArgumentException(msg);

    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
    	
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
}
