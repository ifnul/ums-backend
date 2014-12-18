package org.lnu.is.facade.resource.message;

/**
 * Resource for getting information
 * about request.
 * @author ivanursul
 *
 */
public class MessageResource {

	private MessageType messageType;
	private String message;
	private Integer httpCode;
	/**
	 * Default constructor.
	 */
	public MessageResource() {
		super();
	}

	/**
	 * Constructor with parameters.
	 * @param messageType message Type.
	 * @param message message.
	 */
	public MessageResource(final MessageType messageType, final String message) {
		super();
		this.messageType = messageType;
		this.message = message;
	}
	
	/**
	 * Constructor with all fields.
	 * @param messageType
	 * @param message
	 * @param httpCode
	 */
	public MessageResource(final MessageType messageType, final String message, final Integer httpCode) {
		super();
		this.messageType = messageType;
		this.message = message;
		this.httpCode = httpCode;
	}

	public MessageType getMessageType() {
		return messageType;
	}
	
	public void setMessageType(final MessageType messageType) {
		this.messageType = messageType;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(final String message) {
		this.message = message;
	}

	public Integer getHttpCode() {
		return httpCode;
	}

	public void setHttpCode(final Integer httpCode) {
		this.httpCode = httpCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((httpCode == null) ? 0 : httpCode.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((messageType == null) ? 0 : messageType.hashCode());
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
		MessageResource other = (MessageResource) obj;
		if (httpCode == null) {
			if (other.httpCode != null) {
				return false;
			}
		} else if (!httpCode.equals(other.httpCode)) {
			return false;
		}
		if (message == null) {
			if (other.message != null) {
				return false;
			}
		} else if (!message.equals(other.message)) {
			return false;
		}
		if (messageType != other.messageType) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MessageResource [messageType=" + messageType + ", message="
				+ message + ", httpCode=" + httpCode + "]";
	}
	
}
