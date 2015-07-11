package org.lnu.is.converter.search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;
import org.lnu.is.resource.search.PagedRequest;

public class PagedRequestConverterTest {

	private PagedRequestConverter<Department> unit = new PagedRequestConverter<Department>();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer limit = 20;
		Integer offset = 0;
		
		OrderBy order1 = new OrderBy();
		order1.setFieldName("description");
		order1.setType(OrderByType.ASC);
		
		OrderBy order2 = new OrderBy();
		order2.setFieldName("name");
		order2.setType(OrderByType.DESC);
		
		List<OrderBy> orders  = Arrays.asList(order1, order2);

		PagedRequest<Department> source = new PagedRequest<Department>();
		source.setLimit(limit);
		source.setOffset(offset);
		source.setOrders(orders);
		
		MultiplePagedSearch<Department> expected = new MultiplePagedSearch<Department>();
		expected.setLimit(limit);
		expected.setOffset(offset);
		expected.setOrders(orders);
		expected.setParameters(source.getParameters());

		
		// When
		MultiplePagedSearch<Department> actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
}
