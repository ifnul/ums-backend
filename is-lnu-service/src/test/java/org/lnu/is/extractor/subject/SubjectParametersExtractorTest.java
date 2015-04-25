package org.lnu.is.extractor.subject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
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
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SubjectParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<SubjectType, SubjectType, Long> subjectTypeDao;
	
	@InjectMocks
	private SubjectParametersExtractor unit;

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
		Long subjectTypeId = 2L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		String name = "name";
		Subject entity = new Subject();
		entity.setName(name);
		entity.setSubjectType(subjectType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("subjectType", subjectType);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(subjectTypeDao.getEntityById(anyLong())).thenReturn(subjectType);
		
		Map<String, Object> actualParameters = unit.getParameters(entity);

		// Then
		verify(subjectTypeDao).getEntityById(subjectTypeId);
		assertEquals(expected, actualParameters);
	}
	
	@Test
	public void testGetParametersWithDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Long subjectTypeId = 2L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		String name = "name";
		Subject entity = new Subject();
		entity.setName(name);
		entity.setSubjectType(subjectType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("subjectType", subjectType);
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		when(subjectTypeDao.getEntityById(anyLong())).thenReturn(subjectType);
		
		Map<String, Object> actualParameters = unit.getParameters(entity);
		
		// Then
		verify(subjectTypeDao).getEntityById(subjectTypeId);
		assertEquals(expected, actualParameters);
	}
	
	@Test
	public void testGetParametersWithDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		Long subjectTypeId = 2L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		String name = "name";
		Subject entity = new Subject();
		entity.setName(name);
		entity.setSubjectType(subjectType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("subjectType", subjectType);
		expected.put("userGroups", groups);
		
		// When
		when(subjectTypeDao.getEntityById(anyLong())).thenReturn(subjectType);
		
		Map<String, Object> actualParameters = unit.getParameters(entity);
		
		// Then
		verify(subjectTypeDao).getEntityById(subjectTypeId);
		assertEquals(expected, actualParameters);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long subjectTypeId = 2L;
		SubjectType subjectType = new SubjectType();
		subjectType.setId(subjectTypeId);
		
		String name = "name";
		Subject entity = new Subject();
		entity.setName(name);
		entity.setSubjectType(subjectType);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("subjectType", subjectType);
		
		// When
		when(subjectTypeDao.getEntityById(anyLong())).thenReturn(subjectType);
		
		Map<String, Object> actualParameters = unit.getParameters(entity);
		
		// Then
		verify(subjectTypeDao).getEntityById(subjectTypeId);
		assertEquals(expected, actualParameters);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Subject entity = new Subject();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Subject entity = new Subject();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
