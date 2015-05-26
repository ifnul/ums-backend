package org.lnu.is.web.filter.cors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Cors Filter for allowing cross origin requests.
 * @author ivanursul
 *
 */
public class CorsFilter implements Filter {

	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response,
			final FilterChain chain) throws IOException, ServletException {

		HttpServletResponse httpResponse = (HttpServletResponse) response;
	    httpResponse.setHeader("Access-Control-Allow-Origin", "*");
	    httpResponse.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, x-requested-with");
	    httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
	    httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	    httpResponse.setHeader("Access-Control-Max-Age", "1209600");		
		
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(final FilterConfig filterConfig) throws ServletException { }

	@Override
	public void destroy() { }

}
