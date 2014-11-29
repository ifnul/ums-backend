package org.lnu.is.dao.builder.enrolment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;

public class EnrolmentQueryBuilderTest {

private EnrolmentQueryBuilder unit = new EnrolmentQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String docNum = "123456789";
		Enrolment context = new Enrolment();
		context.setDocNum(docNum);

		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.docNum LIKE CONCAT('%',:docNum,'%') ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
