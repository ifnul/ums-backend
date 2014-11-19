package org.lnu.is.dao.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BaseQueryBuilderTest {

	@Test
	public void testBuild() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();

		String condition1 = "condition1 ";
		Object nullParameter = null;
		
		String expected = "SELECT FROM SMTH WHERE condition ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
			.where()
			.addOrCondition(condition, parameter)
			.addOrCondition(condition1, nullParameter)
			.build();

		// Then
		assertEquals(expected, actual);
	}
}
