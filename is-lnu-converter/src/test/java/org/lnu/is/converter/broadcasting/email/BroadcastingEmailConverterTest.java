package org.lnu.is.converter.broadcasting.email;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.mailing.model.Attachment;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

public class BroadcastingEmailConverterTest {

	private BroadcastingEmailConverter unit = new BroadcastingEmailConverter();
	
	private String sender = "sender";
	
	@Before
	public void setup() {
		unit.setSender(sender);
	}
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String content = "content";
		String recipient1 = "recipient1";
		String recipient2 = "recipient2";
		List<String> recipient = Arrays.asList(recipient1, recipient2);
		Boolean isHtml = false;
		String topic = "topic";

		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setTopic(topic);
		source.setContent(content);
		source.setRecipients(recipient);
		source.setIsHtml(isHtml);
		
		Recipient rec1 = new Recipient(recipient1);
		Recipient rec2 = new Recipient(recipient2);
		List<Recipient> recipients = Arrays.asList(rec2, rec1);

		Email expected = new Email();
		expected.setTopic(source.getTopic());
		expected.setContent(source.getContent());

		expected.setAttachments(Collections.<Attachment>emptyList());
		expected.setCcRecipients(Collections.<Recipient>emptyList());
		expected.setSender(sender);
		expected.setHtml(source.getIsHtml());
		expected.setRecipients(recipients);
		
		// When
		Email actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithEmptyRecipients() throws Exception {
		// Given
		String content = "content";
		List<String> recipient = Collections.emptyList();
		Boolean isHtml = false;
		String topic = "topic";
		
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setTopic(topic);
		source.setContent(content);
		source.setRecipients(recipient);
		source.setIsHtml(isHtml);
		
		List<Recipient> recipients = Collections.emptyList();
		
		Email expected = new Email();
		expected.setTopic(source.getTopic());
		expected.setContent(source.getContent());
		
		expected.setAttachments(Collections.<Attachment>emptyList());
		expected.setCcRecipients(Collections.<Recipient>emptyList());
		expected.setSender(sender);
		expected.setHtml(source.getIsHtml());
		expected.setRecipients(recipients);
		
		// When
		Email actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNullRecipients() throws Exception {
		// Given
		String content = "content";
		List<String> recipient = null;
		Boolean isHtml = false;
		String topic = "topic";
		
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setTopic(topic);
		source.setContent(content);
		source.setRecipients(recipient);
		source.setIsHtml(isHtml);
		
		List<Recipient> recipients = Collections.emptyList();
		
		Email expected = new Email();
		expected.setTopic(source.getTopic());
		expected.setContent(source.getContent());
		
		expected.setAttachments(Collections.<Attachment>emptyList());
		expected.setCcRecipients(Collections.<Recipient>emptyList());
		expected.setSender(sender);
		expected.setHtml(source.getIsHtml());
		expected.setRecipients(recipients);
		
		// When
		Email actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
