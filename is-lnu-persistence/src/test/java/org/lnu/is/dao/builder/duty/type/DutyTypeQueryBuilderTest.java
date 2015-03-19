package org.lnu.is.dao.builder.duty.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.dutytype.DutyType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class DutyTypeQueryBuilderTest {

	private DutyTypeQueryBuilder unit = new DutyTypeQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given

		DutyType context = new DutyType();

		String expectedQuery = "SELECT e FROM DutyType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstaints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DutyType context = new DutyType();
		
		String expectedQuery = "SELECT e FROM DutyType e WHERE e.status=:status ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
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
		
		DutyType context = new DutyType();
		
		String expectedQuery = "SELECT e FROM DutyType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
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
		
		DutyType context = new DutyType();
		
		String expectedQuery = "SELECT e FROM DutyType e ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "asfdasf";
		
		DutyType context = new DutyType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM DutyType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrname LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "AN";
		String name = "asfdasf";
		
		DutyType context = new DutyType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM DutyType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrname LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<DutyType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
