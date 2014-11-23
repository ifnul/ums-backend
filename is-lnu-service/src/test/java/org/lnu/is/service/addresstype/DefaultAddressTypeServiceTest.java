package org.lnu.is.service.addresstype;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.addresstype.AddressTypeDao;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultAddressTypeServiceTest {

	@Mock
	private AddressTypeDao addressTypeDao;

	@Mock
	private ParametersExtractor<AddressType> parametersExtractor;

	@InjectMocks
	private DefaultAddressTypeService unit;

	@Test
	public void testGetAddressTypes() throws Exception {
		// Given
		PagedSearch<AddressType> pagedSearch = new PagedSearch<>();

		int offset = 10;
		int limit = 10;
		int count = 100;

		List<AddressType> entities = Collections.<AddressType> emptyList();
		PagedResult<AddressType> expected = new PagedResult<AddressType>(
				offset, limit, count, entities);

		// When
		when(
				addressTypeDao.getEntities(Matchers
						.<PagedSearch<AddressType>> any()))
				.thenReturn(expected);
		PagedResult<AddressType> actual = unit.getAddressTypes(pagedSearch);

		// Then
		verify(addressTypeDao).getEntities(pagedSearch);
		assertEquals(expected, actual);
	}
}
