package org.lnu.is.converter.order.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.resource.order.type.OrderTypeResource;

public class OrderTypeResourceConverterTest {

	private OrderTypeResourceConverter unit = new OrderTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		
		Long parentId = 2L;
		OrderType parent = new OrderType();
		parent.setId(parentId);

		OrderType expected = new OrderType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setParent(parent);
		
		OrderTypeResource source = new OrderTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setParentId(parentId);
		
		// When
		OrderType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
