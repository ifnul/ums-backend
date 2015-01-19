package org.lnu.is.extractor.paper.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.paperusage.PaperUsage;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PaperTypeParametersExtractorTest {

	@Mock
	private Dao<PaperUsage, Long> paperUsageDao;
	
	@InjectMocks
	private PaperTypeParametersExtractor unit = new PaperTypeParametersExtractor();

	@Test
	public void testGetParameters() throws Exception {
		// Given
		PaperUsage paperUsage = new PaperUsage();
		PaperType entity = new PaperType();
		String name = "first blood";
		String abbrName = "fb";

		entity.setName(name);
		entity.setAbbrName(abbrName);
		entity.setPaperUsage(paperUsage);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("paperUsage", paperUsage);
		expected.put("status", RowStatus.ACTIVE);
		// When
		when(paperUsageDao.getEntityById(anyLong())).thenReturn(paperUsage);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PaperType entity = new PaperType();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
