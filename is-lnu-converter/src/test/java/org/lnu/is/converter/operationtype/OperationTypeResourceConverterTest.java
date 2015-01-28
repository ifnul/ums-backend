package org.lnu.is.converter.operationtype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.operationtype.OperationTypeResourceConverter;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.resource.operationtype.OperationTypeResource;

public class OperationTypeResourceConverterTest {

	private OperationTypeResourceConverter unit = new OperationTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given

		String name = "dog";
		String abbrName = "d";

		OperationTypeResource source = new OperationTypeResource();
		source.setAbbrName(abbrName);
		source.setName(name);

		OperationType expected = new OperationType();
		expected.setAbbrName(abbrName);
		expected.setName(name);

		// When
		OperationType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);

	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		OperationTypeResource source = new OperationTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<OperationTypeResource> sources = Arrays.asList(source); 
		
		OperationType expected = new OperationType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<OperationType> expecteds = Arrays.asList(expected);
		
		// Where
		List<OperationType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}

}
