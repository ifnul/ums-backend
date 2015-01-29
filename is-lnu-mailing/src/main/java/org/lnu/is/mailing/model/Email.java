package org.lnu.is.mailing.model;

import java.util.List;

/**
 * Model for describign whole email.
 * @author ivanursul
 *
 */
public class Email {

	private List<Recipient> recipients;

	private List<Recipient> ccRecipients;

	private List<Attachment> attachments;
	
	private String sender;
	
	private String topic;
	
	private String content;
	
	private boolean isHtml;

	/**
	 * Constructor with all fields.
	 * @param recipients
	 * @param ccRecipients
	 * @param attachments
	 * @param sender
	 * @param topic
	 * @param content
	 * @param isHtml
	 */
	public Email(final List<Recipient> recipients, final List<Recipient> ccRecipients,
			final List<Attachment> attachments, final String sender, final String topic,
			final String content, final boolean isHtml) {
		super();
		this.recipients = recipients;
		this.ccRecipients = ccRecipients;
		this.attachments = attachments;
		this.sender = sender;
		this.topic = topic;
		this.content = content;
		this.isHtml = isHtml;
	}

	/**
	 * Copy constructor.
	 * @param email
	 */
	public Email(final Email email) {
		this(email.getRecipients(), email.getCcRecipients(), email.getAttachments(), 
				email.getSender(), email.getTopic(), email.getContent(), email.isHtml());
	}

	/**
	 * Default constuctor.
	 */
	public Email() {
		super();
	}

	public List<Recipient> getCcRecipients() {
		return ccRecipients;
	}

	public void setCcRecipients(final List<Recipient> ccRecipients) {
		this.ccRecipients = ccRecipients;
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}

	public void setRecipients(final List<Recipient> recipients) {
		this.recipients = recipients;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(final String topic) {
		this.topic = topic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(final String sender) {
		this.sender = sender;
	}

	public boolean isHtml() {
		return isHtml;
	}

	public void setHtml(final boolean isHtml) {
		this.isHtml = isHtml;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(final List<Attachment> attachments) {
		this.attachments = attachments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((attachments == null) ? 0 : attachments.hashCode());
		result = prime * result
				+ ((ccRecipients == null) ? 0 : ccRecipients.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + (isHtml ? 1231 : 1237);
		result = prime * result
				+ ((recipients == null) ? 0 : recipients.hashCode());
		result = prime * result + ((sender == null) ? 0 : sender.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
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
		if (ccRecipients == null) {
			if (other.ccRecipients != null) {
				return false;
			}
		} else if (!ccRecipients.equals(other.ccRecipients)) {
			return false;
		}
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		if (isHtml != other.isHtml) {
			return false;
		}
		if (recipients == null) {
			if (other.recipients != null) {
				return false;
			}
		} else if (!recipients.equals(other.recipients)) {
			return false;
		}
		if (sender == null) {
			if (other.sender != null) {
				return false;
			}
		} else if (!sender.equals(other.sender)) {
			return false;
		}
		if (topic == null) {
			if (other.topic != null) {
				return false;
			}
		} else if (!topic.equals(other.topic)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Email [recipients=" + recipients + ", ccRecipients="
				+ ccRecipients + ", attachments=" + attachments + ", sender="
				+ sender + ", topic=" + topic + ", content=" + content
				+ ", isHtml=" + isHtml + "]";
	}

}
