package org.lnu.is.web.rest.controller.course.type;

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
import org.lnu.is.resource.course.type.CourseTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CourseTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<CourseTypeResource, Long> facade;

	@InjectMocks
	private CourseTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
	
	@Test
	public void testGetCourseTypes() throws Exception {
		// Given
		String name = "AddressN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		CourseTypeResource resource = new CourseTypeResource();
		resource.setName(name);

		List<CourseTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<CourseTypeResource> expected = new PagedResultResource<>(
				"/courses/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		CourseTypeResource paramResource = new CourseTypeResource();
		paramResource.setName(name);

		PagedRequest<CourseTypeResource> request = new PagedRequest<CourseTypeResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<CourseTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/courses/types").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);

	}

}
