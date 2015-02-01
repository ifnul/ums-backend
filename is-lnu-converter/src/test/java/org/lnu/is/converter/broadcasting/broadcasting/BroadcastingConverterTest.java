package org.lnu.is.converter.broadcasting.broadcasting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

public class BroadcastingConverterTest {

	private BroadcastingConverter unit = new BroadcastingConverter();
	
	@Test
	public void test() throws Exception {
		// Given
		Long id = 1L;
		BroadcastingMessageResource source = new BroadcastingMessageResource();
		source.setId(id);
		
		// When
		BroadcastingMessageResource actual = unit.convert(source);

		// Then
		assertEquals(source, actual);
	}
}
