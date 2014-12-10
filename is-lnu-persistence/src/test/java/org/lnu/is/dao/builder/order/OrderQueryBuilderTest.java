package org.lnu.is.dao.builder.order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.order.Order;

public class OrderQueryBuilderTest {

	private OrderQueryBuilder unit = new OrderQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Order context = new Order();

		String expected = "SELECT o FROM Order o ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
