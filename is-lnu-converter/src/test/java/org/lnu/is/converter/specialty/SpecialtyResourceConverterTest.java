package org.lnu.is.converter.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.converter.specialty.SpecialtyResourceConverter;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.SpecialtyResource;


public class SpecialtyResourceConverterTest {

	private SpecialtyResourceConverter unit = new SpecialtyResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "name";
		String abbrName = "abbr name";
		Date begDate = new Date();
		Date endDate = new Date();
		String cipher = "cipher";
		Specialty parent = new Specialty();
		parent.setId(1L);
		
		SpecialtyType specialtyType = new SpecialtyType();
		specialtyType.setId(2L);

		Specialty expected = new Specialty();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setCipher(cipher);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setParent(parent);
		expected.setSpecialtyType(specialtyType);

		SpecialtyResource specialtyResource = new SpecialtyResource();
		specialtyResource.setAbbrName(abbrName);
		specialtyResource.setBegDate(begDate);
		specialtyResource.setCipher(cipher);
		specialtyResource.setEndDate(endDate);
		specialtyResource.setName(name);
		specialtyResource.setSpecialtyTypeId(specialtyType.getId());
		specialtyResource.setParentId(parent.getId());
		
		// When
		Specialty actual = unit.convert(specialtyResource);

		// Then
		assertEquals(expected, actual);
	}
}
