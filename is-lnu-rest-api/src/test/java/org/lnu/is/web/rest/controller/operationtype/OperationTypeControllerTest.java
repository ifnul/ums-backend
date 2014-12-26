package org.lnu.is.web.rest.controller.operationtype;

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
import org.lnu.is.resource.operationtype.OperationTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OperationTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<OperationTypeResource, Long> facade;

	@InjectMocks
	private OperationTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetOperationTypes() throws Exception {
		// Given
		String name = "LieToMe";
		int offset = 0;
		int limit = 20;
		long count = 1;

		OperationTypeResource resource = new OperationTypeResource();
		resource.setName(name);

		List<OperationTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<OperationTypeResource> expected = new PagedResultResource<>("/operationtypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		OperationTypeResource paramResource = new OperationTypeResource();
		paramResource.setName(name);

		PagedRequest<OperationTypeResource> request = new PagedRequest<OperationTypeResource>(paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<OperationTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/operationtypes")
				.param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);
	}
}
