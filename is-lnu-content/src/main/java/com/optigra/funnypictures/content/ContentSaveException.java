package com.optigra.funnypictures.content;

public class ContentSaveException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ContentSaveException() {
		super();
	}

	public ContentSaveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ContentSaveException(String message, Throwable cause) {
		super(message, cause);
	}

	public ContentSaveException(String message) {
		super(message);
	}

	public ContentSaveException(Throwable cause) {
		super(cause);
	}
}
