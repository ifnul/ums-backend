package org.lnu.is.web.rest.controller.contact.type;

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
import org.lnu.is.resource.contact.type.ContactTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ContactTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<ContactTypeResource, Long> facade;

	@InjectMocks
	private ContactTypeController unit;
	
	@Override
	protected BaseController getUnit() {
		return unit;
	}
	
	
	@Test
	public void testGetContactTypes() throws Exception {
		// Given
		String name = "AddressN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		ContactTypeResource resource = new ContactTypeResource();
		resource.setName(name);

		List<ContactTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<ContactTypeResource> expected = new PagedResultResource<>(
				"/contacts/types");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		ContactTypeResource paramResource = new ContactTypeResource();
		paramResource.setName(name);

		PagedRequest<ContactTypeResource> request = new PagedRequest<ContactTypeResource>(
				paramResource, offset, limit);

		// When
		when(facade.getResources(Matchers.<PagedRequest<ContactTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/contacts/types").param("name", name))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		verify(facade).getResources(request);

	}

}
