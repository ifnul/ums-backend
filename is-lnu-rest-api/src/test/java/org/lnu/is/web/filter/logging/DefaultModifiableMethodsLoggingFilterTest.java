package org.lnu.is.web.filter.logging;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultModifiableMethodsLoggingFilterTest {

	@InjectMocks
	private DefaultModifiableMethodsLoggingFilter unit;
	
	@Mock
	private FilterConfig config;

	@Mock
	private HttpServletRequest request;

	@Mock
	private ServletResponse response;

	@Mock
	private FilterChain chain;

	@Before
	public void setup() throws Exception {
		String httpMethods = "post, put";
		unit.setHttpMethods(httpMethods);
		when(config.getInitParameter("httpMethods")).thenReturn(httpMethods);
		unit.init(config);
	}
	
	@Test
	public void testDoFilter() throws Exception {
		// Given
		String str = "{\"name\":\"name1\"}";
		InputStream is = new ByteArrayInputStream(str.getBytes());
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		// When
		when(request.getMethod()).thenReturn("POST");
		when(request.getReader()).thenReturn(reader);
		unit.doFilter(request, response, chain);

		// Then
		verify(request).getReader();
		verify(chain).doFilter(any(ResettableStreamHttpServletRequest.class), eq(response));
	}

	@Test
	public void testDoFilterWithGetMethod() throws Exception {
		// Given
		
		// When
		when(request.getMethod()).thenReturn("GET");
		unit.doFilter(request, response, chain);
		
		// Then
		verify(request, times(0)).getReader();
		verify(chain).doFilter(request, response);
	}
	
	@Test
	public void testDestroy() throws Exception {
		verifyZeroInteractions(request);
		verifyZeroInteractions(response);
		verifyZeroInteractions(chain);
	}
}
