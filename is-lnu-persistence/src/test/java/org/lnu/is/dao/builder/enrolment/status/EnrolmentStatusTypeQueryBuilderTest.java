package org.lnu.is.dao.builder.enrolment.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.queries.Queries;

public class EnrolmentStatusTypeQueryBuilderTest {

	private EnrolmentStatusTypeQueryBuilder unit = new EnrolmentStatusTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbrname";
		EnrolmentStatusType context = new EnrolmentStatusType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
}
