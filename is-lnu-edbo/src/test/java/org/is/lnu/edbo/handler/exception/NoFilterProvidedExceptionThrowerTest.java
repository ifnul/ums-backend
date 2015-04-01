package org.is.lnu.edbo.handler.exception;

import org.is.lnu.edbo.exception.NoFilterProvidedException;
import org.junit.Test;

import ua.edboservice.DLastError;

public class NoFilterProvidedExceptionThrowerTest {

	private NoFilterProvidedExceptionThrower unit = new NoFilterProvidedExceptionThrower();
	
	@Test(expected = NoFilterProvidedException.class)
	public void testThrowException() throws Exception {
		// Given
		DLastError error = new DLastError();
		error.setLastErrorCode(1004);
		error.setLastErrorDescription("description");

		// When
		unit.throwException(error);

		// Then
	}
}
