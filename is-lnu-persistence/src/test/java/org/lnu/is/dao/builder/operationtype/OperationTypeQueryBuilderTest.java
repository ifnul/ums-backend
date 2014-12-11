package org.lnu.is.dao.builder.operationtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;

public class OperationTypeQueryBuilderTest {

	private OperationTypeQueryBuilder unit = new OperationTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "dog";

		OperationType context = new OperationType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT m FROM OperationType m WHERE m.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
