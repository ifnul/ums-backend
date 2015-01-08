package org.lnu.is.web.rest.controller.familytype;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.familytype.FamilyTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
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

		PagedRequest<FamilyTypeResource> request = new PagedRequest<FamilyTypeResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<FamilyTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/families/types").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);

	}

}
