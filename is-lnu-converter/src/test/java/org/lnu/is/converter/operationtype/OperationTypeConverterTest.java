package org.lnu.is.converter.operationtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.operationtype.OperationTypeConverter;
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

}
