package org.lnu.is.dao.builder.enrolment.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentSubject context = new EnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
	public void testBuildWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentSubject context = new EnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.status=:status ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		EnrolmentSubject context = new EnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentSubject context = new EnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);

		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fgdsfds";
		
		EnrolmentSubject context = new EnrolmentSubject();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("isTesting", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentSubject e WHERE ( e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') ) ORDER BY e.parent ASC, e.abbrName DESC, e.name ASC, e.isTesting DESC";
		MultiplePagedSearch<EnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
