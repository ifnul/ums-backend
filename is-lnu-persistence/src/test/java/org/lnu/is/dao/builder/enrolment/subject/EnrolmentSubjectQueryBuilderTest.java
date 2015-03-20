package org.lnu.is.dao.builder.enrolment.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EnrolmentSubjectQueryBuilderTest {

	private EnrolmentSubjectQueryBuilder unit = new EnrolmentSubjectQueryBuilder();
	
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
		EnrolmentSubject context = new EnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentSubject context = new EnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		EnrolmentSubject context = new EnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentSubject context = new EnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
