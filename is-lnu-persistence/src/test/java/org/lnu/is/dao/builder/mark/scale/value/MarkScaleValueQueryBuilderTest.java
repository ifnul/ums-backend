package org.lnu.is.dao.builder.mark.scale.value;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.dao.builder.mark.scale.value.MarkScaleValueQueryBuilder;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.pagination.MultiplePagedSearch;

public class MarkScaleValueQueryBuilderTest {

	private MarkScaleValueQueryBuilder unit = new MarkScaleValueQueryBuilder();
	
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
		MarkScaleValue context = new MarkScaleValue();
		
		String expected = "SELECT e FROM MarkScaleValue e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleValue context = new MarkScaleValue();
		
		String expected = "SELECT e FROM MarkScaleValue e WHERE e.status=:status ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleValue context = new MarkScaleValue();
		
		String expected = "SELECT e FROM MarkScaleValue e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		MarkScaleValue context = new MarkScaleValue();
		
		String expected = "SELECT e FROM MarkScaleValue e ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String strValue = "strValue";
		
		MarkScale markScale = new MarkScale();
		markScale.setId(1L);
		
		MarkScaleValue context = new MarkScaleValue();
		
		context.setStrValue(strValue);
		
		context.setMarkScale(markScale);

		String expected = "SELECT e FROM MarkScaleValue e WHERE ( e.markScale = :markScale AND e.strValue LIKE CONCAT('%',:strValue,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
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
		
		String strValue = "strValue";
		
		MarkScale markScale = new MarkScale();
		markScale.setId(1L);
		
		MarkScaleValue context = new MarkScaleValue();
		
		context.setStrValue(strValue);
		
		context.setMarkScale(markScale);
		
		String expected = "SELECT e FROM MarkScaleValue e WHERE ( e.markScale = :markScale AND e.strValue LIKE CONCAT('%',:strValue,'%') ) ";
		MultiplePagedSearch<MarkScaleValue> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
}
