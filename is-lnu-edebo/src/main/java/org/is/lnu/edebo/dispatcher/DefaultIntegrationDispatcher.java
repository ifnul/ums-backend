package org.is.lnu.edebo.dispatcher;

import org.apache.camel.CamelContext;
import org.apache.camel.ExchangePattern;
import org.apache.camel.ProducerTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default integration dispatcher.
 * @author ivanursul
 *
 * @param <RESOURCE> resource.
 */
public class DefaultIntegrationDispatcher<RESOURCE> implements IntegrationDispatcher<RESOURCE> {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultIntegrationDispatcher.class);
	
	private CamelContext camelContext;
	
	private Boolean enabled;
	
	private String endpointUri;
	
	@Override
	public void dispatch(final RESOURCE resource) {
		
		// If integration is disabled - method will not execute integratiion endpoint.
		if (!enabled) {
			return;
		}
		
		try {
			ProducerTemplate producerTemplate = camelContext.createProducerTemplate();
			dispatch(resource, producerTemplate);
			producerTemplate.stop();
		} catch (Exception e) {
			LOGGER.warn("Exception occurs while trying to send resource to integration service", e);
		}
	}

	/**
	 * Method, that sends.
	 * @param resource
	 * @param producerTemplate
	 */
	private void dispatch(final RESOURCE resource, final ProducerTemplate producerTemplate) {
		producerTemplate.sendBody(endpointUri, ExchangePattern.InOut, resource);
	}

	public void setCamelContext(final CamelContext camelContext) {
		this.camelContext = camelContext;
	}

	public void setEnabled(final Boolean enabled) {
		this.enabled = enabled;
	}

	public void setEndpointUri(final String endpointUri) {
		this.endpointUri = endpointUri;
	}

}
