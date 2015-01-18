package org.lnu.is.web.filter.pagination;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.web.exception.LimitOutOfRangeException;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PagedRequestServletFilterTest {

	private PagedRequestServletFilter unit = new PagedRequestServletFilter();
	
	@Mock
	private HttpServletRequest req;
	
	@Mock
	private ServletResponse response;
	
	@Mock
	private FilterChain chain;

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
}
