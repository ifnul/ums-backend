package org.lnu.is.web.rest.handler.access;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.security.exception.AccessDeniedException;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Controller, that handles access exceptions.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class AccessDeniedExceptionHandler implements BaseExceptionHandler<AccessDeniedException> {
	private static final Logger LOG = LoggerFactory.getLogger(AccessDeniedExceptionHandler.class);
	
	@Override
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ResponseBody
	@ExceptionHandler(value = { AccessDeniedException.class })
	public MessageResource handle(final AccessDeniedException e) throws Exception {
    	LOG.error("Handling AccessDeniedException", e);

    	MessageResource message = new MessageResource();
    	message.setMessageType(MessageType.ERROR);
    	message.setMessage(e.getMessage());
    	
		return message;
	}

}
