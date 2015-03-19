package org.lnu.is.dao.builder.wave.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class WaveTypeQueryBuilderTest {

	private WaveTypeQueryBuilder unit = new WaveTypeQueryBuilder();
	
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
		WaveType context = new WaveType();

		String expected = "SELECT e FROM WaveType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e WHERE e.status=:status ";
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		WaveType context = new WaveType();
		
		String expected = "SELECT e FROM WaveType e ";
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		WaveType context = new WaveType();
		context.setName(name);
		
		String expected = "SELECT e FROM WaveType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";;
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "name";
		WaveType context = new WaveType();
		context.setName(name);
		
		String expected = "SELECT e FROM WaveType e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) ";;
		MultiplePagedSearch<WaveType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
