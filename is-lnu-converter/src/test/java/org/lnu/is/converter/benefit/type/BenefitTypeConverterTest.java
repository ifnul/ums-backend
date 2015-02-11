package org.lnu.is.converter.benefit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;

public class BenefitTypeConverterTest {

	private BenefitTypeConverter unit = new BenefitTypeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer priority = 1;
		String name = "name";
		BenefitType source = new BenefitType();
		source.setName(name);
		source.setPriority(priority);

		BenefitTypeResource expected = new BenefitTypeResource();
		expected.setName(name);
		expected.setPriority(priority);
		
		// When
		BenefitTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		BenefitType source = new BenefitType();
		source.setId(id);		
		source.setName(name);
		
		List<BenefitType> sources = Arrays.asList(source); 
		
		BenefitTypeResource expected = new BenefitTypeResource();
		expected.setId(id);
		expected.setName(name);
		
		List<BenefitTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<BenefitTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
