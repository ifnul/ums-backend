package org.lnu.is.dao.builder.operationtype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class OperationTypeQueryBuilderTest {

	private OperationTypeQueryBuilder unit = new OperationTypeQueryBuilder();
	
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
		OperationType context = new OperationType();
		
		String expectedQuery = "SELECT e FROM OperationType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityCosntraint() throws Exception {
		// Given
		unit.setSecurity(false);
		OperationType context = new OperationType();
		
		String expectedQuery = "SELECT e FROM OperationType e WHERE e.status=:status ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		OperationType context = new OperationType();
		
		String expectedQuery = "SELECT e FROM OperationType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
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
		
		OperationType context = new OperationType();
		
		String expectedQuery = "SELECT e FROM OperationType e ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "fsdfds";
		String abbrName = "dog";

		OperationType context = new OperationType();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM OperationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "fsdfds";
		String abbrName = "dog";
		
		OperationType context = new OperationType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM OperationType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<OperationType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
