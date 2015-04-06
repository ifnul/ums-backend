package org.lnu.is.converter.salary.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.salary.type.SalaryTypeConverter;
import org.lnu.is.domain.salary.type.SalaryType;
import org.lnu.is.resource.salary.type.SalaryTypeResource;

public class SalaryTypeConverterTest {

	private SalaryTypeConverter unit = new SalaryTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "first blood";
		String abbrName = "fb";

		
		SalaryType source = new SalaryType();
		source.setName(name);
		source.setAbbrName(abbrName);

		SalaryTypeResource expected = new SalaryTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);
		
		// When
		SalaryTypeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		SalaryType source = new SalaryType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<SalaryType> sources = Arrays.asList(source); 
		
		SalaryTypeResource expected = new SalaryTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<SalaryTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<SalaryTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
