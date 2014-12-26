package org.is.lnu.edebo.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Default service.
 * @author ivanursul
 *
 * @param <INPUT> input resource.
 */
public class DefaultService<INPUT> extends AuthentificationService<INPUT> {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultService.class);
	
    private WebServiceTemplate webServiceTemplate;
	
	@Override
	public Object execute(final INPUT input) {
		LOGGER.info("Sending request to integration service");
		return webServiceTemplate.marshalSendAndReceive(input);
	}

	@Override
	@PostConstruct
	protected void authentificate() {
		// Execute authentification with webServiceTemplate
	}

	public void setWebServiceTemplate(final WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}

}
