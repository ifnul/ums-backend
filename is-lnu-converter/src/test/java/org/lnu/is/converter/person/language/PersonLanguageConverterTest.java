package org.lnu.is.converter.person.language;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.language.language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.resource.person.language.PersonLanguageResource;

public class PersonLanguageConverterTest {

	private PersonLanguageConverter unit = new PersonLanguageConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 6L;
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 2L;
		language language = new language();
		language.setId(languageId);
		
		Long languageLevelId = 3L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);

		PersonLanguage source = new PersonLanguage();
		source.setId(id);
		source.setPerson(person);
		source.setLanguage(language);
		source.setLanguageLevel(languageLevel);

		PersonLanguageResource expected = new PersonLanguageResource();
		expected.setPersonId(personId);
		expected.setLanguageId(languageId);
		expected.setLanguageLevelId(languageLevelId);
		expected.setId(id);
		
		// When
		PersonLanguageResource actual = unit.convert(source);

		// Thena
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonLanguage source = new PersonLanguage();
		PersonLanguageResource expected = new PersonLanguageResource();

		// When
		PersonLanguageResource actual = unit.convert(source);
		
		// Thena
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 6L;
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 2L;
		language language = new language();
		language.setId(languageId);
		
		Long languageLevelId = 3L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);
		
		PersonLanguage source = new PersonLanguage();
		source.setId(id);
		source.setPerson(person);
		source.setLanguage(language);
		source.setLanguageLevel(languageLevel);
		List<PersonLanguage> sources = Arrays.asList(source);
		
		PersonLanguageResource expected = new PersonLanguageResource();
		expected.setPersonId(personId);
		expected.setLanguageId(languageId);
		expected.setLanguageLevelId(languageLevelId);
		expected.setId(id);
		List<PersonLanguageResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PersonLanguageResource> actuals = unit.convertAll(sources);
		
		// Thena
		assertEquals(expecteds, actuals);
	}
}
