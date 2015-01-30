package org.lnu.is.mailing.service;

import org.lnu.is.mailing.model.Email;

/**
 * Default mail service, that sends simple mail
 * with no content.
 * @author ivanursul
 *
 * @param <T> resource.
 */
public class DefaultMailService<T> extends AbstractMailService<T> {

	@Override
	public void send(final T content) {
		Email email = new Email(getMail());
		getMailSenderAdapter().send(email);
	}

}
