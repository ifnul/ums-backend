package org.lnu.is.web.controller.marriedtype;

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
import org.lnu.is.facade.facade.marriedtype.MarriedTypeFacade;
import org.lnu.is.facade.resource.marriedtype.MarriedTypeResource;
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
public class MarriedTypeControllerTest extends AbstractControllerTest {
	
	@Mock
	private MarriedTypeFacade marriedTypeFacade;
	
	@InjectMocks
	private MarriedTypeController unit;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}
	
	@Test
	public void testGetMarriedTypes() throws Exception {
		// Given
		String name = "all difficult";
		String abbrName = "ad";
		MarriedTypeResource resource = new MarriedTypeResource();
		resource.setName(name);
		resource.setAbbrName(abbrName);
		
		List<MarriedTypeResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 38;
		long count = 1;
		PagedResultResource<MarriedTypeResource> expected = new PagedResultResource<>("/marriedtypes");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		MarriedTypeResource paramResource = new MarriedTypeResource();
		paramResource.setName(name);
		paramResource.setAbbrName(abbrName);		
		
		PagedRequest<MarriedTypeResource> request = new PagedRequest<MarriedTypeResource>(paramResource, offset, limit);
		
		// When
		when(marriedTypeFacade.getEntities(Matchers.<PagedRequest<MarriedTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/marriedtypes")
				.param("name", name)
				.param("abbrName", abbrName))
				.andExpect(status().isOk())
				.andExpect(content().string(response));
		
		verify(marriedTypeFacade).getEntities(request);
	}

}
