package org.lnu.is.dao.builder.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class BenefitQueryBuilderTest {

	private BenefitQueryBuilder unit = new BenefitQueryBuilder();
	
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
		Benefit context = new Benefit();
		
		String expected = "SELECT e FROM Benefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Benefit context = new Benefit();
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		Benefit context = new Benefit();
		
		String expected = "SELECT e FROM Benefit e WHERE e.status=:status ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		Benefit context = new Benefit();
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e WHERE e.status=:status ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		Benefit context = new Benefit();
		
		String expected = "SELECT e FROM Benefit e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
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
		
		Benefit context = new Benefit();
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDEfaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Benefit context = new Benefit();
		
		String expected = "SELECT e FROM Benefit e ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDEfaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Benefit context = new Benefit();
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testConvertWithParameters() throws Exception {
		// Given
		BenefitType benefitType = new BenefitType();
		Benefit parent = new Benefit();

		String abbrName = "fsdsfds";
		String name = "name1";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "dsafds";

		Benefit context = new Benefit();
		context.setBenefitType(benefitType);
		context.setParent(parent);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setDescription(description);
		
		String expected = "SELECT e FROM Benefit e WHERE ( e.benefitType = :benefitType AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.description LIKE CONCAT('%',:description,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersWithOrderBy() throws Exception {
		// Given
		BenefitType benefitType = new BenefitType();
		Benefit parent = new Benefit();

		String abbrName = "fsdsfds";
		String name = "name1";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "dsafds";

		Benefit context = new Benefit();
		context.setBenefitType(benefitType);
		context.setParent(parent);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setDescription(description);
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e WHERE ( e.benefitType = :benefitType AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.description LIKE CONCAT('%',:description,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		BenefitType benefitType = new BenefitType();
		Benefit parent = new Benefit();
		
		String abbrName = "fsdsfds";
		String name = "name1";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "dsafds";
		
		Benefit context = new Benefit();
		context.setBenefitType(benefitType);
		context.setParent(parent);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setDescription(description);
		
		String expected = "SELECT e FROM Benefit e WHERE ( e.benefitType = :benefitType AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.description LIKE CONCAT('%',:description,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate ) ";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		BenefitType benefitType = new BenefitType();
		Benefit parent = new Benefit();
		
		String abbrName = "fsdsfds";
		String name = "name1";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "dsafds";
		
		Benefit context = new Benefit();
		context.setBenefitType(benefitType);
		context.setParent(parent);
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		context.setDescription(description);
		
		OrderBy orderBy1 = new OrderBy("benefitType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("begdate", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("enddate", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("description", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7);
		
		String expected = "SELECT e FROM Benefit e WHERE ( e.benefitType = :benefitType AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.description LIKE CONCAT('%',:description,'%') AND e.begDate <= :begDate AND e.endDate >= :endDate ) ORDER BY e.benefitType ASC, e.parent DESC, e.abbrName ASC, e.name DESC, e.begdate ASC, e.enddate DESC, e.description ASC";
		MultiplePagedSearch<Benefit> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
