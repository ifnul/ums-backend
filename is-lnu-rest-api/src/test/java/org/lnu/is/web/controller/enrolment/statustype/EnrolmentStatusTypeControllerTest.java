package org.lnu.is.web.controller.enrolment.statustype;

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
import org.lnu.is.facade.resource.enrolment.statustype.EnrolmentStatusTypeResource;
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
public class EnrolmentStatusTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EnrolmentStatusTypeResource, Long> statusTypeFacade;

	@InjectMocks
	private EnrolmentStatusTypeController unit;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(unit).build();
	}

	@Test
	public void testGetEnrolmentStatusTypes() throws Exception {
		// Given
		String name = "name";
		EnrolmentStatusTypeResource resource = new EnrolmentStatusTypeResource();
		resource.setName(name);

		List<EnrolmentStatusTypeResource> entities = Arrays.asList(resource);

		Integer offset = 0;
		long count = 1;
		Integer limit = 20;
		PagedResultResource<EnrolmentStatusTypeResource> expected = new PagedResultResource<>("/enrolmentstatustypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setOffset(offset);
		expected.setLimit(limit);

		EnrolmentStatusTypeResource paramResource = new EnrolmentStatusTypeResource();
		paramResource.setName(name);
		PagedRequest<EnrolmentStatusTypeResource> request = new PagedRequest<EnrolmentStatusTypeResource>(paramResource, offset, limit);

		// When
		when(statusTypeFacade.getResources(Matchers.<PagedRequest<EnrolmentStatusTypeResource>> any())).thenReturn(expected);

		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/enrolments/statustypes")
				.param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(statusTypeFacade).getResources(request);
	}
}
