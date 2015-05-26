package org.is.lnu.edbo.handler.exception;

import org.is.lnu.edbo.exception.NoFilterProvidedException;
import org.springframework.stereotype.Component;

import ua.edboservice.DLastError;

/**
 * Exception Thrower for No Filter Provided Exception.
 * @author ivanursul
 *
 */
@Component("noFilterProvidedExceptionThrower")
public class NoFilterProvidedExceptionThrower implements ExceptionThrower {

	@Override
	public void throwException(final DLastError error) {
		throw new NoFilterProvidedException("No Filter Provided", error.getLastErrorDescription(), error.getLastErrorCode());
	}

}
