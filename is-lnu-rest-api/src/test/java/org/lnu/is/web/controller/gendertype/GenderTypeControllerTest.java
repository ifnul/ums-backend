package org.lnu.is.web.controller.gendertype;

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
import org.lnu.is.facade.facade.gendertype.GenderTypeFacade;
import org.lnu.is.facade.resource.gendertype.GenderTypeResource;
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
public class GenderTypeControllerTest extends AbstractControllerTest {

	@Mock
	private GenderTypeFacade genderTypeFacade;

	@InjectMocks
	private GenderTypeController unit;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}

	@Test
	public void testGetEduFormTypes() throws Exception {
		// Given
		String name = "Gender Type One";
		GenderTypeResource resource = new GenderTypeResource();
		resource.setName(name);

		List<GenderTypeResource> entities = Arrays.asList(resource);

		Integer offset = 0;
		long count = 1;
		Integer limit = 38;

		PagedResultResource<GenderTypeResource> expected = new PagedResultResource<>("/gendertypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		GenderTypeResource paramResource = new GenderTypeResource();
		paramResource.setName(name);
		PagedRequest<GenderTypeResource> request = new PagedRequest<GenderTypeResource>(paramResource, offset, limit);

		// When
		when(genderTypeFacade.getEntities(Matchers.<PagedRequest<GenderTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/gendertypes").param("name", name)).andExpect(status().isOk()).andExpect(content().string(response));

		verify(genderTypeFacade).getEntities(request);
	}
}
