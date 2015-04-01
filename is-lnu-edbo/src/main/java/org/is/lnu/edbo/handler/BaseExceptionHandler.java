package org.is.lnu.edbo.handler;

import org.is.lnu.edbo.manager.ServiceManager;

/**
 * Abstract class for all exception handlers.
 * @author ivanursul
 *
 * @param <WEBSERVICE> web service class.
 */
public abstract class BaseExceptionHandler<WEBSERVICE> implements ExceptionHandler {
	
	private ServiceManager<WEBSERVICE> serviceManager;

	public ServiceManager<WEBSERVICE> getServiceManager() {
		return serviceManager;
	}

	public void setServiceManager(final ServiceManager<WEBSERVICE> serviceManager) {
		this.serviceManager = serviceManager;
	}
}
