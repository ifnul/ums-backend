package org.lnu.is.extractor.person.family;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.family.type.FamilyType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.family.PersonFamily;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonFamilyParametersExtractorTest {

	@Mock
	private SessionService sessionService;

	@Mock
	private Dao<Person, Long> personDao;
	
	@Mock
	private Dao<FamilyType, Long> familyTypeDao;
	
	@InjectMocks
	private PersonFamilyParametersExtractor unit;

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
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long familyTypeId = 2L;
		FamilyType familyType = new FamilyType();
		familyType.setId(familyTypeId);
		
		String name = "name";
		Date birthdate = new Date();

		PersonFamily entity = new PersonFamily();
		entity.setPerson(person);
		entity.setFamilyType(familyType);
		entity.setName(name);
		entity.setBirthDate(birthdate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("familyType", familyType);
		expected.put("name", name);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(familyTypeDao.getEntityById(anyLong())).thenReturn(familyType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(familyTypeDao).getEntityById(familyTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long familyTypeId = 2L;
		FamilyType familyType = new FamilyType();
		familyType.setId(familyTypeId);
		
		String name = "name";
		Date birthdate = new Date();

		PersonFamily entity = new PersonFamily();
		entity.setPerson(person);
		entity.setFamilyType(familyType);
		entity.setName(name);
		entity.setBirthDate(birthdate);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("familyType", familyType);
		expected.put("name", name);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(familyTypeDao.getEntityById(anyLong())).thenReturn(familyType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personDao).getEntityById(personId);
		verify(familyTypeDao).getEntityById(familyTypeId);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonFamily entity = new PersonFamily();
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
		
		PersonFamily entity = new PersonFamily();
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
		
		PersonFamily entity = new PersonFamily();
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
		
		PersonFamily entity = new PersonFamily();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
