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
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<PersonType, Long> personTypeDao;
	
	@Mock
	private Dao<GenderType, Long> genderTypeDao;

	@Mock
	private Dao<MarriedType, Long> marrieTypeDao;

	@Mock
	private Dao<Person, Long> personDao;
	
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

		Person entity = new Person();
		entity.setPersonType(personType);
		entity.setGenderType(genderType);
		entity.setMarriedType(marriedType);
		entity.setParent(parent);
		
		entity.setName(name);
		entity.setFirstName(firstName);
		entity.setFatherName(fatherName);
		entity.setSurname(surname);
		entity.setPhoto(photo);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setIdentifier(identifier);
		entity.setResident(resident);
		entity.setBirthPlace(birthPlace);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		entity.setIsMilitary(isMilitary);
		entity.setIsHostel(isHostel);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("personType", personType);
		expected.put("genderType", genderType);
		expected.put("marriedType", marriedType);
		expected.put("parent", parent);
		expected.put("name", name);
		expected.put("firstName", firstName);
		expected.put("fatherName", fatherName);
		expected.put("surname", surname);
		expected.put("photo", photo);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("identifier", identifier);
		expected.put("resident", resident);
		expected.put("birthPlace", birthPlace);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("isMilitary", isMilitary);
		expected.put("isHostel", isHostel);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personTypeDao.getEntityById(anyLong())).thenReturn(personType);
		when(genderTypeDao.getEntityById(anyLong())).thenReturn(genderType);
		when(marrieTypeDao.getEntityById(anyLong())).thenReturn(marriedType);
		when(personDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personTypeDao).getEntityById(personTypeId);
		verify(genderTypeDao).getEntityById(genderTypeId);
		verify(marrieTypeDao).getEntityById(marriedTypeId);
		verify(personDao).getEntityById(parentId);
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
		
		Person entity = new Person();
		entity.setPersonType(personType);
		entity.setGenderType(genderType);
		entity.setMarriedType(marriedType);
		entity.setParent(parent);
		
		entity.setName(name);
		entity.setFirstName(firstName);
		entity.setFatherName(fatherName);
		entity.setSurname(surname);
		entity.setPhoto(photo);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setIdentifier(identifier);
		entity.setResident(resident);
		entity.setBirthPlace(birthPlace);
		entity.setBegDate(begDate);
		entity.setEndDate(endDate);
		entity.setIsMilitary(isMilitary);
		entity.setIsHostel(isHostel);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("personType", personType);
		expected.put("genderType", genderType);
		expected.put("marriedType", marriedType);
		expected.put("parent", parent);
		expected.put("name", name);
		expected.put("firstName", firstName);
		expected.put("fatherName", fatherName);
		expected.put("surname", surname);
		expected.put("photo", photo);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("identifier", identifier);
		expected.put("resident", resident);
		expected.put("birthPlace", birthPlace);
		expected.put("begDate", begDate);
		expected.put("endDate", endDate);
		expected.put("isMilitary", isMilitary);
		expected.put("isHostel", isHostel);
		
		// When
		when(personTypeDao.getEntityById(anyLong())).thenReturn(personType);
		when(genderTypeDao.getEntityById(anyLong())).thenReturn(genderType);
		when(marrieTypeDao.getEntityById(anyLong())).thenReturn(marriedType);
		when(personDao.getEntityById(anyLong())).thenReturn(parent);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personTypeDao).getEntityById(personTypeId);
		verify(genderTypeDao).getEntityById(genderTypeId);
		verify(marrieTypeDao).getEntityById(marriedTypeId);
		verify(personDao).getEntityById(parentId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Person entity = new Person();
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
		
		Person entity = new Person();
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
		
		Person entity = new Person();
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
		
		Person entity = new Person();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
