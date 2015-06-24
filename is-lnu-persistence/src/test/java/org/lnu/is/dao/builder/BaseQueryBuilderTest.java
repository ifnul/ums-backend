package org.lnu.is.dao.builder;

import org.junit.Test;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;
		OrderBy orderBy1 = new OrderBy("name1", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name2", OrderByType.DESC);
		
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT FROM SMTH WHERE condition ORDER BY e.name1 ASC, e.name2 DESC";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
					.addOrCondition(condition, parameter)
					.addOrCondition(condition1, nullParameter)
					.orderBy(orders)
				.build();
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithOrderByWithLambdaFunction() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();

		String condition1 = "condition1 ";
		Object nullParameter = null;

		String condition3 = "condition2.name = ''{0}'' ";
		List<String> names = Arrays.asList("name1", "name2", "name3");

		OrderBy orderBy1 = new OrderBy("name1", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name2", OrderByType.DESC);

		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT FROM SMTH WHERE condition AND  (condition2.name = 'name1' OR condition2.name = 'name2' OR condition2.name = 'name3' ) ORDER BY e.name1 ASC, e.name2 DESC";

		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
					.addOrCondition(condition, parameter)
					.addOrCondition(condition1, nullParameter)
					.addAndConditionForLoop(o -> MessageFormat.format(condition3, o), names)
					.orderBy(orders)
				.build();

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithSingleOrderBy() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;
		OrderBy orderBy1 = new OrderBy("name1", OrderByType.ASC);
		
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expected = "SELECT FROM SMTH WHERE condition ORDER BY e.name1 ASC";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
				.addOrCondition(condition, parameter)
				.addOrCondition(condition1, nullParameter)
				.orderBy(orders)
				.build();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithEmptyOrderBy() throws Exception {
		// Given
		String query = "SELECT FROM SMTH %s";
		String condition = "condition ";
		Object parameter = new Object();
		
		String condition1 = "condition1 ";
		Object nullParameter = null;
		List<OrderBy> orders = Collections.emptyList();
		
		String expected = "SELECT FROM SMTH WHERE condition ";
		
		// When
		String actual = BaseQueryBuilder.getInstance(query)
				.where()
				.addOrCondition(condition, parameter)
				.addOrCondition(condition1, nullParameter)
				.orderBy(orders)
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
