package org.lnu.is.web.rest.handler.entity;

import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;

import org.junit.Test;
import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.domain.person.Person;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;

public class EntityNotFoundExceptionHandlerTest {

	private EntityNotFoundExceptionHandler unit = new EntityNotFoundExceptionHandler();
	
	@Test
	public void testHandle() throws Exception {
		// Given
		String msg = "No entity found";
		EntityNotFoundException e = new EntityNotFoundException(msg, Person.class, 1L);

    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
    	expected.setCause(MessageFormat.format("{0} : {1}", e.getClz().getSimpleName(), e.getIdentifier()));
    	
		// When
		MessageResource actual = unit.handle(e);

		// Then
		assertEquals(expected, actual);
	}
	
}
