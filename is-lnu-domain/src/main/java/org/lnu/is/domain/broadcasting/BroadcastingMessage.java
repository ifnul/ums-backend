package org.lnu.is.domain.broadcasting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.group.Group;

/**
 * Entity for storing broadcast messages.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "q_rp_broadcasting")
public class BroadcastingMessage extends InformationModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "content")
	private String content;
	
	@Column(name = "topic")
	private String topic;

	@Transient
	private List<Group> groups;
	
	@Transient
	private List<String> recipients;
	
	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(final String topic) {
		this.topic = topic;
	}

	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(final List<Group> groups) {
		this.groups = groups;
	}

	public List<String> getRecipients() {
		return recipients;
	}

	public void setRecipients(final List<String> recipients) {
		this.recipients = recipients;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
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
		BroadcastingMessage other = (BroadcastingMessage) obj;
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
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
		return "BroadcastingMessage [content=" + content + ", topic=" + topic
				+ "]";
	}
	
}
