package org.lnu.is.facade.facade;

import org.is.lnu.edebo.dispatcher.IntegrationDispatcher;
import org.lnu.is.resource.ApiResource;
import org.lnu.is.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * Facade for integration with edebo system.
 * @author ivanursul
 *
 * @param <ENTITY> Entity.
 * @param <RESOURCE> Resource.
 * @param <SERVICE> Service.
 * @param <KEY> Resource.Key
 */
@Transactional
public class IntegrationFacade<ENTITY, RESOURCE extends ApiResource, SERVICE extends Service<ENTITY, KEY>, KEY> extends DefaultFacade<ENTITY, RESOURCE, SERVICE, KEY> {
	private static final Logger LOGGER = LoggerFactory.getLogger(IntegrationFacade.class);
	
	private IntegrationDispatcher<RESOURCE> createDispatcher;
	
	private IntegrationDispatcher<RESOURCE> updateDispatcher;
	
	@Override
	public RESOURCE createResource(final RESOURCE resource) {
		RESOURCE resultResource = super.createResource(resource);
		executeIntegrationProcess(createDispatcher, resultResource);
		return resultResource;
	}

	@Override
	public void updateResource(final KEY id, final RESOURCE resource) {
		super.updateResource(id, resource);
		executeIntegrationProcess(updateDispatcher, resource);
	}
	
	/**
	 * Common method for all facade methods.
	 * @param dispatcher
	 * @param resource
	 */
	public void executeIntegrationProcess(final IntegrationDispatcher<RESOURCE> dispatcher, final RESOURCE resource) {
		if (dispatcher != null) {
			LOGGER.info("Starting {} integration process for resource:{}", dispatcher.getMethod(), resource);
			dispatcher.dispatch(resource);
		} else {
			LOGGER.warn("Unable to start integration process due to non-existent dispatcher, details:{}", resource);
		}
	}

	public void setCreateDispatcher(final IntegrationDispatcher<RESOURCE> createDispatcher) {
		this.createDispatcher = createDispatcher;
	}

	public void setUpdateDispatcher(final IntegrationDispatcher<RESOURCE> updateDispatcher) {
		this.updateDispatcher = updateDispatcher;
	}
	
}
