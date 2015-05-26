package org.lnu.is.web.rest.controller.wave.type;

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
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.wave.type.WaveTypeResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class WaveTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<WaveTypeResource, Long> facade;
	
	@InjectMocks
	private WaveTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetWaveType() throws Exception {
		// Given
		String name = "all difficult";
		WaveTypeResource resource = new WaveTypeResource();
		resource.setName(name);
		
		List<WaveTypeResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 20;
		long count = 1;
		PagedResultResource<WaveTypeResource> expected = new PagedResultResource<>("/wave/types");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		WaveTypeResource paramResource = new WaveTypeResource();
		paramResource.setName(name);
		
		PagedRequest<WaveTypeResource> request = new PagedRequest<WaveTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<WaveTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/wave/types")
				.param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).getResources(request);
	}
	
	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		WaveTypeResource expected = new WaveTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/wave/types/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}
	
	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithException() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		WaveTypeResource expected = new WaveTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/wave/types/{id}", id))
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
		mockMvc.perform(get("/wave/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
