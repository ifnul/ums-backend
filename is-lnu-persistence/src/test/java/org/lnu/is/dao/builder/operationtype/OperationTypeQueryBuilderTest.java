package org.lnu.is.dao.builder.operationtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;

public class OperationTypeQueryBuilderTest {

	private OperationTypeQueryBuilder unit = new OperationTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		OperationType context = new OperationType();
		
		String expectedQuery = "SELECT e FROM OperationType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "fsdfds";
		String abbrName = "dog";

		OperationType context = new OperationType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM OperationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
