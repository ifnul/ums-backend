package org.lnu.is.mailing.service;

import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.sender.EmailSenderAdapter;
import org.lnu.is.mailing.template.TemplateProvider;

/**
 * Mail service for sending html email.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public class HtmlMailService<T> extends AbstractMailService<T> {

	private TemplateProvider templateProvider;
	
	private String templateURI;
	
	@Override
	public void send(final T resource) {
		EmailSenderAdapter adapter = getMailSenderAdapter();
		String content = templateProvider.process(templateURI, resource);
		Email email = new Email(getMail());
		email.setContent(content);
		
		adapter.send(email);
	}

	public void setTemplateProvider(final TemplateProvider templateProvider) {
		this.templateProvider = templateProvider;
	}

	public void setTemplateURI(final String templateURI) {
		this.templateURI = templateURI;
	}

}
