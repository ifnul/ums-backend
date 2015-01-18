package org.lnu.is.web.rest.handler.request;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.springframework.http.converter.HttpMessageNotReadableException;

public class MessageNotReadableExceptionHandlerTest {

	private MessageNotReadableExceptionHandler unit = new MessageNotReadableExceptionHandler();
	
	@Test
	public void test() throws Exception {
		// Given
		String msg = "msg";
		HttpMessageNotReadableException e = new HttpMessageNotReadableException(msg);

		MessageResource expected = new MessageResource(MessageType.ERROR, e.getMessage());
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
}
