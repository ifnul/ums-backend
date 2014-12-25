package org.lnu.is.extractor.benefit;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BenefitParametersExtractorTest {

	@Mock
	private Dao<BenefitType, Long> benefitTypeDao;
	
	@Mock
	private Dao<Benefit, Long> benefitDao;
	
	@InjectMocks
	private BenefitParametersExtractor unit;
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String abbrName = "abbrName";
		Benefit entity = new Benefit();
		entity.setAbbrName(abbrName);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("abbrName", abbrName);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
