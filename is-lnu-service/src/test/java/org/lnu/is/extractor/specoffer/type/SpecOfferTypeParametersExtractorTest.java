package org.lnu.is.extractor.specoffer.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpecOfferTypeParametersExtractorTest {

	@Mock
	private Dao<SpecialtyType, Long> specialtyTypeDao;
	
	@InjectMocks
	private SpecOfferTypeParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long specialTypeId = 2L;
		SpecialtyType specialType = new SpecialtyType();
		specialType.setId(specialTypeId);
		String name = "name";
		String abbrName = "abbr name";
		
		SpecOfferType entity = new SpecOfferType();
		entity.setSpecialtyType(specialType);
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("specialtyType", specialType);
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		when(specialtyTypeDao.getEntityById(anyLong())).thenReturn(specialType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		SpecOfferType entity = new SpecOfferType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
