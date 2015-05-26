package org.lnu.is.web.rest.controller.reason;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.reason.ReasonResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReasonControllerTest extends AbstractControllerTest {
	
	@Mock
	private Facade<ReasonResource, Long> facade;
	
	@InjectMocks
	private ReasonController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetReasons() throws Exception {
		// Given
		String name = "all difficult";
		String abbrName = "ad";
		ReasonResource resource = new ReasonResource();
		resource.setName(name);
		resource.setAbbrName(abbrName);
		
		List<ReasonResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 20;
		long count = 1;
		PagedResultResource<ReasonResource> expected = new PagedResultResource<>("/reasons");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		ReasonResource paramResource = new ReasonResource();
		paramResource.setName(name);
		paramResource.setAbbrName(abbrName);		
		
		PagedRequest<ReasonResource> request = new PagedRequest<ReasonResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<ReasonResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/reasons")
				.param("name", name)
				.param("abbrName", abbrName))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).getResources(request);
	}

	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		String abbrName = "ad";
		ReasonResource expected = new ReasonResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/reasons/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/reasons/{id}", id));
		
		verify(facade).getResource(id);
	}
}
