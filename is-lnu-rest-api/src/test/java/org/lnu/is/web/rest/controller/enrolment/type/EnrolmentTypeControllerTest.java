package org.lnu.is.web.rest.controller.enrolment.type;

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
import org.lnu.is.domain.OrderBy;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.enrolment.type.EnrolmentTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentTypeControllerTest extends AbstractControllerTest {
	@Mock
	private Facade<EnrolmentTypeResource, Long> facade;

	@InjectMocks
	private EnrolmentTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}


	@Test
	public void testGetEnrolmentTypes() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";

		EnrolmentTypeResource enrolmentResource = new EnrolmentTypeResource();
		enrolmentResource.setId(id);
		enrolmentResource.setName(name);

		long count = 100;
		int limit = 32;
		Integer offset = 10;
		String uri = "/enrolments/types";
		List<EnrolmentTypeResource> entities = Arrays.asList(enrolmentResource);
		PagedResultResource<EnrolmentTypeResource> expectedResource = new PagedResultResource<>();
		expectedResource.setCount(count);
		expectedResource.setLimit(limit);
		expectedResource.setOffset(offset);
		expectedResource.setUri(uri);
		expectedResource.setResources(entities);

		PagedRequest<EnrolmentTypeResource> pagedRequest = new PagedRequest<EnrolmentTypeResource>(new EnrolmentTypeResource(), offset, limit, Collections.<OrderBy>emptyList());

		// When
		when(facade.getResources(Matchers.<PagedRequest<EnrolmentTypeResource>> any())).thenReturn(expectedResource);
		String response = getJson(expectedResource, false);

		// Then
		mockMvc.perform(get("/enrolments/types")
				.param("offset", String.valueOf(offset))
				.param("limit", String.valueOf(limit)))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(pagedRequest);
	}
	
	@Test
	public void testGetResource() throws Exception {
		// Given
		Long id = 1L;
		String name = "all difficult";
		EnrolmentTypeResource expected = new EnrolmentTypeResource();
		expected.setName(name);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/enrolments/types/{id}", id))
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
		mockMvc.perform(get("/enrolments/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
