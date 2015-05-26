package org.lnu.is.web.rest.processor.resolver.limit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.annotations.Limit;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.search.PagedRequest;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultLimitParameterResolverTest {

	private DefaultLimitParameterResolver unit = new DefaultLimitParameterResolver();
	
	@Mock
	private HttpServletRequest httpRequest;
	
	@Test
	public void testGetLimit() throws Exception {
		// Given
		Limit annotation = null;
		PagedRequest<PersonResource> request = new PagedRequest<>();
		Integer expected = 10;
		
		// When
		when(httpRequest.getParameter(anyString())).thenReturn(String.valueOf(expected));
		
		Integer actual = unit.getLimit(annotation, request.getClass().getDeclaredField("limit"), httpRequest);

		// Then
		verify(httpRequest).getParameter("limit");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetLimitWithNullValue() throws Exception {
		// Given
		Limit annotation = null;
		PagedRequest<PersonResource> request = new PagedRequest<>();
		Integer expected = 20;
		
		// When
		Integer actual = unit.getLimit(annotation, request.getClass().getDeclaredField("limit"), httpRequest);
		
		// Then
		verify(httpRequest).getParameter("limit");
		assertEquals(expected, actual);
	}
}
