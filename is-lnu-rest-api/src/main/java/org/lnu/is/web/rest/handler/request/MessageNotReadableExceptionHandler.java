package org.lnu.is.web.rest.handler.request;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
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

import javax.annotation.Resource;
import java.util.Map;

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
public class MessageNotReadableExceptionHandler implements BaseExceptionHandler<Exception> {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageNotReadableExceptionHandler.class);

	@Resource(name = "validationExceptionHandlers")
	private Map<String, BaseExceptionHandler> handlers;

	@ExceptionHandler(value = { HttpMessageNotReadableException.class, UnrecognizedPropertyException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	@Override
	public MessageResource handle(final Exception e) throws Exception {
		LOGGER.error("Handling message not readable exception", e);

		MessageResource messageResource = new MessageResource(MessageType.ERROR, e.getMessage());
		BaseExceptionHandler exceptionHandler = handlers.get(e.getCause() != null ? e.getCause().getClass().getName() : "");

		if (exceptionHandler != null) {
			messageResource = exceptionHandler.handle(e.getCause());
		}

		return messageResource;
	}
}
