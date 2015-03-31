package org.is.lnu.edbo.handler;

import java.text.MessageFormat;
import java.util.Map;

import org.is.lnu.edbo.handler.exception.ExceptionThrower;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import ua.edboservice.ArrayOfDLastError;
import ua.edboservice.DLastError;
import ua.edboservice.EDBOPersonSoap;

/**
 * Exception Handler for Person edbo.
 * @author ivanursul
 *
 */
@Component("edboPersonExceptionHandler")
public class DefaultExceptionHandler extends BaseExceptionHandler<EDBOPersonSoap> {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultExceptionHandler.class);

	private Map<Integer, ExceptionThrower> exceptionThrowers; 
	
	@Override
	public void handle(final String sessionGUID) {
		EDBOPersonSoap client = getServiceManager().getWebServiceClient();
		ArrayOfDLastError lastError = client.getLastError(sessionGUID);
		
		for (DLastError error: lastError.getDLastError()) {
			LOG.error(MessageFormat.format("{0} {1}", error.getLastErrorDescription(), error.getLastErrorCode()));
			
			ExceptionThrower thrower = exceptionThrowers.get(error.getLastErrorCode());
			// TODO :CHECK is no thrower exists -> throw IllegalArgumentException.
			thrower.throwException(error);
		}		
	}

	public void setExceptionThrowers(final Map<Integer, ExceptionThrower> exceptionThrowers) {
		this.exceptionThrowers = exceptionThrowers;
	}

}
