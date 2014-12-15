package org.lnu.is.web.rest.controller.person.type;

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
import org.lnu.is.facade.resource.person.type.PersonTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.person.type.PersonTypeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class PersonTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<PersonTypeResource, Long> facade;

	@InjectMocks
	private PersonTypeController unit;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}

	@Test
	public void testGetPersonTypes() throws Exception {
		// Given
		Long id = 1L;
		String abbrName = "abbr name";
		String name = "name";

		PersonTypeResource personResource = new PersonTypeResource();
		personResource.setId(id);
		personResource.setAbbrName(abbrName);
		personResource.setName(name);

		long count = 100;
		int limit = 25;
		Integer offset = 10;
		String uri = "/persons/types";
		List<PersonTypeResource> entities = Arrays.asList(personResource);
		PagedResultResource<PersonTypeResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);

		PagedRequest<PersonTypeResource> pagedRequest = new PagedRequest<PersonTypeResource>(new PersonTypeResource(), offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<PersonTypeResource>> any())).thenReturn(expectedResource);
		String response = getJson(expectedResource, false);

		// Then
		mockMvc.perform(get("/persons/types")
				.param("offset", String.valueOf(offset))
				.param("limit", String.valueOf(limit)))
			.andExpect(status().isOk())
			.andExpect(content().string(response));

		verify(facade).getResources(pagedRequest);
	}
}
