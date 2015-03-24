package org.lnu.is.dao.builder.enrolment.statustype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.statustype.EnrolmentStatusType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EnrolmentStatusTypeQueryBuilderTest {

	private EnrolmentStatusTypeQueryBuilder unit = new EnrolmentStatusTypeQueryBuilder();
	
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
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
	
	@Test
	public void testBuildWithDisabledSecurityConstraitns() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrname";
		String name = "nasfads";
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbrname";
		String name = "nasfads";
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}	
}
