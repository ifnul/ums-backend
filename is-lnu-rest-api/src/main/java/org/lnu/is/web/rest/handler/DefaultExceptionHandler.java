package org.lnu.is.web.rest.handler;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Handler for some common exceptions.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class DefaultExceptionHandler implements BaseExceptionHandler<Exception> {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultExceptionHandler.class);
	
    @Override
	@ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = { IllegalArgumentException.class, UnsupportedOperationException.class })
    public MessageResource handle(final Exception e) {
    	LOGGER.error("Handling general exception exception", e);

    	MessageResource message = new MessageResource();
    	message.setMessageType(MessageType.ERROR);
    	message.setMessage(e.getMessage());
    	
		return message;
    }
	
}
