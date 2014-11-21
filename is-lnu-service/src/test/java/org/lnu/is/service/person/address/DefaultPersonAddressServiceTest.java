package org.lnu.is.service.person.address;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.person.address.PersonAddressDao;
import org.lnu.is.domain.person.PersonAddress;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonAddressServiceTest {

	@Mock
	private PersonAddressDao personAddressDao;
	
	@InjectMocks
	private DefaultPersonAddressService unit;
	
	@Test
	public void testCreateAddress() throws Exception {
		// Given
		PersonAddress address = new PersonAddress();

		// When
		unit.createAddress(address);

		// Then
		verify(personAddressDao).save(address);
	}
}
