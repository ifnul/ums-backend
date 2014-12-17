package org.lnu.is.web.rest.controller.asset.status;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.asset.status.AssetStatusResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class AssetStatusControllerTest extends AbstractControllerTest {
	
	@Mock
	private Facade<AssetStatusResource, Long> facade;
	
	@InjectMocks
	private AssetStatusController unit;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}
	
	@Test
	public void testGetAssetStates() throws Exception {
		// Given
		String name = "all difficult";
		AssetStatusResource resource = new AssetStatusResource();
		resource.setName(name);
		
		List<AssetStatusResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 20;
		long count = 1;
		PagedResultResource<AssetStatusResource> expected = new PagedResultResource<>("/assets/statuses");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		AssetStatusResource paramResource = new AssetStatusResource();
		paramResource.setName(name);
		
		PagedRequest<AssetStatusResource> request = new PagedRequest<AssetStatusResource>(paramResource, offset, limit);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<AssetStatusResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/assets/statuses")
				.param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(facade).getResources(request);
	}

}
