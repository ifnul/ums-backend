package org.lnu.is.facade.converter.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.BenefitResource;

public class BenefitConverterTest {

	private BenefitConverter unit = new BenefitConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long parentId = 1L;
		Long benefitTypeId = 2L;
		String abbrName = "fdsf";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "descriptipp";
		
		Benefit source = new Benefit();
		source.setAbbrName(abbrName);
		BenefitType benefitType = new BenefitType();
		benefitType.setId(benefitTypeId);
		source.setBenefitType(benefitType);
		source.setBegDate(begDate);
		source.setDescription(description);
		source.setEndDate(endDate);
		source.setName(source.getName());
		Benefit parent = new Benefit();
		parent.setId(parentId);
		source.setParent(parent);
		
		BenefitResource expected = new BenefitResource();
		expected.setAbbrName(abbrName);
		expected.setBenefitTypeId(benefitTypeId);
		expected.setBegDate(begDate);
		expected.setDescription(description);
		expected.setEndDate(endDate);
		expected.setName(source.getName());
		expected.setParentId(parentId);
		
		// When
		BenefitResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
