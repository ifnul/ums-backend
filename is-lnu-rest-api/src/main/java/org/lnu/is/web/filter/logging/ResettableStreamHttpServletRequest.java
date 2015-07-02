package org.lnu.is.web.filter.logging;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Resettable stream.
 * @author ivanursul
 *
 */
public class ResettableStreamHttpServletRequest extends HttpServletRequestWrapper {

	private byte[] rawData;
	private HttpServletRequest request;
	private ResettableServletInputStream servletStream;

	/**
	 * Default constructor.
	 * @param request request.
	 */
	public ResettableStreamHttpServletRequest(final HttpServletRequest request) {
		super(request);
		this.request = request;
		this.servletStream = new ResettableServletInputStream();
	}

	/**
	 * reset method.
	 */
	public void resetInputStream() {
		servletStream.stream = new ByteArrayInputStream(rawData);
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		if (rawData == null) {
			rawData = IOUtils.toByteArray(this.request.getReader());
			servletStream.stream = new ByteArrayInputStream(rawData);
		}
		return servletStream;
	}

	@Override
	public BufferedReader getReader() throws IOException {
		if (rawData == null) {
			rawData = IOUtils.toByteArray(this.request.getReader());
			servletStream.stream = new ByteArrayInputStream(rawData);
		}
		return new BufferedReader(new InputStreamReader(servletStream));
	}

	public void setRawData(final byte[] rawData) {
		this.rawData = rawData;
	}

	/**
	 * Servlet input stream.
	 * @author ivanursul
	 *
	 */
	private class ResettableServletInputStream extends ServletInputStream {

		private InputStream stream;

		@Override
		public int read() throws IOException {
			return stream.read();
		}
	}
}
