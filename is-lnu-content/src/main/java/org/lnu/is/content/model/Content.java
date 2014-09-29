package org.lnu.is.content.model;

import java.io.InputStream;

import org.lnu.is.model.content.MimeType;

public class Content {
	
	private String path;
	
	private Long size;
	
	private InputStream contentStream;
	
	private MimeType mimeType;

	public String getPath() {
		return path;
	}

	public void setPath(final String path) {
		this.path = path;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(final Long size) {
		this.size = size;
	}

	public InputStream getContentStream() {
		return contentStream;
	}

	public void setContentStream(final InputStream contentStream) {
		this.contentStream = contentStream;
	}

	public MimeType getMimeType() {
		return mimeType;
	}

	public void setMimeType(final MimeType mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public String toString() {
		return "Content [path=" + path + ", size=" + size + ", mimeType=" + mimeType + "]";
	}
}
