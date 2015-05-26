package org.lnu.is.mailing.model;

import java.io.InputStream;

/**
 * Model for mail attachment.
 * @author ivanursul
 *
 */
public class Attachment {

	private String fileName;
	private InputStream inputStream;
	
	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}
	
	public InputStream getInputStream() {
		return inputStream;
	}
	
	public void setInputStream(final InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result
				+ ((inputStream == null) ? 0 : inputStream.hashCode());
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
		Attachment other = (Attachment) obj;
		if (fileName == null) {
			if (other.fileName != null) {
				return false;
			}
		} else if (!fileName.equals(other.fileName)) {
			return false;
		}
		if (inputStream == null) {
			if (other.inputStream != null) {
				return false;
			}
		} else if (!inputStream.equals(other.inputStream)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Attachment [fileName=" + fileName + ", inputStream="
				+ inputStream + "]";
	}
	
}
