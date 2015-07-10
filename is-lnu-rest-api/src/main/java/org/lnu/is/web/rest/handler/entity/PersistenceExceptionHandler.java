package org.lnu.is.web.rest.handler.entity;

import org.hibernate.exception.ConstraintViolationException;
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

import javax.persistence.PersistenceException;
import java.text.MessageFormat;

/**
 * Handler for handling persistence exceptions.
 * Date: 07/10/2015
 *
 * @author : Lebedev S.V. aka Moro
 */
@ControllerAdvice
public class PersistenceExceptionHandler implements BaseExceptionHandler<PersistenceException> {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersistenceExceptionHandler.class);

    @Override
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = {PersistenceException.class})
    public MessageResource handle(final PersistenceException e) {
        LOGGER.error("Handling persistence exception", e);

        MessageResource message = new MessageResource();
        message.setMessageType(MessageType.ERROR);
        if (e.getCause() instanceof ConstraintViolationException) {
            message.setMessage(MessageFormat.format("ConstraintViolationName : {0}", ((ConstraintViolationException) e.getCause()).getConstraintName()));
        } else {
            message.setMessage(e.getMessage());
        }

        return message;
    }
}
