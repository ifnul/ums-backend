package org.lnu.is.web.rest.handler.request;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.Pair;
import org.lnu.is.resource.message.validation.ValidationMessageResource;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.MethodParameter;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@RunWith(MockitoJUnitRunner.class)
public class BindExceptionHandlerTest {

	private BindExceptionHandler unit = new BindExceptionHandler();
	
	@Mock
	private BindingResult bindingResult;
	
	@Mock
	private MethodParameter parameter;

	@Test
	public void testHandle() throws Exception {
		// Given
		BindException e = new BindException(bindingResult);

		String field = "name";
		String defaultMessage = "not valid";
		FieldError fieldError1 = new FieldError("fdsfsd", field, defaultMessage);
		List<FieldError> errors = Arrays.asList(fieldError1);

    	Pair<String, String> pair = new Pair<String, String>();
    	pair.setName(field);
    	pair.setValue(defaultMessage);
		List<Pair<String, String>> errorResource = Arrays.asList(pair);
		MessageResource expected = new ValidationMessageResource(MessageType.ERROR, "Validation failed, please see following errors", errorResource );
		
		// When
		when(bindingResult.getFieldErrors()).thenReturn(errors);
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testHandleWithEmptyErrors() throws Exception {
		// Given
		BindException e = new BindException(bindingResult);
		
		List<Pair<String, String>> errorResource = Collections.emptyList();
		MessageResource expected = new ValidationMessageResource(MessageType.ERROR, "Validation failed, please see following errors", errorResource );
		
		// When
		when(bindingResult.getFieldErrors()).thenReturn(Collections.<FieldError>emptyList());
		MessageResource actual = unit.handle(e);
		
		// Then
		assertEquals(expected, actual);
	}
}
