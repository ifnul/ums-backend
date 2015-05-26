package org.lnu.is.mailing.service;

/**
 * Interface for declaring all mail operations.
 * @author ivanursul
 *
 * @param <T> Resource
 */
public interface MailService<T> {

	/**
	 * Method for sending mail.
	 * @param resource resource.
	 */
	void send(T resource);
}
