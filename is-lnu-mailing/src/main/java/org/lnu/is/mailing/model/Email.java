package org.lnu.is.mailing.model;

import java.util.ArrayList;
import java.util.List;


/**
 * Model for describign whole email.
 * @author ivanursul
 *
 */
public class Email extends SimpleEmail {

	private List<Attachment> attachments;
	private String content;
	
	/**
	 * Default constructor.
	 */
	public Email() {
		super();
	}

	/**
	 * Constructor with all fields.
	 * @param recipients
	 * @param ccRecipients
	 * @param sender
	 * @param topic
	 * @param isHtml
	 */
	public Email(final List<Recipient> recipients, final List<Recipient> ccRecipients,
			final String sender, final String topic, final boolean isHtml) {
		super(recipients, ccRecipients, sender, topic, isHtml);
		attachments = new ArrayList<>();
	}
	
	/**
	 * Copy constructor.
	 * @param mail
	 */
	public Email(final SimpleEmail mail) {
		this(mail.getRecipients(), mail.getCcRecipients(), mail.getSender(), mail.getTopic(), mail.isHtml());
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}
	
	public void setAttachments(final List<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(final String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((attachments == null) ? 0 : attachments.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Email other = (Email) obj;
		if (attachments == null) {
			if (other.attachments != null) {
				return false;
			}
		} else if (!attachments.equals(other.attachments)) {
			return false;
		}
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Email [attachments=" + attachments + ", content=" + content
				+ "]";
	}

}
