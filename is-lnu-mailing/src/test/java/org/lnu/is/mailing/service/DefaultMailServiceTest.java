package org.lnu.is.mailing.service;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.mailing.exception.MailException;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.SimpleEmail;
import org.lnu.is.mailing.sender.EmailSenderAdapter;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMailServiceTest {

	@Mock
	private EmailSenderAdapter mailSenderAdapter;

	@InjectMocks
	private DefaultMailService<String> unit;

	private SimpleEmail mail = new SimpleEmail();
	
	@Before
	public void setup() {
		unit.setMail(mail);
	}
	
	@Test
	public void testSend() throws Exception {
		// Given
		String content = "simple email";
		Email email = new Email(mail);

		// When
		unit.send(content);

		// Then
		verify(mailSenderAdapter).send(email);
	}
	
	@Test(expected = MailException.class)
	public void testSendWithException() throws Exception {
		// Given
		String content = "simple email";
		Email email = new Email(mail);
		
		// When
		doThrow(MailException.class).when(mailSenderAdapter).send(any(Email.class));
		unit.send(content);
		
		// Then
		verify(mailSenderAdapter).send(email);
	}
}
