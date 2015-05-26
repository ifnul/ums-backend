package org.lnu.is.web.rest.handler.request;

import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.Pair;
import org.lnu.is.resource.message.validation.ValidationMessageResource;
import org.lnu.is.web.exception.InvalidOrderByException;

public class InvalidOrderByExceptionHandlerTest {

	private InvalidOrderByExceptionHandler unit = new InvalidOrderByExceptionHandler();
	
	@Test
	public void test() throws Exception {
		// Given
		String msg = "msg";
		InvalidOrderByException e = new InvalidOrderByException(msg);

		String orderByPattern = null;
		String message = MessageFormat.format("Failed validation for orderBy field : {0}", e.getValue());
		
		Pair<String, String> pair = new Pair<String, String>("orderBy", "Pattern: " + orderByPattern);
		List<Pair<String, String>> fields = Arrays.asList(pair);
		MessageResource expected = new ValidationMessageResource(MessageType.ERROR, message, fields);
		
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
}
