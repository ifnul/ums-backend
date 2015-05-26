package org.lnu.configuration.converters;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CustomObjectMapperTest {

	private CustomObjectMapper unit = new CustomObjectMapper();
	
	@Test
	public void testInstance() throws Exception {
		assertNotNull(unit);
	}
}
