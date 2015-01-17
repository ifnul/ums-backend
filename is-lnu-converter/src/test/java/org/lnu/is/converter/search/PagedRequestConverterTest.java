package org.lnu.is.converter.search;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.resource.search.PagedRequest;

public class PagedRequestConverterTest {

	private PagedRequestConverter<Department> unit = new PagedRequestConverter<Department>();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer limit = 20;
		Integer offset = 0;
		
		PagedRequest<Department> source = new PagedRequest<Department>();
		source.setLimit(limit);
		source.setOffset(offset);
		
		PagedSearch<Department> expected = new PagedSearch<Department>();
		expected.setLimit(limit);
		expected.setOffset(offset);

		
		// When
		PagedSearch<Department> actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
}
