package org.lnu.is.converter.person.language;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.resource.person.language.PersonLanguageResource;

public class PersonLanguageResourceConverterTest {

	private PersonLanguageResourceConverter unit = new PersonLanguageResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 6L;
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);
		
		Long languageLevelId = 3L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);

		PersonLanguage expected = new PersonLanguage();
		expected.setId(id);
		expected.setPerson(person);
		expected.setLanguage(language);
		expected.setLanguageLevel(languageLevel);

		PersonLanguageResource source = new PersonLanguageResource();
		source.setPersonId(personId);
		source.setLanguageId(languageId);
		source.setLanguageLevelId(languageLevelId);
		source.setId(id);
		
		// When
		PersonLanguage actual = unit.convert(source);

		// Thena
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonLanguage expected = new PersonLanguage();
		PersonLanguageResource source = new PersonLanguageResource();

		// When
		PersonLanguage actual = unit.convert(source);
		
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
		Language language = new Language();
		language.setId(languageId);
		
		Long languageLevelId = 3L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);
		
		PersonLanguage expected = new PersonLanguage();
		expected.setId(id);
		expected.setPerson(person);
		expected.setLanguage(language);
		expected.setLanguageLevel(languageLevel);
		List<PersonLanguage> expecteds = Arrays.asList(expected);
		
		PersonLanguageResource source = new PersonLanguageResource();
		source.setPersonId(personId);
		source.setLanguageId(languageId);
		source.setLanguageLevelId(languageLevelId);
		source.setId(id);
		List<PersonLanguageResource> sources = Arrays.asList(source);
		
		// When
		List<PersonLanguage> actuals = unit.convertAll(sources);
		
		// Thena
		assertEquals(expecteds, actuals);
	}
}
