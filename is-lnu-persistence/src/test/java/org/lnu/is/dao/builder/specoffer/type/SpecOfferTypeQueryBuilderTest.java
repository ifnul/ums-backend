package org.lnu.is.dao.builder.specoffer.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;

public class SpecOfferTypeQueryBuilderTest {

	private SpecOfferTypeQueryBuilder unit = new SpecOfferTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		SpecOfferType context = new SpecOfferType();

		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithOneParameter() throws Exception {
		// Given
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParameters() throws Exception {
		// Given
		SpecialtyType specialType = new SpecialtyType();
		String abbrName = "abbrName";
		
		SpecOfferType context = new SpecOfferType();
		context.setAbbrName(abbrName);
		context.setSpecialtyType(specialType);
		
		String expectedQuery = "SELECT e FROM SpecOfferType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.specialtyType = :specialtyType) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
