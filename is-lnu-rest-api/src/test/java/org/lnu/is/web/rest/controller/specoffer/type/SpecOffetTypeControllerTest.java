package org.lnu.is.web.rest.controller.specoffer.type;

import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.AccessDeniedException;
import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOffetTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<SpecOfferTypeResource, SpecOfferTypeResource, Long> facade;

	@InjectMocks
	private SpecOffetTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
    @Test
	public void testGetSpecOfferTypes() throws Exception {
		// Given
    	String name = "name";
		SpecOfferTypeResource resource = new SpecOfferTypeResource();
		resource.setName(name);
		
		List<SpecOfferTypeResource> entities = Arrays.asList(resource);

		Integer offset = 0;
		long count = 1;
		Integer limit = 40;
		PagedResultResource<SpecOfferTypeResource> expected = new PagedResultResource<>("/specoffers/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		SpecOfferTypeResource paramResource = new SpecOfferTypeResource();
		paramResource.setName(name);

		Map<String, Object> params = new HashMap<>();
		params.put("name", name);
		PagedRequest<SpecOfferTypeResource> request = new PagedRequest<SpecOfferTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList(), params);
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<SpecOfferTypeResource>>any())).thenReturn(expected);
    	String response = getJson(expected, false);

		// Then
    	mockMvc.perform(get("/specoffers/types")
    			.param("name", name))
    		.andExpect(status().isOk())
    		.andExpect(content().string(response));
    	
		verify(facade).getResources(request);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithAccessDeniedException() throws Exception {
		// Given
		Long id = 1L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/specoffers/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
