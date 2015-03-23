package org.lnu.is.web.rest.handler.entity;

import java.text.MessageFormat;

import org.lnu.is.dao.exception.EntityNotFoundException;
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
 * Handlers for handling entity not found exceptions.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class EntityNotFoundExceptionHandler implements BaseExceptionHandler<EntityNotFoundException> {
	private static final Logger LOGGER = LoggerFactory.getLogger(EntityNotFoundException.class);
	
    @Override
	@ResponseBody
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = { EntityNotFoundException.class })
    public MessageResource handle(final EntityNotFoundException e) {
    	LOGGER.error("Handling not found exception", e);

    	MessageResource message = new MessageResource();
    	message.setMessageType(MessageType.ERROR);
    	message.setMessage(e.getMessage());
    	message.setCause(MessageFormat.format("{0} : {1}", e.getClz().getSimpleName(), e.getIdentifier()));
    	
		return message;
    }
	
}
