package com.optigra.funnypictures.facade.resources.message;

public class MessageResource {

	private MessageType messageType;
	private String message;
	
	public MessageResource() {
		super();
	}

	public MessageResource(MessageType messageType, String message) {
		super();
		this.messageType = messageType;
		this.message = message;
	}
	
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result
				+ ((messageType == null) ? 0 : messageType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageResource other = (MessageResource) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (messageType != other.messageType)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "MessageResource [messageType=" + messageType + ", message="
				+ message + "]";
	}
	
}
