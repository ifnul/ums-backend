package org.lnu.is.dao.builder.specoffer.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.queries.Queries;

public class SpecOfferTypeQueryBuilderTest {

	private SpecOfferTypeQueryBuilder unit = new SpecOfferTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		SpecialtyType specialType = new SpecialtyType();
		String abbrName = "abbrName";
		String name = "name";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setSpecialtyType(specialType);

		String expectedQuery = "SELECT s FROM SpecOfferType s WHERE s.name LIKE CONCAT('%',:name,'%') OR s.abbrName LIKE CONCAT('%',:abbrName,'%') OR s.specialtyType = :specialtyType";
		
		// When
		Queries actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery.getQuery());
	}

	@Test
	public void testBuildEmptyParameters() throws Exception {
		// Given
		SpecialtyType specialType = new SpecialtyType();
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		context.setSpecialtyType(specialType);
		
		String expectedQuery = "SELECT s FROM SpecOfferType s WHERE s.abbrName LIKE CONCAT('%',:abbrName,'%') OR s.specialtyType = :specialtyType";
		
		// When
		Queries actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery.getQuery());
	}
}
