package org.lnu.is.mailing.service;

import org.lnu.is.mailing.model.Email;
import org.lnu.is.mailing.sender.EmailSenderAdapter;

/**
 * Defailt mail service, that takes email as argument.
 * @author ivanursul
 *
 */
public class DefaultMailService implements MailService<Email> {

	private EmailSenderAdapter mailSenderAdapter;
	
	@Override
	public void send(final Email email) {
		mailSenderAdapter.send(email);
	}

	public void setMailSenderAdapter(final EmailSenderAdapter mailSenderAdapter) {
		this.mailSenderAdapter = mailSenderAdapter;
	}

}
