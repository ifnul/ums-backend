package org.lnu.is.mailing.service;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.sender.EmailSenderAdapter;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultMailServiceTest {

	@Mock
	private EmailSenderAdapter mailSenderAdapter;
	
	private DefaultMailService unit = new DefaultMailService();
	
	@Before
	public void setup() {
		unit.setMailSenderAdapter(mailSenderAdapter);
	}
	
	@Test
	public void test() throws Exception {
		// Given
		Email email = new Email();

		// When
		unit.send(email);

		// Then
		verify(mailSenderAdapter).send(email);
	}
}
