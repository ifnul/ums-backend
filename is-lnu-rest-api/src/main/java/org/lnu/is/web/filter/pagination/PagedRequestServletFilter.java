package org.lnu.is.web.filter.pagination;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.lnu.is.web.exception.LimitOutOfRangeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Paged Request Servlet Filter.
 * @author ivanursul
 *
 */
public class PagedRequestServletFilter implements Filter {
	private static final Logger LOGGER = LoggerFactory.getLogger(PagedRequestServletFilter.class);

	private static final String LIMIT_KEY = "limit";
	private static final String MAX_PAGINATION_COUNT = "max.pagination.count";
	private static final Integer DEFAULT_PAGINATION_COUNT = 300;

	private Integer maxPaginationCount;
	
	@Override
	public void doFilter(final ServletRequest req, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		
		if (HttpMethod.GET.name().equals(request.getMethod())) {
			
			if (request.getParameterMap().containsKey(LIMIT_KEY)) {
				Integer limit = Integer.valueOf(request.getParameter(LIMIT_KEY));
				
				if (limit > maxPaginationCount) {
					String message = MessageFormat.format("Limit out of range: {0}, maximum limit:{1}", limit, maxPaginationCount);
					RuntimeException outOfRangeException = new LimitOutOfRangeException(limit, message);
					LOGGER.error(message, outOfRangeException);
					
					throw outOfRangeException;
				}
				
			}
			
		}
		
		chain.doFilter(request, response);
	}
 
	@Override
	public void destroy() { }
	
	@Override
	public void init(final FilterConfig config) throws ServletException {
	    ApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext());
	    Environment environment = ctx.getEnvironment();
	    this.maxPaginationCount = environment.getProperty(MAX_PAGINATION_COUNT, Integer.class, DEFAULT_PAGINATION_COUNT);
	}

	public void setMaxPaginationCount(final Integer maxPaginationCount) {
		this.maxPaginationCount = maxPaginationCount;
	}
 
}
