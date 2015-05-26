package org.lnu.is.resource.broadcasting;

import java.text.MessageFormat;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Broadcasting resource.
 * @author ivanursul
 *
 */
public class BroadcastingMessageResource extends ApiResource {

	@NotNull
	private String content;
	
	@NotNull
	private String topic;
	
	@NotNull
	private Boolean isHtml;
	
	@NotNull
	private List<Long> groups;
	private List<String> recipients;
	
	
	@Override
	public String getUri() {
		return MessageFormat.format("/broadcastings/{0}", getId());
	}

	public Boolean getIsHtml() {
		return isHtml;
	}

	public void setIsHtml(final Boolean isHtml) {
		this.isHtml = isHtml;
	}

	@Override
	public String getRootUri() {
		return "/broadcastings";
	}

	public List<Long> getGroups() {
		return groups;
	}

	public void setGroups(final List<Long> groups) {
		this.groups = groups;
	}

	public List<String> getRecipients() {
		return recipients;
	}

	public void setRecipients(final List<String> recipient) {
		this.recipients = recipient;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((isHtml == null) ? 0 : isHtml.hashCode());
		result = prime * result
				+ ((recipients == null) ? 0 : recipients.hashCode());
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
		BroadcastingMessageResource other = (BroadcastingMessageResource) obj;
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		if (groups == null) {
			if (other.groups != null) {
				return false;
			}
		} else if (!groups.equals(other.groups)) {
			return false;
		}
		if (isHtml == null) {
			if (other.isHtml != null) {
				return false;
			}
		} else if (!isHtml.equals(other.isHtml)) {
			return false;
		}
		if (recipients == null) {
			if (other.recipients != null) {
				return false;
			}
		} else if (!recipients.equals(other.recipients)) {
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
		return "BroadcastingMessageResource [content=" + content + ", topic="
				+ topic + ", isHtml=" + isHtml + ", groups=" + groups
				+ ", recipients=" + recipients + "]";
	}

}
