package org.lnu.is.facade.converter.specialty;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.lnu.is.resource.specialty.SpecialtyResource;

public class SpecialtyConverterTest {

	private SpecialtyConverter unit = new SpecialtyConverter();
	
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

		Specialty specialty = new Specialty();
		specialty.setAbbrName(abbrName);
		specialty.setBegDate(begDate);
		specialty.setCipher(cipher);
		specialty.setEndDate(endDate);
		specialty.setName(name);
		specialty.setParent(parent);
		specialty.setSpecialtyType(specialtyType);

		SpecialtyResource expected = new SpecialtyResource();
		expected.setAbbrName(abbrName);
		expected.setBegDate(begDate);
		expected.setCipher(cipher);
		expected.setEndDate(endDate);
		expected.setName(name);
		expected.setSpecialtyTypeId(specialtyType.getId());
		expected.setParentId(parent.getId());
		
		// When
		SpecialtyResource actual = unit.convert(specialty);

		// Then
		assertEquals(expected, actual);
	}
}
