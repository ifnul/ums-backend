package org.lnu.is.web.rest.handler.edbo;

import org.lnu.is.dao.exception.EntityNotFoundException;
import org.lnu.is.edbo.exeption.EdboExeption;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.MessageFormat;

/**
 * Created by illya on 09.05.16.
 */
public class EdboExeptionHandler implements BaseExceptionHandler<EdboExeption> {
    private static final Logger LOGGER = LoggerFactory.getLogger(EdboExeption.class);

    @Override
    @ResponseBody
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = { EntityNotFoundException.class })
    public MessageResource handle(final EdboExeption e) {
        LOGGER.error("Handling edbo not found exception", e);

        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        e.printStackTrace(printWriter);

        MessageResource message = new MessageResource();
        message.setMessageType(MessageType.ERROR);
        message.setMessage(e.getMessage());
        message.setCause(String.format("{0}: {1}", e.getType().toString(), result.toString()));

        return message;
    }
}
