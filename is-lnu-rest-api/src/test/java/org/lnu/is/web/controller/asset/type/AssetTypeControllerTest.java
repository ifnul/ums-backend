package org.lnu.is.web.controller.asset.type;

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
import org.lnu.is.facade.resource.asset.type.AssetTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.AbstractControllerTest;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class AssetTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<AssetTypeResource, Long> facade;

	@InjectMocks
	private AssetTypeController unit;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}

	@Test
	public void testGetAssetTypes() throws Exception {
		// Given
		String name = "AssetN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		AssetTypeResource resource = new AssetTypeResource();
		resource.setName(name);

		List<AssetTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<AssetTypeResource> expected = new PagedResultResource<>(
				"/assets/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		AssetTypeResource paramResource = new AssetTypeResource();
		paramResource.setName(name);

		PagedRequest<AssetTypeResource> request = new PagedRequest<AssetTypeResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<AssetTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/assets/types").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);

	}

}
