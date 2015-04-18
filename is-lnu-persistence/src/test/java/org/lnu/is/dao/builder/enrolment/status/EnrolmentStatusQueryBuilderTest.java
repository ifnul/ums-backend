package org.lnu.is.dao.builder.enrolment.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class EnrolmentStatusQueryBuilderTest {

	private EnrolmentStatusQueryBuilder unit = new EnrolmentStatusQueryBuilder();
	
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
		EnrolmentStatus context = new EnrolmentStatus();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		EnrolmentStatus context = new EnrolmentStatus();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.status=:status ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.status=:status ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		
		EnrolmentStatus context = new EnrolmentStatus();
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferWave specOfferWave = new SpecOfferWave();
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		
		EnrolmentStatus context = new EnrolmentStatus();
		context.setEnrolment(enrolment);
		context.setSpecOfferWave(specOfferWave);
		context.setEnrolmentStatusType(enrolmentStatusType);

		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE ( e.enrolment = :enrolment AND e.specOfferWave =:specOfferWave AND e.enrolmentStatusType =:enrolmentStatusType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferWave specOfferWave = new SpecOfferWave();
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		
		EnrolmentStatus context = new EnrolmentStatus();
		context.setEnrolment(enrolment);
		context.setSpecOfferWave(specOfferWave);
		context.setEnrolmentStatusType(enrolmentStatusType);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);

		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE ( e.enrolment = :enrolment AND e.specOfferWave =:specOfferWave AND e.enrolmentStatusType =:enrolmentStatusType ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferWave specOfferWave = new SpecOfferWave();
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		
		EnrolmentStatus context = new EnrolmentStatus();
		context.setEnrolment(enrolment);
		context.setSpecOfferWave(specOfferWave);
		context.setEnrolmentStatusType(enrolmentStatusType);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE ( e.enrolment = :enrolment AND e.specOfferWave =:specOfferWave AND e.enrolmentStatusType =:enrolmentStatusType ) ";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
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
		SpecOfferWave specOfferWave = new SpecOfferWave();
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		
		EnrolmentStatus context = new EnrolmentStatus();
		context.setEnrolment(enrolment);
		context.setSpecOfferWave(specOfferWave);
		context.setEnrolmentStatusType(enrolmentStatusType);
		
		OrderBy orderBy1 = new OrderBy("enrolment", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOfferWave", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("enrolmentStatusType", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		String expectedQuery = "SELECT e FROM EnrolmentStatus e WHERE ( e.enrolment = :enrolment AND e.specOfferWave =:specOfferWave AND e.enrolmentStatusType =:enrolmentStatusType ) ORDER BY e.enrolment ASC, e.specOfferWave DESC, e.enrolmentStatusType ASC";
		MultiplePagedSearch<EnrolmentStatus> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
