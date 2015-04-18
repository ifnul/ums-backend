package org.lnu.is.dao.builder.enrolment.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EnrolmentBenefitQueryBuilderTest {

	private EnrolmentBenefitQueryBuilder unit = new EnrolmentBenefitQueryBuilder();
	
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
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.status=:status ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);

		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment AND e.benefit =:benefit AND e.personPaper =:personPaper ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);

		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment AND e.benefit =:benefit AND e.personPaper =:personPaper ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment AND e.benefit =:benefit AND e.personPaper =:personPaper ) ";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
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
		Benefit benefit = new Benefit();
		PersonPaper personpaper = new PersonPaper();
		
		EnrolmentBenefit context = new EnrolmentBenefit();
		context.setEnrolment(enrolment);
		context.setBenefit(benefit);
		context.setPersonPaper(personpaper);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("benefit", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("personPaper", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentBenefit e WHERE ( e.enrolment = :enrolment AND e.benefit =:benefit AND e.personPaper =:personPaper ) ORDER BY e.enrolment ASC, e.benefit DESC, e.personPaper ASC";
		MultiplePagedSearch<EnrolmentBenefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}