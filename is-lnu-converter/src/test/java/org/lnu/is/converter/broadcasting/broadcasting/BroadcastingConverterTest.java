package org.lnu.is.converter.broadcasting.broadcasting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

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
		
		Long id1 = 2L;
		BroadcastingMessageResource source1 = new BroadcastingMessageResource();
		source.setId(id1);
		
		List<BroadcastingMessageResource> sources = Arrays.asList(source,source1);
		
		// When
		List<BroadcastingMessageResource> actuals = unit.convertAll(sources);

		// Then
		assertEquals(sources, actuals);
	}
	
	@Test
	public void testAll() throws Exception {
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
