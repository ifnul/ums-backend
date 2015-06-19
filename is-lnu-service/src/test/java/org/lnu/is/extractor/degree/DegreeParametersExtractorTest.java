package org.lnu.is.extractor.degree;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
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
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DegreeParametersExtractorTest {

	@Mock
	private Dao<DegreeType, DegreeType, Long> degreeTypeDao;
	
	@Mock
	private Dao<Person, Person, Long> personDao;
	
	@InjectMocks
	private DegreeParametersExtractor unit;

	@Mock
	private SessionService sessionService;

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

		Long degreeTypeId = 2L;
		DegreeType degreeType = new DegreeType();
		degreeType.setId(degreeTypeId);
		
		Degree entity = new Degree();
		entity.setPerson(person);
		entity.setDegreeType(degreeType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("person", person);
		expected.put("degreeType", degreeType);
		
		// When
		when(degreeTypeDao.getEntityById(anyLong())).thenReturn(degreeType);
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(degreeTypeDao).getEntityById(degreeTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDEfaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);

		Long degreeTypeId = 2L;
		DegreeType degreeType = new DegreeType();
		degreeType.setId(degreeTypeId);
		
		Degree entity = new Degree();
		entity.setPerson(person);
		entity.setDegreeType(degreeType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("degreeType", degreeType);
		
		// When
		when(degreeTypeDao.getEntityById(anyLong())).thenReturn(degreeType);
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personDao).getEntityById(personId);
		verify(degreeTypeDao).getEntityById(degreeTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Degree entity = new Degree();
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
		
		Degree entity = new Degree();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		Degree entity = new Degree();
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
		
		Degree entity = new Degree();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
