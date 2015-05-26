package org.lnu.is.resource.message;

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
	private String cause;
	
	/**
	 * Default constructor.
	 */
	public MessageResource() {
		super();
	}

	/**
	 * Constructor with parameters.
	 * TODO: Remove this constructir from all controllers PUT and DELETE methods.
	 * @param messageType message Type.
	 * @param message message.
	 */
	public MessageResource(final MessageType messageType, final String message) {
		super();
		this.messageType = messageType;
		this.message = message;
	}

	/**
	 * Constructor with parameters and without message.
	 * @param messageType message Type.
	 */
	public MessageResource(final MessageType messageType) {
		super();
		this.messageType = messageType;
	}
	
	/**
	 * Constructor with all fields.
	 * @param messageType messageType
	 * @param message message
	 * @param httpCode httpCode
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

	public String getCause() {
		return cause;
	}

	public void setCause(final String cause) {
		this.cause = cause;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cause == null) ? 0 : cause.hashCode());
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
		if (cause == null) {
			if (other.cause != null) {
				return false;
			}
		} else if (!cause.equals(other.cause)) {
			return false;
		}
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
				+ message + ", httpCode=" + httpCode + ", entity=" + cause
				+ "]";
	}
	
}
