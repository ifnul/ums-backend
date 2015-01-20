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
	
	@Test
	public void testBuildAnd() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();

		String condition1 = "condition1 ";
		Object nullParameter = null;
		
		String expected = "SELECT FROM SMTH WHERE ( condition ) ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
			.where()
			.openBracket()
			.addOrCondition(condition, parameter)
			.addOrCondition(condition1, nullParameter)
			.closeBracket()
			.build();

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithComplicated() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;

		String condition2 = "condition2 ";
		Object parameter2 = "fdsfds";

		String condition3 = "condition3 ";
		Object parameter3 = "qwrvcvds";
		
		String expected = "SELECT FROM SMTH WHERE ( condition ) AND condition2 AND condition3 ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
				.openBracket()
				.addOrCondition(condition, parameter)
				.addOrCondition(condition1, nullParameter)
				.closeBracket()
				.addAndCondition(condition2, parameter2)
				.addAndCondition(condition3, parameter3)
				.build();
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithTwoOrConditions() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;
		
		String condition2 = "condition2 ";
		Object parameter2 = "fdsfds";
		
		String condition3 = "condition3 ";
		Object parameter3 = "qwrvcvds";

		String condition4 = "condition4 ";
		Object parameter4 = "lasflasnlkm";
		
		String expected = "SELECT FROM SMTH WHERE ( condition ) AND condition2 AND condition3 OR condition4 ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
				.openBracket()
				.addOrCondition(condition, parameter)
				.addOrCondition(condition1, nullParameter)
				.closeBracket()
				.addAndCondition(condition2, parameter2)
				.addAndCondition(condition3, parameter3)
				.addOrCondition(condition4, parameter4)
				.build();
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithTwoOrConditionsAndAndCondition() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;
		
		String condition2 = "condition2 ";
		Object parameter2 = "fdsfds";
		
		String condition3 = "condition3 ";
		Object parameter3 = "qwrvcvds";
		
		String condition4 = "condition4 ";
		Object parameter4 = "lasflasnlkm";

		String condition5 = "condition5 ";
		Object parameter5 = "m,ncksadkj";

		String expected = "SELECT FROM SMTH WHERE ( condition ) AND condition2 AND condition3 OR condition4 AND condition5 ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
				.openBracket()
				.addOrCondition(condition, parameter)
				.addOrCondition(condition1, nullParameter)
				.closeBracket()
				.addAndCondition(condition2, parameter2)
				.addAndCondition(condition3, parameter3)
				.addOrCondition(condition4, parameter4)
				.addAndCondition(condition5, parameter5)
				.build();
		
		// Then
		assertEquals(expected, actual);
	}
}
