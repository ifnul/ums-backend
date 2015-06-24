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
public class BroadcastingFacade extends DefaultFacade<BroadcastingMessage, BroadcastingMessageResource, BroadcastingMessage,
		BroadcastingMessageResource, DefaultService<BroadcastingMessage,
		BroadcastingMessage, Long, Dao<BroadcastingMessage, BroadcastingMessage, Long>>, Long> {

	private Converter<BroadcastingMessageResource, Email> broadcastResourceEmailConverter;

	private Converter<Email, BroadcastingMessageResource> emailBroadcastingConverter;

	private Converter<BroadcastingMessageResource, BroadcastingMessageResource> broadcastingConverter;
	
	private MailService<Email> mailService;

	@Override
	public BroadcastingMessageResource createResource(final BroadcastingMessageResource resource) {
		BroadcastingMessageResource createdResource = super.createResource(resource);
		Email email = broadcastResourceEmailConverter.convert(resource);
		mailService.send(email);
		
		BroadcastingMessageResource result = new BroadcastingMessageResource();
		emailBroadcastingConverter.convert(email, result);
		broadcastingConverter.convert(createdResource, result);
		
		return result;
	}

	public void setBroadcastResourceEmailConverter(final Converter<BroadcastingMessageResource, Email> broadcastResourceEmailConverter) {
		this.broadcastResourceEmailConverter = broadcastResourceEmailConverter;
	}

	public void setMailService(final MailService<Email> mailService) {
		this.mailService = mailService;
	}

	public void setEmailBroadcastingConverter(final Converter<Email, BroadcastingMessageResource> emailBroadcastingConverter) {
		this.emailBroadcastingConverter = emailBroadcastingConverter;
	}

	public void setBroadcastinConverter(final Converter<BroadcastingMessageResource, BroadcastingMessageResource> broadcastinConverter) {
		this.broadcastingConverter = broadcastinConverter;
	}

}
