package org.lnu.is.dao.builder.studyplan.cycle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

public class StudyPlanCycleQueryBuilderTest {

	private StudyPlanCycleQueryBuilder unit = new StudyPlanCycleQueryBuilder();
	
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
		StudyPlanCycle context = new StudyPlanCycle();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.name ASC, e.abbrName DESC";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecuirtyConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.status=:status ";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStautsConstaint() throws Exception {
		// Given
		unit.setActive(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstaitns() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e ";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstaitnsWithSingleOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(orderBy1);
		
		String expected = "SELECT e FROM StudyPlanCycle e ORDER BY e.name ASC";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstaitnsAndWithOrderByOfTwoFields() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("abbrName", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expected = "SELECT e FROM StudyPlanCycle e ORDER BY e.name ASC, e.abbrName DESC";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "name";
		String abbrName = "abbr name";
		StudyPlanCycle context = new StudyPlanCycle();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expected = "SELECT e FROM StudyPlanCycle e WHERE ( d.name LIKE CONCAT('%',:name,'%') OR d.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDEfaultConstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		String abbrName = "abbr name";
		StudyPlanCycle context = new StudyPlanCycle();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE ( d.name LIKE CONCAT('%',:name,'%') OR d.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<StudyPlanCycle> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
