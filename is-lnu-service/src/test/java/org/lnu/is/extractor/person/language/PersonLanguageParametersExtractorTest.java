package org.lnu.is.extractor.person.language;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.language.language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonLanguageParametersExtractorTest {

	@Mock
	private SessionService sessionService;

	@Mock
	private Dao<Person, Person, Long> personDao;

	@Mock
	private Dao<language, language, Long> languageDao;
	
	@Mock
	private Dao<LanguageLevel, LanguageLevel, Long> languageLevelDao;	
	
	@InjectMocks
	private PersonLanguageParametersExtractor unit;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";
	
	private List<String> groups = Arrays.asList(group1, group2);
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
		
		when(sessionService.getGroups()).thenReturn(groups);
	}
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 3L;
		language language = new language();
		language.setId(languageId);
		
		Long languageLevelId = 1L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);

		PersonLanguage entity = new PersonLanguage();
		entity.setPerson(person);
		entity.setLanguage(language);
		entity.setLanguageLevel(languageLevel);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("language", language);
		expected.put("languageLevel", languageLevel);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(languageDao.getEntityById(anyLong())).thenReturn(language);
		when(languageLevelDao.getEntityById(anyLong())).thenReturn(languageLevel);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long languageId = 3L;
		language language = new language();
		language.setId(languageId);
		
		Long languageLevelId = 1L;
		LanguageLevel languageLevel = new LanguageLevel();
		languageLevel.setId(languageLevelId);

		PersonLanguage entity = new PersonLanguage();
		entity.setPerson(person);
		entity.setLanguage(language);
		entity.setLanguageLevel(languageLevel);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("language", language);
		expected.put("languageLevel", languageLevel);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(languageDao.getEntityById(anyLong())).thenReturn(language);
		when(languageLevelDao.getEntityById(anyLong())).thenReturn(languageLevel);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonLanguage entity = new PersonLanguage();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		PersonLanguage entity = new PersonLanguage();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDIsabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		PersonLanguage entity = new PersonLanguage();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PersonLanguage entity = new PersonLanguage();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
