package org.lnu.is.converter.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.BenefitResource;

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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "fdsf";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "descriptipp";
		String name = "name";
		
		Benefit expected = new Benefit();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setDescription(description);
		expected.setEndDate(endDate);
		expected.setName(name);
		
		BenefitResource source = new BenefitResource();
		source.setAbbrName(abbrName);
		source.setBegDate(begDate);
		source.setDescription(description);
		source.setEndDate(endDate);
		source.setName(name);
		
		// When
		Benefit actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
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
		
		String abbrName1 = "fdsf";
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		String description1 = "descriptipp";
		String name1 = "name";
		
		Benefit expected1 = new Benefit();
		expected1.setAbbrName(abbrName1);
		expected1.setBegDate(begDate1);
		expected1.setDescription(description1);
		expected1.setEndDate(endDate1);
		expected1.setName(name1);
		
		BenefitResource source1 = new BenefitResource();
		source1.setAbbrName(abbrName1);
		source1.setBegDate(begDate1);
		source1.setDescription(description1);
		source1.setEndDate(endDate1);
		source1.setName(name1);
		
		List<BenefitResource> sources = Arrays.asList(source,source1);
		
		List<Benefit> expecteds = Arrays.asList(expected,expected1);
		// When
		List<Benefit> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

}
