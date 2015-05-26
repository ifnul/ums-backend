package org.lnu.is.mailing.sender;

import org.lnu.is.mailing.model.Email;

/**
 * Interface, that describes email sender adapter.
 * @author ivanursul
 *
 */
public interface EmailSenderAdapter {
	
	/**
	 * Single method for sending emails.
	 * @param email
	 */
	void send(Email email);
	
}
