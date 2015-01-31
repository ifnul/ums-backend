package org.lnu.is.converter.broadcasting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

public class BroadcastingConverterTest {

	private BroadcastingConverter unit = new BroadcastingConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String topic = "topic";
		String content = "content";
		
		BroadcastingMessage source = new BroadcastingMessage();
		source.setContent(content);
		source.setTopic(topic);

		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		expected.setTopic(topic);
		expected.setContent(content);
		
		// When
		BroadcastingMessageResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String topic = "topic";
		String content = "content";
		
		BroadcastingMessage source = new BroadcastingMessage();
		source.setContent(content);
		source.setTopic(topic);
		List<BroadcastingMessage> sources = Arrays.asList(source);
		
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		expected.setTopic(topic);
		expected.setContent(content);
		List<BroadcastingMessageResource> expecteds = Arrays.asList(expected);
		
		// When
		List<BroadcastingMessageResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertAllWithEmptyFields() throws Exception {
		// Given
		BroadcastingMessage source = new BroadcastingMessage();
		List<BroadcastingMessage> sources = Arrays.asList(source);
		
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		List<BroadcastingMessageResource> expecteds = Arrays.asList(expected);
		
		// When
		List<BroadcastingMessageResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		BroadcastingMessage source = new BroadcastingMessage();
		BroadcastingMessageResource expected = new BroadcastingMessageResource();
		
		// When
		BroadcastingMessageResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
