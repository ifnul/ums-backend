package org.lnu.is.converter.order.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.order.type.OrderType;
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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		
		OrderType expected = new OrderType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		OrderTypeResource source = new OrderTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		
		// When
		OrderType actual = unit.convert(source);
		
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

		OrderType expected = new OrderType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setParent(parent);
		
		OrderTypeResource source = new OrderTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setParentId(parentId);
		
		
		OrderType expected1 = new OrderType();
		expected1.setAbbrName(abbrName1);
		expected1.setName(name1);
		
		OrderTypeResource source1 = new OrderTypeResource();
		source1.setAbbrName(abbrName1);
		source1.setName(name1);
		
		List<OrderType> expecteds = Arrays.asList(expected,expected1);
		
		List<OrderTypeResource> sources = Arrays.asList(source,source1);
		
		// When
		List<OrderType> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
