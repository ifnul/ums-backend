package org.lnu.is.facade.converter.operationtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.facade.resource.operationtype.OperationTypeResource;

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

}
