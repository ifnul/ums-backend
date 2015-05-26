	package org.lnu.is.web.rest.controller.timesheet.type;

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
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TimeSheetTypeControllerTest extends AbstractControllerTest {
	
	@Mock
	private Facade<TimeSheetTypeResource, Long> facade;
	
	@InjectMocks
	private TimeSheetTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetTimesheetTypes() throws Exception {
		// Given
		String name = "all difficult";
		String abbrName = "ad";
		TimeSheetTypeResource resource = new TimeSheetTypeResource();
		resource.setName(name);
		resource.setAbbrName(abbrName);
		
		List<TimeSheetTypeResource> entities = Arrays.asList(resource);
		
		int offset = 0;
		int limit = 20;
		long count = 1;
		PagedResultResource<TimeSheetTypeResource> expected = new PagedResultResource<>("/timesheets/types");
		expected.setResources(entities);
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);
		
		TimeSheetTypeResource paramResource = new TimeSheetTypeResource();
		paramResource.setName(name);
		paramResource.setAbbrName(abbrName);		
		
		PagedRequest<TimeSheetTypeResource> request = new PagedRequest<TimeSheetTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());
		
		// When
		when(facade.getResources(Matchers.<PagedRequest<TimeSheetTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		
		// Then
		mockMvc.perform(get("/timesheets/types")
				.param("name", name)
				.param("abbrName", abbrName))
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
		TimeSheetTypeResource expected = new TimeSheetTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/timesheets/types/{id}", id))
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
		mockMvc.perform(get("/timesheets/types/{id}", id));
		
		verify(facade).getResource(id);
	}
}
