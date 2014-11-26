package org.lnu.is.dao.dao.address.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.pagination.PagedQuerySearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Queries;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultAddressTypeDaoTest {

	@Mock
	private PersistenceManager<AddressType, Long> persistenceManager;

	@Mock
	private QueryBuilder<AddressType> queryBuilder;

	@InjectMocks
	private DefaultAddressTypeDao unit;

	@Test
	public void testGetAddressTypes() throws Exception {
		// Given
		int offset = 10;
		int limit = 10;
		int count = 100;

		String queryCommand = "query";

		Queries<AddressType> query = new Queries<AddressType>(AddressType.class, queryCommand);

		PagedQuerySearch<AddressType> pagedSearch = new PagedQuerySearch<AddressType>(query,
				offset, limit, Collections.<String, Object> emptyMap(),
				AddressType.class);

		AddressType entity = new AddressType();
		List<AddressType> entities = Arrays.asList(entity);
		PagedResult<AddressType> expected = new PagedResult<AddressType>(
				offset, limit, count, entities);

		// When
		when(queryBuilder.build(any(AddressType.class))).thenReturn(queryCommand);
		when(persistenceManager.search(Matchers.<PagedQuerySearch<AddressType>> any())).thenReturn(expected);
		PagedResult<AddressType> actual = unit.getEntities(pagedSearch);

		// Then
		verify(persistenceManager).search(pagedSearch);
		assertEquals(expected, actual);
	}

}
