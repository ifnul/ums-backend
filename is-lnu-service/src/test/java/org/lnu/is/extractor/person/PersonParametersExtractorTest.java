package org.lnu.is.extractor.person;

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
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<PersonType, PersonType, Long> personTypeDao;
	
	@Mock
	private Dao<GenderType, GenderType, Long> genderTypeDao;

	@Mock
	private Dao<MarriedType, MarriedType, Long> marrieTypeDao;

	@Mock
	private Dao<Person, Person, Long> personDao;
	
	@InjectMocks
	private PersonParametersExtractor unit;

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
		Long personTypeId = 4L;
		PersonType personType = new PersonType();
		personType.setId(personTypeId);
		
		Long genderTypeId = 3L;
		GenderType genderType = new GenderType();
		genderType.setId(genderTypeId);

		Long marriedTypeId = 2L;
		MarriedType marriedType = new MarriedType();
		marriedType.setId(marriedTypeId);
		
		Long parentId = 1L;
		Person parent = new Person();
		parent.setId(parentId);

		String name = "name1";
		String firstName = "firstnae1";
		String fatherName = "fathername";
		String surname = "surname";
		String photo = "photo";
		String docSeries = "docSeries";
		String docNum = "docnum";
		String identifier = "identifier";
		Integer resident = 1;
		String birthPlace = "Lviv";
		Date begDate = new Date();
		Date endDate = new Date();
		Integer isMilitary = 1;
		Integer isHostel = 2;

		PersonList entity = new PersonList();
		/*entity.setPersonType(Arrays.asList(personType));
		entity.setGenderType(Arrays.asList(genderType));
		entity.setMarriedType(Arrays.asList(marriedType));
		entity.setParent(Arrays.asList(parent));*/
		
		entity.setName(Arrays.asList(name));
		entity.setFirstName(Arrays.asList(firstName));
		entity.setFatherName(Arrays.asList(fatherName));
		entity.setSurname(Arrays.asList(surname));
		entity.setPhoto(Arrays.asList(photo));
		entity.setDocSeries(Arrays.asList(docSeries));
		entity.setDocNum(Arrays.asList(docNum));
		entity.setIdentifier(Arrays.asList(identifier));
		entity.setResident(Arrays.asList(resident));
		entity.setBirthPlace(Arrays.asList(birthPlace));
		entity.setBegDate(Arrays.asList(begDate));
		entity.setEndDate(Arrays.asList(endDate));
		entity.setIsMilitary(Arrays.asList(isMilitary));
		entity.setIsHostel(Arrays.asList(isHostel));

		Map<String, Object> expected = new HashMap<String, Object>();
		/*expected.put("personType", Arrays.asList(personType));
		expected.put("genderType", Arrays.asList(genderType));
		expected.put("marriedType", Arrays.asList(marriedType));
		expected.put("parent", Arrays.asList(parent));*/
		expected.put("name", Arrays.asList(name));
		expected.put("firstName", Arrays.asList(firstName));
		expected.put("fatherName", Arrays.asList(fatherName));
		expected.put("surname", Arrays.asList(surname));
		expected.put("photo", Arrays.asList(photo));
		expected.put("docSeries", Arrays.asList(docSeries));
		expected.put("docNum", Arrays.asList(docNum));
		expected.put("identifier", Arrays.asList(identifier));
		expected.put("resident", Arrays.asList(resident));
		expected.put("birthPlace", Arrays.asList(birthPlace));
		expected.put("begDate", Arrays.asList(begDate));
		expected.put("endDate", Arrays.asList(endDate));
		expected.put("isMilitary", Arrays.asList(isMilitary));
		expected.put("isHostel", Arrays.asList(isHostel));
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		/*when(personTypeDao.getEntityById(anyLong())).thenReturn(personType);
		when(genderTypeDao.getEntityById(anyLong())).thenReturn(genderType);
		when(marrieTypeDao.getEntityById(anyLong())).thenReturn(marriedType);
		when(personDao.getEntityById(anyLong())).thenReturn(parent);*/
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		/*verify(personTypeDao).getEntityById(personTypeId);
		verify(genderTypeDao).getEntityById(genderTypeId);
		verify(marrieTypeDao).getEntityById(marriedTypeId);
		verify(personDao).getEntityById(parentId);*/
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personTypeId = 4L;
		PersonType personType = new PersonType();
		personType.setId(personTypeId);
		
		Long genderTypeId = 3L;
		GenderType genderType = new GenderType();
		genderType.setId(genderTypeId);
		
		Long marriedTypeId = 2L;
		MarriedType marriedType = new MarriedType();
		marriedType.setId(marriedTypeId);
		
		Long parentId = 1L;
		Person parent = new Person();
		parent.setId(parentId);
		
		String name = "name1";
		String firstName = "firstnae1";
		String fatherName = "fathername";
		String surname = "surname";
		String photo = "photo";
		String docSeries = "docSeries";
		String docNum = "docnum";
		String identifier = "identifier";
		Integer resident = 1;
		String birthPlace = "Lviv";
		Date begDate = new Date();
		Date endDate = new Date();
		Integer isMilitary = 1;
		Integer isHostel = 2;
		
		PersonList entity = new PersonList();
		/*entity.setPersonType(Arrays.asList(personType));
		entity.setGenderType(Arrays.asList(genderType));
		entity.setMarriedType(Arrays.asList(marriedType));
		entity.setParent(Arrays.asList(parent));*/
		
		entity.setName(Arrays.asList(name));
		entity.setFirstName(Arrays.asList(firstName));
		entity.setFatherName(Arrays.asList(fatherName));
		entity.setSurname(Arrays.asList(surname));
		entity.setPhoto(Arrays.asList(photo));
		entity.setDocSeries(Arrays.asList(docSeries));
		entity.setDocNum(Arrays.asList(docNum));
		entity.setIdentifier(Arrays.asList(identifier));
		entity.setResident(Arrays.asList(resident));
		entity.setBirthPlace(Arrays.asList(birthPlace));
		entity.setBegDate(Arrays.asList(begDate));
		entity.setEndDate(Arrays.asList(endDate));
		entity.setIsMilitary(Arrays.asList(isMilitary));
		entity.setIsHostel(Arrays.asList(isHostel));
		
		Map<String, Object> expected = new HashMap<String, Object>();
		/*expected.put("personType", Arrays.asList(personType));
		expected.put("genderType", Arrays.asList(genderType));
		expected.put("marriedType", Arrays.asList(marriedType));
		expected.put("parent", Arrays.asList(parent));*/
		expected.put("name", Arrays.asList(name));
		expected.put("firstName", Arrays.asList(firstName));
		expected.put("fatherName", Arrays.asList(fatherName));
		expected.put("surname", Arrays.asList(surname));
		expected.put("photo", Arrays.asList(photo));
		expected.put("docSeries", Arrays.asList(docSeries));
		expected.put("docNum", Arrays.asList(docNum));
		expected.put("identifier", Arrays.asList(identifier));
		expected.put("resident", Arrays.asList(resident));
		expected.put("birthPlace", Arrays.asList(birthPlace));
		expected.put("begDate", Arrays.asList(begDate));
		expected.put("endDate", Arrays.asList(endDate));
		expected.put("isMilitary", Arrays.asList(isMilitary));
		expected.put("isHostel", Arrays.asList(isHostel));
		
		// When
		/*when(personTypeDao.getEntityById(anyLong())).thenReturn(personType);
		when(genderTypeDao.getEntityById(anyLong())).thenReturn(genderType);
		when(marrieTypeDao.getEntityById(anyLong())).thenReturn(marriedType);
		when(personDao.getEntityById(anyLong())).thenReturn(parent);*/
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		/*verify(personTypeDao).getEntityById(personTypeId);
		verify(genderTypeDao).getEntityById(genderTypeId);
		verify(marrieTypeDao).getEntityById(marriedTypeId);
		verify(personDao).getEntityById(parentId);*/
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonList entity = new PersonList();
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
		
		PersonList entity = new PersonList();
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
		
		PersonList entity = new PersonList();
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
		
		PersonList entity = new PersonList();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
	