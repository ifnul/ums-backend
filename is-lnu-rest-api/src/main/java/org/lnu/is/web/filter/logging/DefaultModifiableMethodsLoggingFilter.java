package org.lnu.is.web.filter.logging;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet filter for logging operations.
 * @author ivanursul
 *
 */
public class DefaultModifiableMethodsLoggingFilter implements Filter {
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultModifiableMethodsLoggingFilter.class);
	
	private String httpMethods;
	
	@Override
	public void doFilter(final ServletRequest req, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		
		if (httpMethods.contains(request.getMethod().toLowerCase())) {
			ResettableStreamHttpServletRequest wrappedRequest = new ResettableStreamHttpServletRequest(request);
			String requestBody = IOUtils.toString(wrappedRequest.getReader()).replaceAll("\\s*\\n\\s*", "");
			LOGGER.info("{} method, request body: {}", request.getMethod(), requestBody);

			wrappedRequest.resetInputStream();
			request = wrappedRequest;
		}
		
		chain.doFilter(request, response);
	}
 
	@Override
	public void destroy() { }
	
	@Override
	public void init(final FilterConfig config) throws ServletException {
		this.httpMethods = config.getInitParameter("httpMethods");
	}

	public void setHttpMethods(final String httpMethods) {
		this.httpMethods = httpMethods;
	}
 
}
