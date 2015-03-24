package org.lnu.is.dao.builder.degree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class DegreeQueryBuilderTest {

	private DegreeQueryBuilder unit = new DegreeQueryBuilder();
	
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
		Degree context = new Degree();

		String expectedQuery = "SELECT e FROM Degree e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Degree context = new Degree();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expectedQuery = "SELECT e FROM Degree e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		
		Degree context = new Degree();
		
		String expectedQuery = "SELECT e FROM Degree e WHERE e.status=:status ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		
		Degree context = new Degree();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE e.status=:status ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		
		Degree context = new Degree();
		
		String expectedQuery = "SELECT e FROM Degree e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		
		Degree context = new Degree();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		unit.setSecurity(false);
		unit.setActive(false);
		
		Degree context = new Degree();
		
		String expectedQuery = "SELECT e FROM Degree e ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		unit.setActive(false);
		
		Degree context = new Degree();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM Degree e ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
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
		DegreeType degreeType = new DegreeType();
		Person person = new Person();
		Degree context = new Degree();
		context.setPerson(person);
		context.setDegreeType(degreeType);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE ( e.person=:person AND e.degreeType=:degreeType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		DegreeType degreeType = new DegreeType();
		Person person = new Person();
		Degree context = new Degree();
		context.setPerson(person);
		context.setDegreeType(degreeType);
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE ( e.person=:person AND e.degreeType=:degreeType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DegreeType degreeType = new DegreeType();
		Person person = new Person();
		Degree context = new Degree();
		context.setPerson(person);
		context.setDegreeType(degreeType);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE ( e.person=:person AND e.degreeType=:degreeType ) ";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DegreeType degreeType = new DegreeType();
		Person person = new Person();
		Degree context = new Degree();
		context.setPerson(person);
		context.setDegreeType(degreeType);
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("degreeType", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM Degree e WHERE ( e.person=:person AND e.degreeType=:degreeType ) ORDER BY e.person ASC, e.degreeType DESC";
		MultiplePagedSearch<Degree> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
