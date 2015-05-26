package org.lnu.is.converter.studyplan.cycle;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.studyplan.cycle.StudyPlanCycle;
import org.lnu.is.resource.studyplan.cycle.StudyPlanCycleResource;

public class StudyPlanCycleConverterTest {

	private StudyPlanCycleConverter unit = new StudyPlanCycleConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrName";
		
		StudyPlanCycle source = new StudyPlanCycle();
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setId(id);

		StudyPlanCycleResource expected = new StudyPlanCycleResource();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setId(id);
		
		// When
		StudyPlanCycleResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		StudyPlanCycle source = new StudyPlanCycle();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<StudyPlanCycle> sources = Arrays.asList(source); 
		
		StudyPlanCycleResource expected = new StudyPlanCycleResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<StudyPlanCycleResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<StudyPlanCycleResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
