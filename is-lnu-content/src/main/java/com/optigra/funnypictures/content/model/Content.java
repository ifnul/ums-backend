package com.optigra.funnypictures.content.model;

import java.io.InputStream;

import com.optigra.funnypictures.model.content.MimeType;

public class Content {
	
	private String path;
	
	private Long size;
	
	private InputStream contentStream;
	
	private MimeType mimeType;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public InputStream getContentStream() {
		return contentStream;
	}

	public void setContentStream(InputStream contentStream) {
		this.contentStream = contentStream;
	}

	public MimeType getMimeType() {
		return mimeType;
	}

	public void setMimeType(MimeType mimeType) {
		this.mimeType = mimeType;
	}

	@Override
	public String toString() {
		return "Content [path=" + path + ", size=" + size + ", mimeType=" + mimeType + "]";
	}
}
