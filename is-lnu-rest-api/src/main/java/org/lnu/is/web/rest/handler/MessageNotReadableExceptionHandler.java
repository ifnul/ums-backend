package org.lnu.is.web.rest.handler;

import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception Handlers for handling not valid requests.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class MessageNotReadableExceptionHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageNotReadableExceptionHandler.class);
	
	/**
	 * Method for handling not valid post/put requests.
	 * @param e
	 * @return message resource.
	 * @throws Exception basic exception.
	 */
	@ExceptionHandler(value = { HttpMessageNotReadableException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public MessageResource handle(final HttpMessageNotReadableException e) throws Exception {
		LOGGER.error("Handling message not readable exception", e);
		
		return new MessageResource(MessageType.WARN, e.getMessage());
	}
}
