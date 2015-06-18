package org.lnu.is.web.rest.handler.request;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MessageNotReadableExceptionHandlerTest {

	@InjectMocks
	private MessageNotReadableExceptionHandler unit;

	@Mock
	private Map<String, BaseExceptionHandler> handlers;

	@Mock
	private BaseExceptionHandler exceptionHandler;

	@Test
	public void test() throws Exception {
		// Given
		String msg = "msg";
		HttpMessageNotReadableException e = new HttpMessageNotReadableException(msg);

		MessageResource expected = new MessageResource(MessageType.ERROR, e.getMessage());

		// When
		when(handlers.get(anyString())).thenReturn(null);
		MessageResource actual = unit.handle(e);

		// Then
		verify(handlers).get("");
		assertEquals(expected, actual);
	}

	@Test
	public void testHandleWithHanglersExceptionHandler() throws Exception {
		// Given
		String msg = "msg";
		HttpMessageNotReadableException e = new HttpMessageNotReadableException(msg, new UnrecognizedPropertyException(null, null, null, null, null));

		MessageResource expected = new MessageResource(MessageType.ERROR, e.getMessage());

		// When
		when(handlers.get(anyString())).thenReturn(exceptionHandler);
		when(exceptionHandler.handle(Matchers.<Throwable>any())).thenReturn(expected);
		MessageResource actual = unit.handle(e);

		// Then
		verify(handlers).get(e.getCause().getClass().getName());
		verify(exceptionHandler).handle(e.getCause());
		assertEquals(expected, actual);
	}
}
