package org.lnu.is.converter.search;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.resource.ApiResource;
import org.lnu.is.resource.search.PagedResultResource;

public class PagedSearchConverterTest {

	private PagedSearchConverter unit = new PagedSearchConverter();
	
	@Test
	public void testConvert() throws Exception {
		Integer offset = 100;
		Integer limit = 0;
		long count = 150;
		List<Department> entities = Collections.emptyList();
		
		// Given
		PagedResult<Department> source = new PagedResult<Department>(offset, limit, count, entities);

		PagedResultResource<? extends ApiResource> expected = new PagedResultResource<ApiResource>();
		expected.setOffset(offset);
		expected.setLimit(limit);
		expected.setCount(count);

		PagedResultResource<? extends ApiResource> actual = new PagedResultResource<ApiResource>();
		
		// When
		unit.convert(source, actual);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertWithOneArgument() throws Exception {
		unit.convert(null);
	}
}
