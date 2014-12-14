package org.lnu.is.web.rest.controller;

import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Basic Controller.
 * Remember to extend this controller, when you are writing new controller.
 * @author ivanursul
 *
 */
public abstract class BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);
	
	/**
	 * Base method for handling exception. 
	 * @param e exception instance
	 * @return message resource.
	 */
	@ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = { Exception.class })
    public MessageResource handleException(final Exception e) {
    	LOG.error("Handling general exception", e);
    	
        MessageResource message = new MessageResource();
        message.setMessageType(MessageType.WARN);
        message.setMessage(e.getMessage());

        return message;
    }
    
	/**
	 * Method, that handles not found status.
	 * @param e
	 * @return message resource.
	 */
    @ResponseBody
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = { EntityNotFoundException.class })
    public MessageResource handleNotFoundException(final Exception e) {
    	LOG.error("Handling not found exception", e);

    	MessageResource message = new MessageResource();
    	message.setMessageType(MessageType.WARN);
    	message.setMessage(e.getMessage());
    	
		return message;
    }

}
