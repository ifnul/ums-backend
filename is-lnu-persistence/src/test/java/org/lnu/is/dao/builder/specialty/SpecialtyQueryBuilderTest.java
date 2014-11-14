package org.lnu.is.dao.builder.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.queries.Queries;

public class SpecialtyQueryBuilderTest {

	private SpecialtyQueryBuilder unit = new SpecialtyQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String cipher = "fsdfsd";
		Specialty context = new Specialty();
		context.setCipher(cipher);
		context.setBegDate(new Date());

		String expectedQuery = "SELECT s FROM Specialty s WHERE s.cipher LIKE CONCAT('%',:cipher,'%') OR s.begDate <= :begDate ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
