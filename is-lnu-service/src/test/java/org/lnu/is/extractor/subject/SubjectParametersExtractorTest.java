package org.lnu.is.extractor.subject;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SubjectParametersExtractorTest {

	@Mock
	private Dao<SubjectType, Long> subjectTypeDao;
	
	@InjectMocks
	private SubjectParametersExtractor unit;
	
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
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
