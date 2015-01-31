package org.lnu.is.converter.broadcasting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.domain.group.Group;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

public class BroadcastingResourceConverterTest {

	private BroadcastingResourceConverter unit = new BroadcastingResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String content = "content";
		String topic = "topic";
		String recipient1 = "recipient1@gmail.com";
		String recipient2 = "recipient2@gmail.com";
		
		List<String> recipient = Arrays.asList(recipient1, recipient2);
		
		Long groupId1 = 1L;
		Group group1 = new Group();
		group1.setId(groupId1);
		
		Long groupId2 = 2L;
		Group group2 = new Group();
		group2.setId(groupId2);
		List<Long> groupIds = Arrays.asList(groupId1, groupId2);
		List<Group> groups = Arrays.asList(group1, group2);
		
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setContent(content);
		source.setTopic(topic);
		source.setRecipients(recipient);
		source.setGroups(groupIds);
		
		BroadcastingMessage expected = new BroadcastingMessage();
		expected.setTopic(topic);
		expected.setContent(content);
		expected.setRecipients(recipient);
		expected.setGroups(groups);
		
		// When
		BroadcastingMessage actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		BroadcastingMessage expected = new BroadcastingMessage();
		
		// When
		BroadcastingMessage actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		String content = "content";
		String topic = "topic";
		String recipient1 = "recipient1@gmail.com";
		String recipient2 = "recipient2@gmail.com";
		
		List<String> recipient = Arrays.asList(recipient1, recipient2);
		
		Long groupId1 = 1L;
		Group group1 = new Group();
		group1.setId(groupId1);
		
		Long groupId2 = 2L;
		Group group2 = new Group();
		group2.setId(groupId2);
		List<Long> groupIds = Arrays.asList(groupId1, groupId2);
		List<Group> groups = Arrays.asList(group1, group2);
		
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setContent(content);
		source.setTopic(topic);
		source.setRecipients(recipient);
		source.setGroups(groupIds);
		List<BroadcastingMessageResource> sources = Arrays.asList(source);
		
		BroadcastingMessage expected = new BroadcastingMessage();
		expected.setTopic(topic);
		expected.setContent(content);
		expected.setRecipients(recipient);
		expected.setGroups(groups);
		List<BroadcastingMessage> expecteds = Arrays.asList(expected);
		
		// When
		List<BroadcastingMessage> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertAllWithEmptyFields() throws Exception {
		// Given
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		List<BroadcastingMessageResource> sources = Arrays.asList(source);
		
		BroadcastingMessage expected = new BroadcastingMessage();
		List<BroadcastingMessage> expecteds = Arrays.asList(expected);
		
		// When
		List<BroadcastingMessage> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
