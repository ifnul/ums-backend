package org.lnu.is.service.person.address;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.person.address.PersonAddressDao;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultPersonAddressServiceTest {

	@Mock
	private ParametersExtractor<PersonAddress> parametersExtractor;
	
	@Mock
	private PersonAddressDao defaultDao;
	
	@InjectMocks
	private DefaultPersonAddressService unit;
	
	@Test
	public void testCreateAddress() throws Exception {
		// Given
		PersonAddress address = new PersonAddress();

		// When
		unit.createAddress(address);

		// Then
		verify(defaultDao).save(address);
	}
	
	@Test
	public void testUpdateAddress() throws Exception {
		// Given
		PersonAddress address = new PersonAddress();

		// When
		unit.updateAddress(address);

		// Then
		verify(defaultDao).update(address);
	}
	
	@Test
	public void testGetPersonAddress() throws Exception {
		// Given
		Long addressId = 2L;
		PersonAddress expected = new PersonAddress();
		expected.setId(addressId);
		
		// When
		when(defaultDao.findById(anyLong())).thenReturn(expected);
		PersonAddress actual = unit.getAddress(addressId);

		// Then
		verify(defaultDao).findById(addressId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetAddresses() throws Exception {
		// Given
		PersonAddress entity = new PersonAddress();
		PagedSearch<PersonAddress> pagedSearch = new PagedSearch<>();
		pagedSearch.setEntity(entity);
		
		PersonAddress personPaper = new PersonAddress();
		Integer offset = 0;
		Integer limit = 100;
		long count = 200;
		List<PersonAddress> entities = Arrays.asList(personPaper);
		PagedResult<PersonAddress> expected = new PagedResult<PersonAddress>(offset, limit, count, entities);
		
		// When
		when(defaultDao.getEntities(Matchers.<PagedSearch<PersonAddress>>any())).thenReturn(expected);
		PagedResult<PersonAddress> actual = unit.getAddresses(pagedSearch);

		// Then
		verify(defaultDao).getEntities(pagedSearch);
		verify(parametersExtractor).getParameters(pagedSearch.getEntity());
		assertEquals(expected, actual);
	}
}
