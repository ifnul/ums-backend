package org.lnu.is.dao.builder.benefit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class BenefitTypeQueryBuilderTest {

	private BenefitTypeQueryBuilder unit = new BenefitTypeQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testConvert() throws Exception {
		// Given
		BenefitType context = new BenefitType();
		
		String expected = "SELECT e FROM BenefitType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithOrderBy() throws Exception {
		// Given
		BenefitType context = new BenefitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		BenefitType context = new BenefitType();
		
		String expected = "SELECT e FROM BenefitType e WHERE e.status=:status ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledSecurityConstraintWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		BenefitType context = new BenefitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e WHERE e.status=:status ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		BenefitType context = new BenefitType();
		
		String expected = "SELECT e FROM BenefitType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		BenefitType context = new BenefitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		BenefitType context = new BenefitType();
		
		String expected = "SELECT e FROM BenefitType e ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		BenefitType context = new BenefitType();
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "name";
		Integer priority = 2;

		BenefitType context = new BenefitType();
		context.setName(name);
		context.setPriority(priority);
		
		String expected = "SELECT e FROM BenefitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.priority =:priority ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersWithOrderBy() throws Exception {
		// Given
		String name = "name";
		Integer priority = 2;

		BenefitType context = new BenefitType();
		context.setName(name);
		context.setPriority(priority);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.priority =:priority ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersAndDisabledDeefaultConstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		Integer priority = 2;
		
		BenefitType context = new BenefitType();
		context.setName(name);
		context.setPriority(priority);
		
		String expected = "SELECT e FROM BenefitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.priority =:priority ) ";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testConvertWithParametersAndDisabledDeefaultConstaintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		Integer priority = 2;
		
		BenefitType context = new BenefitType();
		context.setName(name);
		context.setPriority(priority);
		
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM BenefitType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.priority =:priority ) ORDER BY e.name ASC, e.priority DESC";
		MultiplePagedSearch<BenefitType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
