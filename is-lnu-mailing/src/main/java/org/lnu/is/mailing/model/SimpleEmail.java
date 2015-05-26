package org.lnu.is.mailing.model;

import java.util.List;


/**
 * Simple email, without attachments.
 * @author ivanursul
 *
 */
public class SimpleEmail {

	private List<Recipient> recipients;
	private List<Recipient> ccRecipients;
	private String sender;
	private String topic;
	private boolean isHtml;
	
	/**
	 * Constructor with all fields.
	 * @param recipients recipients
	 * @param ccRecipients ccRecipients
	 * @param sender sender
	 * @param topic topic
	 * @param isHtml isHtml
	 */
	public SimpleEmail(final List<Recipient> recipients,
			final List<Recipient> ccRecipients, final String sender, final String topic,
			final boolean isHtml) {
		super();
		this.recipients = recipients;
		this.ccRecipients = ccRecipients;
		this.sender = sender;
		this.topic = topic;
		this.isHtml = isHtml;
	}

	/**
	 * Default constructor.
	 */
	public SimpleEmail() {
		super();
	}

	public List<Recipient> getRecipients() {
		return recipients;
	}
	
	public void setRecipients(final List<Recipient> recipients) {
		this.recipients = recipients;
	}
	
	public List<Recipient> getCcRecipients() {
		return ccRecipients;
	}
	
	public void setCcRecipients(final List<Recipient> ccRecipients) {
		this.ccRecipients = ccRecipients;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setSender(final String sender) {
		this.sender = sender;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(final String topic) {
		this.topic = topic;
	}
	
	public boolean isHtml() {
		return isHtml;
	}
	
	public void setHtml(final boolean isHtml) {
		this.isHtml = isHtml;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((ccRecipients == null) ? 0 : ccRecipients.hashCode());
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
		SimpleEmail other = (SimpleEmail) obj;
		if (ccRecipients == null) {
			if (other.ccRecipients != null) {
				return false;
			}
		} else if (!ccRecipients.equals(other.ccRecipients)) {
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
		return "SimpleEmail [recipients=" + recipients + ", ccRecipients="
				+ ccRecipients + ", sender=" + sender + ", topic=" + topic
				+ ", isHtml=" + isHtml + "]";
	}
	
}
