package org.lnu.is.dao.builder.enrolment.enrolment.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EnrolmentEnrolmentQueryBuilderTest {

    private EnrolmentEnrolmentSubjectQueryBuilder unit = new EnrolmentEnrolmentSubjectQueryBuilder();
	
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
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
    
    @Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.status=:status ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) ";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
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
		
		Enrolment enrolment = new Enrolment();
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		Double mark = 1d;
		
		EnrolmentEnrolmentSubject context = new EnrolmentEnrolmentSubject();
		context.setEnrolment(enrolment);
		context.setEnrolmentSubject(enrolmentSubject);
		context.setPersonEnrolmentSubject(personEnrolmentSubject);
		context.setMark(mark);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("enrolmentSubject", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personEnrolmentSubject", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("mark", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4);
		
		String expectedQuery = "SELECT e FROM EnrolmentEnrolmentSubject e WHERE ( e.entolment = :enrolmrnt AND e.enrolmentSubject = :enrolmentSubject AND e.mark = :mark AND e.personEnrolmentSubject = :personEnrolmentSubject ) ORDER BY e.enrolment ASC, e.enrolmentSubject DESC, e.personEnrolmentSubject ASC, e.mark DESC";
		MultiplePagedSearch<EnrolmentEnrolmentSubject> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
