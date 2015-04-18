package org.lnu.is.dao.builder.enrolment.status.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.enrolment.statustype.EnrolmentStatusTypeQueryBuilder;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledSecurityConstraitnsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.status=:status ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
	public void testBuildWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String abbrName = "abbrname";
		String name = "nasfads";
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);

		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
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
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbrname";
		String name = "nasfads";
		
		EnrolmentStatusType context = new EnrolmentStatusType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatusType e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ORDER BY e.abbrName ASC, e.name DESC, e.description ASC";
		MultiplePagedSearch<EnrolmentStatusType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
