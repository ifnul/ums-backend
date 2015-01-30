package org.lnu.is.web.rest.handler.access;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.exception.NoGroupForUserException;
import org.lnu.is.domain.user.User;
import org.lnu.is.mailing.service.MailService;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NoGroupForUserExceptionHandlerTest {

	@Mock
	private MailService<User> mailService;
	
	@InjectMocks
	private NoGroupForUserExceptionHandler unit;
	
	@Test
	public void testHandle() throws Exception {
		// Given
		User user = new User();
		NoGroupForUserException e = new NoGroupForUserException("");
		e.setUser(user);
		
    	MessageResource expected = new MessageResource();
    	expected.setMessageType(MessageType.ERROR);
    	expected.setMessage(e.getMessage());
		
		// When
		MessageResource actual = unit.handle(e);
		
		// Then
		verify(mailService).send(user);
		assertEquals(expected, actual);
	}
}
