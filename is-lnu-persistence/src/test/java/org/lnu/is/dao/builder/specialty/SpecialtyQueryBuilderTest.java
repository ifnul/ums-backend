package org.lnu.is.dao.builder.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.pagination.MultiplePagedSearch;

public class SpecialtyQueryBuilderTest {

	private SpecialtyQueryBuilder unit = new SpecialtyQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

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
		
		String expectedQuery = "SELECT e FROM Specialty e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.cipher LIKE CONCAT('%',:cipher,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
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
		
		String expectedQuery = "SELECT e FROM Specialty e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.cipher LIKE CONCAT('%',:cipher,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate ) ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		Specialty context = new Specialty();

		String expectedQuery = "SELECT e FROM Specialty e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Specialty context = new Specialty();
		
		String expectedQuery = "SELECT e FROM Specialty e WHERE e.status=:status ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Specialty context = new Specialty();
		
		String expectedQuery = "SELECT e FROM Specialty e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Specialty context = new Specialty();
		
		String expectedQuery = "SELECT e FROM Specialty e ";
		MultiplePagedSearch<Specialty> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
