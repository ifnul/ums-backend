package org.lnu.is.dao.builder.markscale;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;

public class MarkscaleQueryBuilderTest {

	private MarkscaleQueryBuilder unit = new MarkscaleQueryBuilder();
	
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
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.status=:status ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Markscale context = new Markscale();
		
		String expected = "SELECT e FROM Markscale e ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrName";
		String name = "name";
		Double markMin = 0.0;
		Double markMax = 10.0;
		
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(1L);
		
		Markscale context = new Markscale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkscaleType(markscaleType);

		String expected = "SELECT e FROM Markscale e WHERE ( e.markscaleType = :markscaleType OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.markMin = :markMin OR e.markMax = :markMax ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
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
		
		MarkscaleType markscaleType = new MarkscaleType();
		markscaleType.setId(1L);
		
		Markscale context = new Markscale();
		
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setMarkMin(markMin);
		context.setMarkMax(markMax);
		
		context.setMarkscaleType(markscaleType);
		
		String expected = "SELECT e FROM Markscale e WHERE ( e.markscaleType = :markscaleType OR e.abbrName LIKE CONCAT('%',:abbrName,'%') OR e.name LIKE CONCAT('%',:name,'%') OR e.markMin = :markMin OR e.markMax = :markMax ) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
