package org.lnu.is.web.rest.constant;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RequestTest {

	@Test
	public void testID() throws Exception {
		// Given
		String expected = "/{id}";
		
		// When
		String actual = Request.ID;

		// Then
		assertEquals(expected, actual);
	}
}
