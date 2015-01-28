package org.lnu.is.converter.order.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.resource.order.type.OrderTypeResource;

public class OrderTypeConverterTest {

	private OrderTypeConverter unit = new OrderTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";

		Long parentId = 2L;
		OrderType parent = new OrderType();
		parent.setId(parentId);

		OrderType source = new OrderType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setParent(parent);

		OrderTypeResource expected = new OrderTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setParentId(parentId);
		
		// When
		OrderTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		
		OrderType source = new OrderType();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		OrderTypeResource expected = new OrderTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		OrderTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";

		String abbrName1 = "abbrName1";
		String name1 = "name1";

		Long parentId = 2L;
		OrderType parent = new OrderType();
		parent.setId(parentId);

		OrderType source = new OrderType();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setParent(parent);

		OrderTypeResource expected = new OrderTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setParentId(parentId);
		
		OrderType source1 = new OrderType();
		source1.setAbbrName(abbrName1);
		source1.setName(name1);
		
		OrderTypeResource expected1 = new OrderTypeResource();
		expected1.setAbbrName(abbrName1);
		expected1.setName(name1);

		List<OrderTypeResource> expecteds = Arrays.asList(expected,expected1);
		
		List<OrderType> sources = Arrays.asList(source,source1);
		
		// When
		List<OrderTypeResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
