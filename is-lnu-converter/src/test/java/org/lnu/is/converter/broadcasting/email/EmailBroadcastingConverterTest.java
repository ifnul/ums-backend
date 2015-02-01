package org.lnu.is.converter.broadcasting.email;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

public class EmailBroadcastingConverterTest {

	private EmailBroadcastingConverter unit = new EmailBroadcastingConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String content = "content";
		boolean isHtml = true;
		String email = "ivanon2@gmail.com";
		String sender = "sender";
		String topic = "topic";
		
		Recipient recipient1 = new Recipient(email);
		List<Recipient> recipients = Arrays.asList(recipient1);
		
		Email source = new Email();
		source.setContent(content);
		source.setHtml(isHtml);
		source.setRecipients(recipients);
		source.setSender(sender);
		source.setTopic(topic);

		List<String> recpts = Arrays.asList(email);
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		expected.setContent(source.getContent());
		expected.setIsHtml(source.isHtml());
		expected.setRecipients(recpts);
		expected.setTopic(source.getTopic());
		
		// When
		BroadcastingMessageResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		Email source = new Email();
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		expected.setRecipients(Collections.<String>emptyList());
		expected.setIsHtml(false);
		
		// When
		BroadcastingMessageResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
