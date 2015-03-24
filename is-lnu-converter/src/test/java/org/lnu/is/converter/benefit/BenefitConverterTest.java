package org.lnu.is.converter.benefit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String abbrName = "fdsf";
		Date begDate = new Date();
		Date endDate = new Date();
		String description = "descriptipp";
		
		Benefit source = new Benefit();
		source.setAbbrName(abbrName);
		source.setBegDate(begDate);
		source.setDescription(description);
		source.setEndDate(endDate);
		source.setName(source.getName());
		
		BenefitResource expected = new BenefitResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setDescription(description);
		expected.setEndDate(endDate);
		expected.setName(source.getName());
		
		// When
		BenefitResource actual = unit.convert(source);
		
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
		
		String abbrName1 = "fdsf";
		Date begDate1 = new Date();
		Date endDate1 = new Date();
		String description1 = "descriptipp";
		
		Benefit source1 = new Benefit();
		source1.setAbbrName(abbrName1);
		source1.setBegDate(begDate1);
		source1.setDescription(description1);
		source1.setEndDate(endDate1);
		source1.setName(source1.getName());
		
		BenefitResource expected1 = new BenefitResource();
		expected1.setAbbrName(abbrName1);
		expected1.setBegDate(begDate1);
		expected1.setDescription(description1);
		expected1.setEndDate(endDate1);
		expected1.setName(source1.getName());

		List<Benefit> sources = Arrays.asList(source,source1);
		
		List<BenefitResource> expecteds = Arrays.asList(expected,expected1);
	
		// When
		List<BenefitResource> actuals = unit.convertAll(sources);

		// Then
		assertEquals(expecteds, actuals);
	
	}

}
