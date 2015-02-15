package org.lnu.is.dao.builder.studyplan.cycle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;

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
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecuirtyConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStautsConstaint() throws Exception {
		// Given
		unit.setActive(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e WHERE e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstaitns() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		StudyPlanCycle context = new StudyPlanCycle();
		
		String expected = "SELECT e FROM StudyPlanCycle e ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
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
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
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
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
