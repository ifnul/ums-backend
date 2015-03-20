package org.lnu.is.dao.builder.eduformtype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EduFormTypeQueryBuilderTest {

	private EduFormTypeQueryBuilder unit = new EduFormTypeQueryBuilder();
	
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
		EduFormType context = new EduFormType();
		
		String expectedQuery = "SELECT e FROM EduFormType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EduFormType context = new EduFormType();
		
		String expectedQuery = "SELECT e FROM EduFormType e WHERE e.status=:status ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCOnstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EduFormType context = new EduFormType();
		
		String expectedQuery = "SELECT e FROM EduFormType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EduFormType context = new EduFormType();
		
		String expectedQuery = "SELECT e FROM EduFormType e ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		EduFormType context = new EduFormType();
		context.setName(name);

		String expectedQuery = "SELECT e FROM EduFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String name = "name";
		EduFormType context = new EduFormType();
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EduFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<EduFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
