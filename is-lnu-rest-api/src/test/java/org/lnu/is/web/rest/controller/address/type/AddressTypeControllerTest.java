package org.lnu.is.web.rest.controller.address.type;

import static org.junit.Assert.assertEquals;
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
import org.lnu.is.pagination.OrderByType;
import org.lnu.is.resource.address.type.AddressTypeResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.AbstractControllerTest;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.address.type.AddressTypeController;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AddressTypeControllerTest extends AbstractControllerTest {

	@Mock
	private Facade<AddressTypeResource, AddressTypeResource, Long> facade;

	@InjectMocks
	private AddressTypeController unit;

	@Override
	protected BaseController getUnit() {
		return unit;
	}

	@Test
	public void testGetAddressTypes() throws Exception {
		// Given
		String name = "AddressN";
		Integer offset = 0;
		Integer limit = 20;
		long count = 1;

		AddressTypeResource resource = new AddressTypeResource();
		resource.setName(name);

		List<AddressTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<AddressTypeResource> expected = new PagedResultResource<>(
				"/addresstypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);

		AddressTypeResource paramResource = new AddressTypeResource();
		paramResource.setName(name);

		PagedRequest<AddressTypeResource> request = new PagedRequest<AddressTypeResource>(paramResource, offset, limit, Collections.<OrderBy>emptyList());

		// When
		when(facade.getResources(Matchers.<PagedRequest<AddressTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/addresstypes").param("name", name))
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
		AddressTypeResource expected = new AddressTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setId(id);
		
		// When
		when(facade.getResource(anyLong())).thenReturn(expected);
		String response = getJson(expected, false);

		// Then
		mockMvc.perform(get("/addresstypes" + Request.ID, id))
			.andExpect(status().isOk())
			.andExpect(content().string(response));
		
		verify(facade).getResource(id);
	}

	@Test(expected = AccessDeniedException.class)
	public void testGetResourceWithException() throws Exception {
		// Given
		Long id = 1L;
		
		// When
		doThrow(AccessDeniedException.class).when(facade).getResource(anyLong());
		
		// Then
		mockMvc.perform(get("/addresstypes/{id}", id));
		
		verify(facade).getResource(id);
	}
	
	@Test
	public void testOrderBy() throws Exception {
		// Given
		int offset = 0;
		int limit = 20;
		long count = 1;
		
		String abbrName = "abbr name";		
		String name = "name";
		AddressTypeResource resource = new AddressTypeResource();
		resource.setAbbrName(abbrName);
		resource.setName(name);

		List<AddressTypeResource> entities = Arrays.asList(resource);
		PagedResultResource<AddressTypeResource> expected = new PagedResultResource<>(
				"/addresstypes");
		expected.setResources(entities);
		expected.setCount(count);
		expected.setLimit(limit);
		expected.setOffset(offset);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		PagedRequest<AddressTypeResource> request = new PagedRequest<AddressTypeResource>();
		request.setOffset(offset);
		request.setLimit(limit);
		request.setOrders(orders);

		// When
		when(facade.getResources(Matchers.<PagedRequest<AddressTypeResource>> any())).thenReturn(expected);
		String response = getJson(expected, false);
		PagedResultResource<AddressTypeResource> actual = unit.getPagedResource(request);

		// Then
		mockMvc.perform(get("/addresstypes"))
				.andExpect(status().isOk())
				.andExpect(content().string(response));

		assertEquals(expected, actual);
	}
	
}
