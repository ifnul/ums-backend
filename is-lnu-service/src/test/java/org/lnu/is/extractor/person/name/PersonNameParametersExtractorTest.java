package org.lnu.is.extractor.person.name;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonNameParametersExtractorTest {

	@Mock
	private Dao<Language, Long> languageDao;
	
	@Mock
	private Dao<Person, Long> personDao;
	
	@InjectMocks
	private PersonNameParametersExtractor unit = new PersonNameParametersExtractor();
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 2L;
		Language language = new Language();
		language.setId(languageId);

		String firstName = "first name";
		String fatherName = "father name";
		PersonName entity = new PersonName();
		entity.setPerson(person);
		entity.setLanguage(language);
		entity.setFirstName(firstName);
		entity.setFatherName(fatherName);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("language", language);
		expected.put("firstName", firstName);
		expected.put("fatherName", fatherName);
		
		// When
		when(languageDao.findById(anyLong())).thenReturn(language);
		when(personDao.findById(anyLong())).thenReturn(person);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(languageDao).findById(languageId);
		verify(personDao).findById(personId);
		assertEquals(expected, actual);
	}
}
