package org.lnu.is.converter.enrolmentstatustype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.enrolment.statustype.EnrolmentStatusTypeResourceConverter;
import org.lnu.is.domain.enrolment.statustype.EnrolmentStatusType;
import org.lnu.is.resource.enrolment.statustype.EnrolmentStatusTypeResource;

public class EnrolmentStatusTypeResourceConverterTest {

	private EnrolmentStatusTypeResourceConverter unit = new EnrolmentStatusTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";
		String description = "first death";

		EnrolmentStatusTypeResource source = new EnrolmentStatusTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);
		source.setDescription(description);

		EnrolmentStatusType expected = new EnrolmentStatusType();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		expected.setDescription(description);

		// When
		EnrolmentStatusType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		String description = "descrip tion";
		
		EnrolmentStatusTypeResource source = new EnrolmentStatusTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		source.setDescription(description);
		
		List<EnrolmentStatusTypeResource> sources = Arrays.asList(source); 
		
		EnrolmentStatusType expected = new EnrolmentStatusType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		expected.setDescription(description);
		
		List<EnrolmentStatusType> expecteds = Arrays.asList(expected);
		
		// Where
		List<EnrolmentStatusType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
