package org.lnu.is.web.rest.handler.request;

import java.util.ArrayList;
import java.util.List;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.message.Pair;
import org.lnu.is.resource.message.validation.ValidationMessageResource;
import org.lnu.is.web.rest.handler.BaseExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Default validation exception handler.
 * @author ivanursul
 *
 */
@ControllerAdvice
public class BindExceptionHandler implements BaseExceptionHandler<BindException> {
	private static final Logger LOGGER =  LoggerFactory.getLogger(BindExceptionHandler.class);
	
	@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY)
    @ExceptionHandler(value = { BindException.class })
    @ResponseBody
    @Override
    public MessageResource handle(final BindException e) throws Exception {
    	LOGGER.error("Handling bind validation exception", e);
    	
        BindingResult bindingResult = e.getBindingResult();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<Pair<String, String>> errors = new ArrayList<Pair<String, String>>();
        
        for (FieldError error : fieldErrors) {
            
        	Pair<String, String> pair = new Pair<String, String>();
        	pair.setName(error.getField());
        	pair.setValue(error.getDefaultMessage());
        	
        	errors.add(pair);
        }        
        
        return new ValidationMessageResource(MessageType.ERROR, "Validation failed, please see following errors", errors);
    }
	
}
