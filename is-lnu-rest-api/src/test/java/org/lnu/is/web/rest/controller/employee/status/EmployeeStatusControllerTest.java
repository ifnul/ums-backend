package org.lnu.is.web.rest.controller.employee.status;

import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.resource.employee.status.EmployeeStatusResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeStatusControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<EmployeeStatusResource, Long> facade;

	@InjectMocks
	private EmployeeStatusController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
	@Test
	public void testGetEmployeeStatuss() throws Exception {
		// Given
		String name = "AddressN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		EmployeeStatusResource resource = new EmployeeStatusResource();
		resource.setName(name);

		List<EmployeeStatusResource> entities = Arrays.asList(resource);
		PagedResultResource<EmployeeStatusResource> expected = new PagedResultResource<>(
				"/contacts/statuses");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		EmployeeStatusResource paramResource = new EmployeeStatusResource();
		paramResource.setName(name);

		PagedRequest<EmployeeStatusResource> request = new PagedRequest<EmployeeStatusResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<EmployeeStatusResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/employees/statuses").param("name", name))
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
		EmployeeStatusResource expected = new EmployeeStatusResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/employees/statuses/{id}", id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}
}
