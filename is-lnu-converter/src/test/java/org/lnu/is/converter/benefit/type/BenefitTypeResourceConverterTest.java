package org.lnu.is.converter.benefit.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;

public class BenefitTypeResourceConverterTest {

	private BenefitTypeResourceConverter unit = new BenefitTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		BenefitType expected = new BenefitType();
		expected.setName(name);
		
		BenefitTypeResource source = new BenefitTypeResource();
		source.setId(id);
		source.setName(name);
		
		// When
		BenefitType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String name = "n a m e";
		
		BenefitTypeResource source = new BenefitTypeResource();
		source.setId(id);
		source.setName(name);
		
		List<BenefitTypeResource> sources = Arrays.asList(source); 
		
		BenefitType expected = new BenefitType();
		expected.setId(id);
		expected.setName(name);
		
		List<BenefitType> expecteds = Arrays.asList(expected);
		
		// Where
		List<BenefitType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
