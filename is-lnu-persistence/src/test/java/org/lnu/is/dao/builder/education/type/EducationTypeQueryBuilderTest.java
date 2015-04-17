package org.lnu.is.dao.builder.education.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.education.type.EducationType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EducationTypeQueryBuilderTest {

	private EducationTypeQueryBuilder unit = new EducationTypeQueryBuilder();
	
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
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EducationType context = new EducationType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM EducationType e WHERE e.status=:status ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		EducationType context = new EducationType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM EducationType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		String expected = "SELECT e FROM EducationType e ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EducationType context = new EducationType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM EducationType e ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);

		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultCOnstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);
		
		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultCOnstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbr name";
		String name = "name";
		EducationType context = new EducationType();
		context.setName(name);
		context.setAbbrName(abbrName);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM EducationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EducationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
