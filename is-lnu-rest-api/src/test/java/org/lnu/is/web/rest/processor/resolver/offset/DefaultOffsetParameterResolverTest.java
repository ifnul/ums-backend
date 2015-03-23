package org.lnu.is.web.rest.processor.resolver.offset;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.annotations.Offset;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.search.PagedRequest;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultOffsetParameterResolverTest {

	private DefaultOffsetParameterResolver unit = new DefaultOffsetParameterResolver();
	
	@Mock
	private HttpServletRequest httpRequest;
	
	@Test
	public void testGetOffset() throws Exception {
		// Given
		Offset annotation = null;
		PagedRequest<PersonResource> request = new PagedRequest<>();
		Integer expected = 10;
		
		// When
		when(httpRequest.getParameter(anyString())).thenReturn(String.valueOf(expected));
		
		Integer actual = unit.getOffset(annotation, request.getClass().getDeclaredField("offset"), httpRequest);

		// Then
		verify(httpRequest).getParameter("offset");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetOffsetWithNullValue() throws Exception {
		// Given
		Offset annotation = null;
		PagedRequest<PersonResource> request = new PagedRequest<>();
		Integer expected = 0;
		
		// When
		Integer actual = unit.getOffset(annotation, request.getClass().getDeclaredField("offset"), httpRequest);
		
		// Then
		verify(httpRequest).getParameter("offset");
		assertEquals(expected, actual);
	}
}
