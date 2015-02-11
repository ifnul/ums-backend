package org.lnu.is.converter.operationtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.resource.operationtype.OperationTypeResource;

public class OperationTypeConverterTest {

	private OperationTypeConverter unit = new OperationTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "dog";
		String abbrName = "d";

		OperationType source = new OperationType();
		source.setAbbrName(abbrName);
		source.setName(name);

		OperationTypeResource expected = new OperationTypeResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		OperationTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		OperationType source = new OperationType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<OperationType> sources = Arrays.asList(source); 
		
		OperationTypeResource expected = new OperationTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<OperationTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<OperationTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
