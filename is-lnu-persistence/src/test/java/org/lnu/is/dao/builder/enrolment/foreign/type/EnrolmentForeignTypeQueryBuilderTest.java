package org.lnu.is.dao.builder.enrolment.foreign.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.enrolment.foreign.type.EnrolmentForeignTypeQueryBuilder;
import org.lnu.is.domain.enrolment.foreign.type.EnrolmentForeignType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EnrolmentForeignTypeQueryBuilderTest {

	private EnrolmentForeignTypeQueryBuilder unit = new EnrolmentForeignTypeQueryBuilder();
	
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
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.status=:status ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultCOnstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultCOnstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
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
		String abbrName = "abbrName";
		String name = "name";

		EnrolmentForeignType context = new EnrolmentForeignType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";

		EnrolmentForeignType context = new EnrolmentForeignType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbrName";
		String name = "name";
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbrName";
		String name = "name";
		
		EnrolmentForeignType context = new EnrolmentForeignType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM EnrolmentForeignType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<EnrolmentForeignType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
