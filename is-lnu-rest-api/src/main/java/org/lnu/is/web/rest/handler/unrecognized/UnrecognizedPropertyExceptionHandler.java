package org.lnu.is.web.rest.handler.unrecognized;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.validation.UnrecognizedPropertyMessageResource;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Exception Handler for handling unrecognized exceptions.
 */
@ControllerAdvice
public class UnrecognizedPropertyExceptionHandler implements BaseExceptionHandler<UnrecognizedPropertyException> {
    private static  final Logger LOG = LoggerFactory.getLogger(UnrecognizedPropertyExceptionHandler.class);
    public static final String UNRECOGNIZED_PROPERTY_SENT = "Unrecognized Property sent";

    @ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler(value = { UnrecognizedPropertyException.class })
    @ResponseBody
    @Override
    public MessageResource handle(final UnrecognizedPropertyException e) throws Exception {
        LOG.error("Handling unrecognized exception", e);
        List<String> fields = e.getKnownPropertyIds().stream().map(property -> property.toString()).collect(Collectors.toList());
        return new UnrecognizedPropertyMessageResource(MessageType.ERROR, UNRECOGNIZED_PROPERTY_SENT, e.getPropertyName(), fields);
    }
}
