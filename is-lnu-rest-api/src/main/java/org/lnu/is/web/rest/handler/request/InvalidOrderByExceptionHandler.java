package org.lnu.is.web.rest.handler.request;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.Pair;
import org.lnu.is.resource.message.validation.ValidationMessageResource;
import org.lnu.is.web.exception.InvalidOrderByException;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception handler, that handles order by invalid regex.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class InvalidOrderByExceptionHandler  implements BaseExceptionHandler<InvalidOrderByException> {
	private static final Logger LOGGER = LoggerFactory.getLogger(MessageNotReadableExceptionHandler.class);
	
	@Resource(name = "orderByRegex")
	private String orderByPattern;
	
	@ExceptionHandler(value = { InvalidOrderByException.class })
	@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
	@ResponseBody
	@Override
	public MessageResource handle(final InvalidOrderByException e) throws Exception {
		LOGGER.error("Handling Invalid order by exception", e);
		
		String message = MessageFormat.format("Failed validation for orderBy field : {0}", e.getValue());
		
		Pair<String, String> pair = new Pair<String, String>("orderBy", "Pattern: " + orderByPattern);
		List<Pair<String, String>> fields = Arrays.asList(pair);
		MessageResource messageResource = new ValidationMessageResource(MessageType.ERROR, message, fields);
		
		return messageResource;
	}
}
