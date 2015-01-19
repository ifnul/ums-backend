package org.lnu.is.dao.builder.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.specialty.Specialty;

public class SpecialtyQueryBuilderTest {

	private SpecialtyQueryBuilder unit = new SpecialtyQueryBuilder();
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String cipher = "fsdfsd";
		Specialty context = new Specialty();
		String abbrName = "fsdsd";
		String name = "fsdsd";
		Date endDate = new Date();
		
		context.setCipher(cipher);
		context.setBegDate(new Date());
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM Specialty e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.cipher LIKE CONCAT('%',:cipher,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		Specialty context = new Specialty();

		String expectedQuery = "SELECT e FROM Specialty e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
