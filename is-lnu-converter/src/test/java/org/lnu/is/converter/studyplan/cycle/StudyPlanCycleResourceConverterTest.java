package org.lnu.is.converter.studyplan.cycle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;

public class StudyPlanCycleResourceConverterTest {

	private StudyPlanCycleResourceConverter unit = new StudyPlanCycleResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		StudyPlanCycleResource source = new StudyPlanCycleResource();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		StudyPlanCycle expected = new StudyPlanCycle();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		// When
		StudyPlanCycle actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		StudyPlanCycleResource source = new StudyPlanCycleResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<StudyPlanCycleResource> sources = Arrays.asList(source); 
		
		StudyPlanCycle expected = new StudyPlanCycle();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<StudyPlanCycle> expecteds = Arrays.asList(expected);
		
		// Where
		List<StudyPlanCycle> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
