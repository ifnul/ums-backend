package org.lnu.is.extractor.department.specialty;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.department.specialty.DepartmentSpecialty;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentSpecialtyParametersExtractorTest {

	@Mock
	private Dao<Department, Long> departmentDao;
	
	@Mock
	private Dao<Specialty, Long> specialtyDao;
	
	@InjectMocks
	private DepartmentSpecialtyParametersExtractor unit;

	@Mock
	private SessionService sessionService;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";
	
	private List<String> groups = Arrays.asList(group1, group2);
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
		
		when(sessionService.getGroups()).thenReturn(groups);
	}
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);

		Long specialtyId = 2L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);

		DepartmentSpecialty entity = new DepartmentSpecialty();
		entity.setDepartment(department);
		entity.setSpecialty(specialty);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("department", department);
		expected.put("specialty", specialty);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(specialtyDao.getEntityById(anyLong())).thenReturn(specialty);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(specialtyDao).getEntityById(specialtyId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		DepartmentSpecialty entity = new DepartmentSpecialty();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao, times(0)).getEntityById(anyLong());
		verify(specialtyDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyFieldsAndWithoutDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentSpecialty entity = new DepartmentSpecialty();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao, times(0)).getEntityById(anyLong());
		verify(specialtyDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParamteresWithoutSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);

		Long specialtyId = 2L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);

		DepartmentSpecialty entity = new DepartmentSpecialty();
		entity.setDepartment(department);
		entity.setSpecialty(specialty);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("department", department);
		expected.put("specialty", specialty);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(specialtyDao.getEntityById(anyLong())).thenReturn(specialty);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(specialtyDao).getEntityById(specialtyId);
		verify(sessionService, times(0)).getGroups();
		assertEquals(expected, actual);
	}
}
