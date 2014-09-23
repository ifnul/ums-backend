package com.optigra.funnypictures.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.optigra.funnypictures.facade.resources.message.MessageResource;
import com.optigra.funnypictures.facade.resources.message.MessageType;

public abstract class BaseController {
	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = { Exception.class })
    @ResponseBody
    public MessageResource handleException(final Exception e) {
    	logger.error("Handling general exception", e);
    	
        MessageResource message = new MessageResource();
        message.setMessageType(MessageType.WARN);
        message.setMessage(e.getMessage());

        return message;
    }
}
