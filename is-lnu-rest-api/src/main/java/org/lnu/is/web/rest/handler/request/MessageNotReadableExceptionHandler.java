package org.lnu.is.web.rest.handler.request;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
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
 * This exception handler is executed, when you
 * will send invalid message to backend.
 * For example, you will forgot to add bracket to
 * json message.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class MessageNotReadableExceptionHandler implements BaseExceptionHandler<HttpMessageNotReadableException> {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageNotReadableExceptionHandler.class);
	
	@ExceptionHandler(value = { HttpMessageNotReadableException.class })
	@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
	@ResponseBody
	@Override
	public MessageResource handle(final HttpMessageNotReadableException e) throws Exception {
		LOGGER.error("Handling message not readable exception", e);
		return new MessageResource(MessageType.ERROR, e.getMessage());
	}
}
