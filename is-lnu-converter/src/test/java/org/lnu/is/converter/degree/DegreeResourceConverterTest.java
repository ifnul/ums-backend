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

public class DegreeResourceConverterTest {

	private DegreeResourceConverter unit = new DegreeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long personId = 1L;
		Long degreeTypeId = 2L;
		DegreeResource source = new DegreeResource();
		source.setPersonId(personId);
		source.setDegreeTypeId(degreeTypeId);
		
		Person person = new Person();
		person.setId(personId);
		DegreeType degreeType = new DegreeType();
		degreeType.setId(degreeTypeId);
		
		Degree expected = new Degree();
		expected.setPerson(person);
		expected.setDegreeType(degreeType);
		
		
		// When
		Degree actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		DegreeResource source = new DegreeResource();
		Degree expected = new Degree();
		
		// When
		Degree actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Degree expected = new Degree();
		List<Degree> expecteds = Arrays.asList(expected);
		DegreeResource source = new DegreeResource();
		List<DegreeResource> sources = Arrays.asList(source);
		
		// When
		List<Degree> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertAllWithEmptyCollection() throws Exception {
		// Given
		List<Degree> expecteds = Collections.emptyList();
		List<DegreeResource> sources = Collections.emptyList();
		
		// When
		List<Degree> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
