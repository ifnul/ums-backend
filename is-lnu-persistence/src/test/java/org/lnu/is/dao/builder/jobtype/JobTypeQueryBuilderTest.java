package org.lnu.is.dao.builder.jobtype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.queries.Queries;

public class JobTypeQueryBuilderTest {

	private JobTypeQueryBuilder unit = new JobTypeQueryBuilder();

	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "LieToMe";
		
		JobType context = new JobType();
		context.setAbbrName(abbrName);

		String expectedQuery = "SELECT g FROM JobType g WHERE g.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}