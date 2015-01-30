package org.lnu.is.mailing.service;

import org.lnu.is.mailing.model.SimpleEmail;
import org.lnu.is.mailing.sender.EmailSenderAdapter;

/**
 * Abstract mail service.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public abstract class AbstractMailService<T> implements MailService<T> {

	private SimpleEmail mail;
	
	private EmailSenderAdapter mailSenderAdapter;

	public void setMail(final SimpleEmail mail) {
		this.mail = mail;
	}

	public SimpleEmail getMail() {
		return mail;
	}
	
	public void setMailSenderAdapter(final EmailSenderAdapter mailSenderAdapter) {
		this.mailSenderAdapter = mailSenderAdapter;
	}

	public EmailSenderAdapter getMailSenderAdapter() {
		return mailSenderAdapter;
	}
	
}
