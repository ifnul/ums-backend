package org.lnu.is.facade.facade.person.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resource.person.address.PersonAddressResource;
import org.lnu.is.service.person.address.PersonAddressService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonAddressFacadeTest {

	@Mock
	private Converter<PersonAddressResource, PersonAddress> personAddressResourceConverter;
	
	@Mock
	private Converter<PersonAddress, PersonAddressResource> personAddressConverter;
	
	@Mock
	private Converter<PersonAddressResource, PersonAddress> insertConverter;
	
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
}
