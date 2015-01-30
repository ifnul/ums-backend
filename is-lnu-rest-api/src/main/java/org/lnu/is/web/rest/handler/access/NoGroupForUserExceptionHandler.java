package org.lnu.is.web.rest.handler.access;

import javax.annotation.Resource;

import org.lnu.is.dao.exception.NoGroupForUserException;
import org.lnu.is.domain.user.User;
import org.lnu.is.mailing.service.MailService;
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

/**
 * Exception handler, that say, that current user don't has no groups.
 * TODO: If current exception occurs -> Send email to maintenance team.	
 * example -> mailService.send(e.getUser());
 * @author ivanursul
 *
 */
@ControllerAdvice
public class NoGroupForUserExceptionHandler implements BaseExceptionHandler<NoGroupForUserException> {
	private static final Logger LOG = LoggerFactory.getLogger(NoGroupForUserException.class);

	@Resource(name = "noGroupExceptionHandlerMailService")
	private MailService<User> mailService;
	
	@Override
	@ResponseStatus(value = HttpStatus.FORBIDDEN)
	@ResponseBody
	@ExceptionHandler(value = { NoGroupForUserException.class })
	public MessageResource handle(final NoGroupForUserException e) throws Exception {
    	LOG.error("Handling NoGroupForUserException", e);

    	mailService.send(e.getUser());
    	
    	MessageResource message = new MessageResource();
    	message.setMessageType(MessageType.ERROR);
    	message.setMessage(e.getMessage());
    	
		return message;
	}

}
