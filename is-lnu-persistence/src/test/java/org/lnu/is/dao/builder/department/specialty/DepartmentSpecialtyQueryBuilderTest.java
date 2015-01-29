package org.lnu.is.dao.builder.department.specialty;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;

public class DepartmentSpecialtyQueryBuilderTest {

	private DepartmentSpecialtyQueryBuilder unit = new DepartmentSpecialtyQueryBuilder();
	
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
		DepartmentSpecialty context = new DepartmentSpecialty();

		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		
		Department department = new Department();
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department OR e.specialty = :specialty ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		Specialty specialty = new Specialty();
		
		DepartmentSpecialty context = new DepartmentSpecialty();
		context.setDepartment(department);
		context.setSpecialty(specialty);
		
		String expectedQuery = "SELECT e FROM DepartmentSpecialty e WHERE ( e.department = :department OR e.specialty = :specialty ) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
