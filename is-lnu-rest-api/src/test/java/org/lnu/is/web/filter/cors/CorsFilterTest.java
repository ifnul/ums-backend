package org.lnu.is.web.filter.cors;

import static org.mockito.Mockito.verify;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CorsFilterTest {

	private CorsFilter unit = new CorsFilter();
	
	@Mock
	private ServletRequest request;
	
	@Mock
	private HttpServletResponse response;
	
	@Mock
	private FilterChain chain;
	
	@Test
	public void testDoFilter() throws Exception {
		// When
		unit.doFilter(request, response, chain);

		// Then
	    verify(response).setHeader("Access-Control-Allow-Origin", "*");
	    verify(response).setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization, x-requested-with");
	    verify(response).setHeader("Access-Control-Allow-Credentials", "true");
	    verify(response).setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	    verify(response).setHeader("Access-Control-Max-Age", "1209600");
	    
	    verify(chain).doFilter(request, response);
	}
}
