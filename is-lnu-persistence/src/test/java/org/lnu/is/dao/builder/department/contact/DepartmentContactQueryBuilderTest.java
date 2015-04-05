package org.lnu.is.dao.builder.department.contact;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.pagination.MultiplePagedSearch;

public class DepartmentContactQueryBuilderTest {

	private DepartmentContactQueryBuilder unit = new DepartmentContactQueryBuilder();
	
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
		DepartmentContact context = new DepartmentContact();

		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.status=:status ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
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
		
		DepartmentContact context = new DepartmentContact();
		
		String expectedQuery = "SELECT e FROM DepartmentContact e ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Department department = new Department();
		ContactType addressType = new ContactType();
		String value = "fasd";
		
		DepartmentContact context = new DepartmentContact();
		context.setDepartment(department);
		context.setContactType(addressType);
		context.setValue(value);
		
		String expectedQuery = "SELECT e FROM DepartmentContact e WHERE ( e.department = :department AND e.contactType = :addressType AND e.value LIKE CONCAT('%',:value,'%') ) ";
		MultiplePagedSearch<DepartmentContact> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
