package org.lnu.is.populator.broadcasting.email;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.mailing.model.Attachment;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.model.Recipient;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.lnu.is.service.user.group.UserGroupService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BroadcastingEmailConverterTest {

	@Mock
	private UserGroupService userGroupService;
	
	@InjectMocks
	private BroadcastingEmailConverter unit;
	
	private String sender = "sender";

	@Before
	public void setup() {
		unit.setSender(sender);
	}
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String userEmail = "email@email.email";
		UserGroupView userGroup1 = new UserGroupView();
		userGroup1.setUserEmail(userEmail);
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
		Recipient rec3 = new Recipient(userEmail);
		List<Recipient> recipients = Arrays.asList(rec3, rec2, rec1);

		Email expected = new Email();
		expected.setTopic(source.getTopic());
		expected.setContent(source.getContent());

		expected.setAttachments(Collections.<Attachment>emptyList());
		expected.setCcRecipients(Collections.<Recipient>emptyList());
		expected.setSender(sender);
		expected.setHtml(source.getIsHtml());
		expected.setRecipients(recipients);
		
		List<UserGroupView> userGroups = Arrays.asList(userGroup1);
		// When
		when(userGroupService.getUserGroupsView(anyListOf(Long.class))).thenReturn(userGroups);
		
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
