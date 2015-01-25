package org.lnu.is.web.rest.controller.benefit.type;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BenefitTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<BenefitTypeResource, Long> facade;

	@InjectMocks
	private BenefitTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetAssetTypes() throws Exception {
		// Given
		String name = "AssetN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		BenefitTypeResource resource = new BenefitTypeResource();
		resource.setName(name);

		List<BenefitTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<BenefitTypeResource> expected = new PagedResultResource<>(
				"/benefits/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		BenefitTypeResource paramResource = new BenefitTypeResource();
		paramResource.setName(name);

		PagedRequest<BenefitTypeResource> request = new PagedRequest<BenefitTypeResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<BenefitTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/benefits/types").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);
	}

	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		BenefitTypeResource expected = new BenefitTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/benefits/types/{id}", id))
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
		mockMvc.perform(get("/benefits/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
