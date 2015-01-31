package org.lnu.is.facade.facade.broadcasting;

import org.lnu.is.converter.Converter;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.facade.facade.DefaultFacade;
import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.service.MailService;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;
import org.lnu.is.service.DefaultService;
import org.springframework.transaction.annotation.Transactional;

/**
 * Facade for sending broadcast messages.
 * @author ivanursul
 *
 */
@Transactional
public class BroadcastingFacade extends DefaultFacade<BroadcastingMessage, BroadcastingMessageResource, DefaultService<BroadcastingMessage, Long, Dao<BroadcastingMessage, Long>>, Long> {

	private Converter<BroadcastingMessageResource, Email> broadcastResourceEmailConverter;
	
	private MailService<Email> mailService;
	
	@Override
	public BroadcastingMessageResource createResource(final BroadcastingMessageResource resource) {
		Email email = broadcastResourceEmailConverter.convert(resource);
		mailService.send(email);
		BroadcastingMessageResource createdResource = super.createResource(resource);
		// TODO: Retrieve email results, how much messages was send and enhance response 
		// with stat
		return createdResource;
	}

	public void setBroadcastResourceEmailConverter(final Converter<BroadcastingMessageResource, Email> broadcastResourceEmailConverter) {
		this.broadcastResourceEmailConverter = broadcastResourceEmailConverter;
	}

	public void setMailService(final MailService<Email> mailService) {
		this.mailService = mailService;
	}

}
