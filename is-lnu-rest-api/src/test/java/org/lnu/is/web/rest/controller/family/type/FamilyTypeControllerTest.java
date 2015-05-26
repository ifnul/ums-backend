package org.lnu.is.web.rest.controller.family.type;

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
import org.lnu.is.resource.family.type.FamilyTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.family.type.FamilyTypeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FamilyTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<FamilyTypeResource, Long> facade;

	@InjectMocks
	private FamilyTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
	@Test
	public void testGetFamilyTypes() throws Exception {
		// Given
		String name = "AddressN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		FamilyTypeResource resource = new FamilyTypeResource();
		resource.setName(name);

		List<FamilyTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<FamilyTypeResource> expected = new PagedResultResource<>(
				"/families/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		FamilyTypeResource paramResource = new FamilyTypeResource();
		paramResource.setName(name);

		PagedRequest<FamilyTypeResource> request = new PagedRequest<FamilyTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());

		// When
		when(facade.getResources(Matchers.<PagedRequest<FamilyTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/families/types").param("name", name))
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
		FamilyTypeResource expected = new FamilyTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/families/types/{id}", id))
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
		mockMvc.perform(get("/families/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
