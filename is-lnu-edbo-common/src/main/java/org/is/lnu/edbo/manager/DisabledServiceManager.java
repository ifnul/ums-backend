package org.is.lnu.edbo.manager;

import org.is.lnu.edbo.exception.DisabledEDBOException;
import org.springframework.stereotype.Component;

/**
 * Web Service Manager for disabled contexts.
 * Will Throw exception if there will be disabled integration in the system.
 * @author ivanursul
 *
 * @param <WEBSERVICE>
 */
@Component("disabledWebServiceManager")
public class DisabledServiceManager<WEBSERVICE> implements ServiceManager<WEBSERVICE> {

	@Override
	public WEBSERVICE getWebServiceClient() {
		throw new DisabledEDBOException("EDBO integration is disabled");
	}

}
