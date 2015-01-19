package org.lnu.is.extractor.specialty;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecialtyParametersExtractorTest {

	@Mock
	private Dao<SpecialtyType, Long> specialtyTypeDao;
	
	@Mock
	private Dao<Specialty, Long> specialtyDao;
	
	@InjectMocks
	private SpecialtyParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Specialty entity = new Specialty();
		
		Long specialtyTypeId = 1L;
		SpecialtyType specialtyType = new SpecialtyType();
		specialtyType.setId(specialtyTypeId);
		
		Long parentId = 2L;
		Specialty parent = new Specialty();
		parent.setId(parentId);
		
		String abbrName = "abbr name";
		String name = "name1";
		String cipher = "cipher1";
		Date begDate = new Date();
		Date endDate = new Date();

		entity.setSpecialtyType(specialtyType);
		entity.setParent(parent);
		
		entity.setAbbrName(abbrName);
		entity.setName(name);
		entity.setCipher(cipher);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("specialtyType", specialtyType);
		expected.put("parent", parent);
		expected.put("abbrName", abbrName);
		expected.put("name", name);
		expected.put("cipher", cipher);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("status", RowStatus.ACTIVE);

		// When
		when(specialtyTypeDao.getEntityById(anyLong())).thenReturn(specialtyType);
		when(specialtyDao.getEntityById(anyLong())).thenReturn(parent);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(specialtyTypeDao).getEntityById(specialtyTypeId);
		verify(specialtyDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Specialty entity = new Specialty();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
