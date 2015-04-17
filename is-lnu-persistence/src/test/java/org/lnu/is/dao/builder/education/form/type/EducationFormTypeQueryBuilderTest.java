package org.lnu.is.dao.builder.education.form.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.education.form.type.EducationFormTypeQueryBuilder;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EducationFormTypeQueryBuilderTest {

	private EducationFormTypeQueryBuilder unit = new EducationFormTypeQueryBuilder();
	
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
		EducationFormType context = new EducationFormType();
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EducationFormType context = new EducationFormType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EducationFormType context = new EducationFormType();
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.status=:status ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EducationFormType context = new EducationFormType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.status=:status ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCOnstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EducationFormType context = new EducationFormType();
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusCOnstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		EducationFormType context = new EducationFormType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		EducationFormType context = new EducationFormType();
		
		String expectedQuery = "SELECT e FROM EducationFormType e ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EducationFormType context = new EducationFormType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM EducationFormType e ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		EducationFormType context = new EducationFormType();
		context.setName(name);

		String expectedQuery = "SELECT e FROM EducationFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String name = "name";
		EducationFormType context = new EducationFormType();
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);

		String expectedQuery = "SELECT e FROM EducationFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		EducationFormType context = new EducationFormType();
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		EducationFormType context = new EducationFormType();
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expectedQuery = "SELECT e FROM EducationFormType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ORDER BY e.name ASC";
		MultiplePagedSearch<EducationFormType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
