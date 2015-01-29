package org.lnu.is.converter.degree;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.resource.degree.DegreeResource;

public class DegreeConverterTest {

	private DegreeConverter unit = new DegreeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long degreeTypeId = 2L;
		DegreeType degreeType = new DegreeType();
		degreeType.setId(degreeTypeId);
		
		Degree source = new Degree();
		source.setPerson(person);
		source.setDegreeType(degreeType);

		DegreeResource expected = new DegreeResource();
		expected.setPersonId(personId);
		expected.setDegreeTypeId(degreeTypeId);
		
		// When
		DegreeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		Degree source = new Degree();
		DegreeResource expected = new DegreeResource();
		
		// When
		DegreeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Degree source = new Degree();
		List<Degree> sources = Arrays.asList(source);
		DegreeResource expected = new DegreeResource();
		List<DegreeResource> expecteds = Arrays.asList(expected);
		
		// When
		List<DegreeResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertAllWithEmptyCollection() throws Exception {
		// Given
		List<Degree> sources = Collections.emptyList();
		List<DegreeResource> expecteds = Collections.emptyList();
		
		// When
		List<DegreeResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
