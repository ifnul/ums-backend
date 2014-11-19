package org.lnu.is.dao.builder.enrolment.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.dao.builder.enrolment.subject.EnrolmentSubjectQueryBuilder;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.queries.Queries;

public class EnrolmentSubjectQueryBuilderTest {

	private EnrolmentSubjectQueryBuilder unit = new EnrolmentSubjectQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "abbrname";
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.abbrName LIKE CONCAT('%',:abbrName,'%') ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
