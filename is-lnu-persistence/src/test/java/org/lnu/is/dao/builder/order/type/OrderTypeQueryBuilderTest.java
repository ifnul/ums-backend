package org.lnu.is.dao.builder.order.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.order.OrderType;

public class OrderTypeQueryBuilderTest {

	private OrderTypeQueryBuilder unit = new OrderTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		OrderType context = new OrderType();
		
		String expected = "SELECT e FROM OrderType e ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Long parentId = 1L;
		String abbrName = "abbr name";
		String name = "name";
		OrderType parent = new OrderType();
		parent.setId(parentId);
		
		OrderType context = new OrderType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setParent(parent);
		
		String expected = "SELECT e FROM OrderType e WHERE e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
