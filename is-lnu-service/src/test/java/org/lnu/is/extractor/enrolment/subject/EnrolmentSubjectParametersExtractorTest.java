package org.lnu.is.extractor.enrolment.subject;

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
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentSubjectParametersExtractorTest {

	@Mock
	private Dao<EnrolmentSubject, Long> enrolmentSubjectDao;
	
	@InjectMocks
	private EnrolmentSubjectParametersExtractor unit;
	
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
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
