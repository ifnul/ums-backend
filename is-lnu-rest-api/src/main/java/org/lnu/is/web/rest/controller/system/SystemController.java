package org.lnu.is.web.rest.controller.system;

import static org.lnu.is.web.rest.constant.Constants.JAVAX_SERVLET_ERROR_EXCEPTION;
import static org.lnu.is.web.rest.constant.Constants.JAVAX_SERVLET_ERROR_MESSAGE;
import static org.lnu.is.web.rest.constant.Constants.JAVAX_SERVLET_ERROR_STATUS_CODE;

import javax.servlet.http.HttpServletRequest;

import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Controller for system stuff.
 * @author ivanursul
 *
 */
@RestController
public class SystemController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(SystemController.class);

    /**
     * Servlet Error's handler.
     *
     * @param errorCode - code of Http status
     * @param request - {@link HttpServletRequest}
     * @return {@link ResponseEntity}
     */
    @RequestMapping(value = "/error/{errorCode}")
    public ResponseEntity<MessageResource> handleException(@PathVariable(value = "errorCode") final Integer errorCode, 
    		final HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute(JAVAX_SERVLET_ERROR_STATUS_CODE);
        String exceptionMessage = (String) request.getAttribute(JAVAX_SERVLET_ERROR_MESSAGE);
        Throwable exception = (Throwable) request.getAttribute(JAVAX_SERVLET_ERROR_EXCEPTION);

        LOGGER.error("Handle exception from Servlet container: status code - " + statusCode, exception);

        Integer responseCode = statusCode;
        String msg = "Exception occured";

        if (errorCode != null) {
        	responseCode = errorCode;
        }
        
        if (exceptionMessage != null) {
        	msg = exceptionMessage;
        }
        
        MessageResource message = new MessageResource(MessageType.ERROR, msg, responseCode);

        return new ResponseEntity<MessageResource>(message, HttpStatus.valueOf(responseCode));
    }

}
