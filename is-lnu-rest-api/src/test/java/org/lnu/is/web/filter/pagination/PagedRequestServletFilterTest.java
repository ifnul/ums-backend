package org.lnu.is.web.filter.pagination;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.web.exception.LimitOutOfRangeException;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.env.Environment;
import org.springframework.web.context.WebApplicationContext;

@RunWith(MockitoJUnitRunner.class)
public class PagedRequestServletFilterTest {

	private static final String MAX_PAGINATION_COUNT = "max.pagination.count";
	private static final Integer DEFAULT_PAGINATION_COUNT = 300;
	
	private PagedRequestServletFilter unit = new PagedRequestServletFilter();
	
	@Mock
	private HttpServletRequest req;
	
	@Mock
	private ServletResponse response;
	
	@Mock
	private FilterChain chain;

	@Mock
	private FilterConfig config;
	
	@Mock
	private ServletContext context;

	@Mock
	private WebApplicationContext webApplicationContext;

	@Mock
	private Environment env;

	private Integer maxPaginationCount = 400;

	@Before
	public void setup() {
		unit.setMaxPaginationCount(maxPaginationCount);
	}
	
	@Test
	public void testDoFilter() throws Exception {
		// Given
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		String[] limits = { "100" };
		parameterMap.put("limit", limits);

		// When
		when(req.getMethod()).thenReturn("GET");
		when(req.getParameter("limit")).thenReturn(limits[0]);
		when(req.getParameterMap()).thenReturn(parameterMap);
		unit.doFilter(req, response, chain);

		// Then
		verify(chain).doFilter(req, response);
	}

	@Test
	public void testDoFilterWithEmptyParametersMap() throws Exception {
		// Given
		Map<String, String[]> parameterMap = Collections.emptyMap();
		
		// When
		when(req.getMethod()).thenReturn("GET");
		when(req.getParameterMap()).thenReturn(parameterMap);
		unit.doFilter(req, response, chain);
		
		// Then
		verify(req, times(0)).getParameter("limit");
		verify(chain).doFilter(req, response);
	}

	@Test
	public void testDoFilterWithPostMethod() throws Exception {
		// Given
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		String[] limits = { "100" };
		parameterMap.put("limit", limits);
		
		// When
		when(req.getMethod()).thenReturn("POST");
		when(req.getParameter("limit")).thenReturn(limits[0]);
		when(req.getParameterMap()).thenReturn(parameterMap);
		unit.doFilter(req, response, chain);
		
		// Then
		verify(req, times(0)).getParameter("limit");
		verify(req, times(0)).getParameterMap();
		verify(chain).doFilter(req, response);
	}

	@Test(expected = LimitOutOfRangeException.class)
	public void testDoFilterWithOutOfLimitValue() throws Exception {
		// Given
		Map<String, String[]> parameterMap = new HashMap<String, String[]>();
		String[] limits = { "900" };
		parameterMap.put("limit", limits);
		
		// When
		when(req.getMethod()).thenReturn("GET");
		when(req.getParameter("limit")).thenReturn(limits[0]);
		when(req.getParameterMap()).thenReturn(parameterMap);
		unit.doFilter(req, response, chain);
	}
	
	@Test
	public void testDestroy() throws Exception {
		unit.destroy();
		verifyZeroInteractions(req);
		verifyZeroInteractions(response);
		verifyZeroInteractions(chain);
	}
	
	@Test
	public void testInit() throws Exception {
		// When
		when(config.getServletContext()).thenReturn(context);
		when(context.getAttribute(WebApplicationContext.class.getName() + ".ROOT")).thenReturn(webApplicationContext);
		when(webApplicationContext.getEnvironment()).thenReturn(env);
		when(env.getProperty(MAX_PAGINATION_COUNT, Integer.class, DEFAULT_PAGINATION_COUNT)).thenReturn(maxPaginationCount);
		unit.init(config);

		// Then
		verify(config).getServletContext();
		verify(context).getAttribute(WebApplicationContext.class.getName() + ".ROOT");
		verify(webApplicationContext).getEnvironment();
		verify(env).getProperty(MAX_PAGINATION_COUNT, Integer.class, DEFAULT_PAGINATION_COUNT);
	}
}
