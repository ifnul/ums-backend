package org.lnu.is.web.rest.handler.edbo.filter;

import org.is.lnu.edbo.exception.NoFilterProvidedException;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception Handler for handling No Filter Provided Exception Handler.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class NoFilterProvidedExceptionHandler implements BaseExceptionHandler<NoFilterProvidedException>  {
	private static final Logger LOGGER = LoggerFactory.getLogger(NoFilterProvidedExceptionHandler.class);
	
	@ExceptionHandler(value = { NoFilterProvidedException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	@Override
	public MessageResource handle(final NoFilterProvidedException e) throws Exception {
		LOGGER.error("Handling NoFilterProvidedException", e);
		// TODO: Add Edbo Code and Edbo Message.
		return new MessageResource(MessageType.ERROR, e.getMessage());
	}
}
