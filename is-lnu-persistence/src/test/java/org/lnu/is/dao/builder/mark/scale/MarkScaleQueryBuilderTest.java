package org.lnu.is.dao.builder.mark.scale;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.mark.scale.MarkScaleQueryBuilder;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkScaleQueryBuilderTest {

	private MarkScaleQueryBuilder unit = new MarkScaleQueryBuilder();
	
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
		MarkScale context = new MarkScale();
		
		String expected = "SELECT e FROM MarkScale e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		MarkScale context = new MarkScale();
		
		String expected = "SELECT e FROM MarkScale e WHERE e.status=:status ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScale context = new MarkScale();
		
		String expected = "SELECT e FROM MarkScale e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		MarkScale context = new MarkScale();
		
		String expected = "SELECT e FROM MarkScale e ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkScaleType markScaleType = new MarkScaleType();
		markScaleType.setId(1L);
		
		MarkScale context = new MarkScale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkScaleType(markScaleType);

		String expected = "SELECT e FROM MarkScale e WHERE ( e.markScaleType = :markScaleType AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.markMin = :markMin AND e.markMax = :markMax ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
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
		
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkScaleType markScaleType = new MarkScaleType();
		markScaleType.setId(1L);
		
		MarkScale context = new MarkScale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkScaleType(markScaleType);
		
		String expected = "SELECT e FROM MarkScale e WHERE ( e.markScaleType = :markScaleType AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.name LIKE CONCAT('%',:name,'%') AND e.markMin = :markMin AND e.markMax = :markMax ) ";
		MultiplePagedSearch<MarkScale> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
