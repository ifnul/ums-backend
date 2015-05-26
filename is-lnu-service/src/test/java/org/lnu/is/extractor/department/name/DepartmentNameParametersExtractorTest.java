package org.lnu.is.extractor.department.name;

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
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.language.Language;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DepartmentNameParametersExtractorTest {

	@Mock
	private Dao<Department, Long> departmentDao;
	
	@Mock
	private Dao<Language, Long> languageDao;
	
	@InjectMocks
	private DepartmentNameParametersExtractor unit;

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

		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);

		String abbrName = "abbr name";
		String name = "name";

		DepartmentName entity = new DepartmentName();
		entity.setDepartment(department);
		entity.setLanguage(language);
		entity.setAbbrName(abbrName);
		entity.setName(name);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("department", department);
		expected.put("language", language);
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(languageDao.getEntityById(anyLong())).thenReturn(language);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(languageDao).getEntityById(languageId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		DepartmentName entity = new DepartmentName();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao, times(0)).getEntityById(anyLong());
		verify(languageDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithEmptyFieldsAndWithoutDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		DepartmentName entity = new DepartmentName();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao, times(0)).getEntityById(anyLong());
		verify(languageDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParamteresWithoutSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Long departmentId = 1L;
		Department department = new Department();
		department.setId(departmentId);

		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);

		String abbrName = "abbr name";
		String name = "name";

		DepartmentName entity = new DepartmentName();
		entity.setDepartment(department);
		entity.setLanguage(language);
		entity.setAbbrName(abbrName);
		entity.setName(name);

		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("department", department);
		expected.put("language", language);
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(languageDao.getEntityById(anyLong())).thenReturn(language);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(departmentDao).getEntityById(departmentId);
		verify(languageDao).getEntityById(languageId);
		verify(sessionService, times(0)).getGroups();
		assertEquals(expected, actual);
	}
}
