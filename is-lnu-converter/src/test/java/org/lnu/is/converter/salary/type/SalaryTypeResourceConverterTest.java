package org.lnu.is.converter.salary.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.salary.type.SalaryTypeResourceConverter;
import org.lnu.is.domain.salary.type.SalaryType;
import org.lnu.is.resource.salary.type.SalaryTypeResource;

public class SalaryTypeResourceConverterTest {

	private SalaryTypeResourceConverter unit = new SalaryTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		SalaryType expected = new SalaryType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		SalaryTypeResource source = new SalaryTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		SalaryType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SalaryTypeResource source = new SalaryTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SalaryTypeResource> sources = Arrays.asList(source); 
		
		SalaryType expected = new SalaryType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SalaryType> expecteds = Arrays.asList(expected);
		
		// Where
		List<SalaryType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}

}
