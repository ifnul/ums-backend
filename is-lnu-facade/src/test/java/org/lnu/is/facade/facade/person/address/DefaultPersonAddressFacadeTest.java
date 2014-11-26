package org.lnu.is.facade.facade.person.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyListOf;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.person.address.PersonAddressService;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonAddressFacadeTest {

	@Mock
	private Converter<PersonAddressResource, PersonAddress> insertConverter;
	
	@Mock
	private Converter<PersonAddressResource, PersonAddress> updateConverter;
	
	@Mock
	private Converter<PagedRequest<PersonAddressResource>, PagedSearch<PersonAddress>> pagedRequestConverter;

	@Mock
	private Converter<PagedResult<PersonAddress>, PagedResultResource<PersonAddressResource>> pagedResultConverter;
	
	@Mock
	private Converter<PersonAddressResource, PersonAddress> personAddressResourceConverter;
	
	@Mock
	private Converter<PersonAddress, PersonAddressResource> personAddressConverter;
	
	@Mock
	private PersonAddressService personAddressService;
	
	@InjectMocks
	private DefaultPersonAddressFacade unit;

	@Test
	public void testCreateAddress() throws Exception {
		// Given
		Long id = 1L;
		Long personId = 2L;

		PersonAddressResource resource = new PersonAddressResource();
		resource.setId(id);
		resource.setPersonId(personId);

		PersonAddress address = new PersonAddress();
		
		// When
		when(personAddressConverter.convert(any(PersonAddress.class))).thenReturn(resource);
		
		PersonAddressResource actual = unit.createAddress(resource);

		// Then
		verify(personAddressResourceConverter).convert(resource, address);
		verify(insertConverter).convert(resource, address);
		verify(personAddressService).createAddress(address);
		verify(personAddressConverter).convert(address);
		
		assertEquals(resource, actual);
	}
	
	@Test
	public void testUpdateAddress() throws Exception {
		// Given
		Long addressId = 2L;
		PersonAddressResource resource = new PersonAddressResource();
		PersonAddress address = new PersonAddress();

		// When
		when(personAddressService.getAddress(anyLong())).thenReturn(address);
		unit.updateAddress(addressId, resource);

		// Then
		verify(personAddressService).getAddress(addressId);
		verify(personAddressResourceConverter).convert(resource, address);
		verify(personAddressService).updateAddress(address);
	}
	
	@Test
	public void testPersonAddress() throws Exception {
		// Given
		Long id = 1L;
    	
    	PersonAddressResource expected = new PersonAddressResource();
    	expected.setId(id);

		PersonAddress personAddress = new PersonAddress();
		personAddress.setId(id);

		// When
		when(personAddressService.getAddress(anyLong())).thenReturn(personAddress);
		when(personAddressConverter.convert(any(PersonAddress.class))).thenReturn(expected);
		PersonAddressResource actual = unit.getAddress(id);

		// Then
		verify(personAddressService).getAddress(id);
		verify(personAddressConverter).convert(personAddress);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetPersonPapers() throws Exception {
		// Given
		Long personId = 2L;
		PersonAddressResource resource = new PersonAddressResource();
		resource.setPersonId(personId);
		PagedRequest<PersonAddressResource> pagedRequest = new PagedRequest<PersonAddressResource>(resource, 10, 10);
		List<PersonAddressResource> funnyResources = Collections.singletonList(new PersonAddressResource());
		PagedResultResource<PersonAddressResource> expectedFunnies = new PagedResultResource<>(MessageFormat.format("/persons/{0}/addresses", personId));
		expectedFunnies.setResources(funnyResources);

		int offset = 8;
		int limit = 3;
		int count = 100;
		
		PagedSearch<PersonAddress> pagedSearch = new PagedSearch<PersonAddress>(offset, limit, Collections.<String, Object> emptyMap(), PersonAddress.class);
		List<PersonAddress> entities = Arrays.asList(new PersonAddress());
		PagedResult<PersonAddress> pagedResult = new PagedResult<PersonAddress>(offset, limit, count, entities);

		// When
		when(pagedRequestConverter.convert(Matchers.<PagedRequest<PersonAddressResource>>any())).thenReturn(pagedSearch);
		when(personAddressService.getAddresses(Matchers.<PagedSearch<PersonAddress>> any())).thenReturn(pagedResult);
		when(personAddressConverter.convertAll(anyListOf(PersonAddress.class))).thenReturn(funnyResources);

		PagedResultResource<PersonAddressResource> actualFunnies = unit.getAddresses(pagedRequest);

		// Then
		verify(pagedRequestConverter).convert(pagedRequest);
		verify(personAddressService).getAddresses(pagedSearch);
		verify(personAddressConverter).convertAll(entities);
		verify(pagedResultConverter).convert(pagedResult, expectedFunnies);

		assertEquals(expectedFunnies, actualFunnies);
	}
}
