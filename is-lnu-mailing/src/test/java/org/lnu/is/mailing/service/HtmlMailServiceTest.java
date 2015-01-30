package org.lnu.is.mailing.service;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.mailing.exception.MailException;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.SimpleEmail;
import org.lnu.is.mailing.sender.EmailSenderAdapter;
import org.lnu.is.mailing.template.TemplateProvider;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HtmlMailServiceTest {

	@Mock
	private TemplateProvider templateProvider;
	
	@Mock
	private EmailSenderAdapter mailSenderAdapter;

	private String templateURI = "templateUri";

	@InjectMocks
	private HtmlMailService<String> unit;

	private SimpleEmail mail = new SimpleEmail();

	
	@Before
	public void setup() {
		unit.setMail(mail);
		unit.setTemplateURI(templateURI);
	}
	
	@Test
	public void testSend() throws Exception {
		// Given
		String content = "sfsa";
		Email email = new Email(mail);
		email.setContent(content);
		
		// When
		when(templateProvider.process(anyString(), anyString())).thenReturn(content);
		unit.send(content);

		// Then
		verify(templateProvider).process(templateURI, content);
		verify(mailSenderAdapter).send(email);
	}
	
	@Test(expected = MailException.class)
	public void testSendWithException() throws Exception {
		// Given
		String content = "sfsa";
		Email email = new Email(mail);
		email.setContent(content);
		
		// When
		when(templateProvider.process(anyString(), anyString())).thenReturn(content);
		doThrow(MailException.class).when(mailSenderAdapter).send(email);
		unit.send(content);
		
		// Then
		verify(templateProvider).process(templateURI, content);
		verify(mailSenderAdapter).send(email);
	}
}
