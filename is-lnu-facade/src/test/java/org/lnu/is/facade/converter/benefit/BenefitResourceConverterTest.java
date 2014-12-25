package org.lnu.is.facade.converter.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.facade.resource.benefit.BenefitResource;

public class BenefitResourceConverterTest {

	private BenefitResourceConverter unit = new BenefitResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long parentId = 1L;
		Long benefitTypeId = 2L;
		String abbrName = "fdsf";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "descriptipp";
		String name = "name";
		
		BenefitType benefitType = new BenefitType();
		benefitType.setId(benefitTypeId);

		Benefit parent = new Benefit();
		parent.setId(parentId);

		Benefit expected = new Benefit();
		expected.setAbbrName(abbrName);
		expected.setBenefitType(benefitType);
		expected.setBegDate(begDate);
		expected.setDescription(description);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setParent(parent);
		
		BenefitResource source = new BenefitResource();
		source.setAbbrName(abbrName);
		source.setBenefitTypeId(benefitTypeId);
		source.setBegDate(begDate);
		source.setDescription(description);
		source.setEndDate(endDate);
		source.setName(name);
		source.setParentId(parentId);
		
		// When
		Benefit actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
