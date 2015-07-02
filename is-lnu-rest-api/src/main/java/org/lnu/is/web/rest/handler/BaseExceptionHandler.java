package org.lnu.is.web.rest.handler;

import org.lnu.is.resource.message.MessageResource;

/**
 * Base interface, that declares basic signature for all exception handlers.
 * @author ivanursul
 *
 * @param <EXCEPTION> Exception class. 
 */
public interface BaseExceptionHandler<EXCEPTION extends Throwable> {

	/**
	 * Method for handling all types of exception.
	 * @param e e
	 * @return message resource.
	 * @throws Exception exception.
	 */
	MessageResource handle(EXCEPTION e) throws Exception;
}
