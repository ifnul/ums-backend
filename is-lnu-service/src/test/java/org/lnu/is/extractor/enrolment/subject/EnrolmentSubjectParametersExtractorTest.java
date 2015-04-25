package org.lnu.is.extractor.enrolment.subject;

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
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentSubjectParametersExtractorTest {

	@Mock
	private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;
	
	@InjectMocks
	private EnrolmentSubjectParametersExtractor unit;

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
		Long parentId = 1L;
		EnrolmentSubject parent = new EnrolmentSubject();
		parent.setId(parentId);
		
		String abbrName = "abbr name";
		String name = "name1";
		Integer isTesting = 1;

		EnrolmentSubject entity = new EnrolmentSubject();
		entity.setParent(parent);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setIsTesting(isTesting);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("parent", parent);
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("isTesting", isTesting);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(parent);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(enrolmentSubjectDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long parentId = 1L;
		EnrolmentSubject parent = new EnrolmentSubject();
		parent.setId(parentId);
		
		String abbrName = "abbr name";
		String name = "name1";
		Integer isTesting = 1;
		
		EnrolmentSubject entity = new EnrolmentSubject();
		entity.setParent(parent);
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setIsTesting(isTesting);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("parent", parent);
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("isTesting", isTesting);
		
		// When
		when(enrolmentSubjectDao.getEntityById(anyLong())).thenReturn(parent);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(enrolmentSubjectDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		EnrolmentSubject entity = new EnrolmentSubject();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		EnrolmentSubject entity = new EnrolmentSubject();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDIsabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		EnrolmentSubject entity = new EnrolmentSubject();
		Map<String, Object> expected = new HashMap<String, Object>();
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
		
		EnrolmentSubject entity = new EnrolmentSubject();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
