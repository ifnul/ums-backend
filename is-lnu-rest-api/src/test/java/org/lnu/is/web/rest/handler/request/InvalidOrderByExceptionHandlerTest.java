package org.lnu.is.web.rest.handler.request;

import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;

import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.exception.InvalidOrderByException;

public class InvalidOrderByExceptionHandlerTest {

	private InvalidOrderByExceptionHandler unit = new InvalidOrderByExceptionHandler();
	
	@Test
	public void test() throws Exception {
		// Given
		String msg = "msg";
		InvalidOrderByException e = new InvalidOrderByException(msg);

		String orderByPattern = null;
		String message = MessageFormat.format("Failed validation for orderBy field. Required regex - {0} , actual : {1}",
				orderByPattern, e.getValue());
		MessageResource expected = new MessageResource(MessageType.ERROR, message);
		
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
}
