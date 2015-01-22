package org.lnu.is.extractor.person.paper;

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
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonPaperParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<Person, Long> personDao;
	
	@Mock
	private Dao<PaperType, Long> paperTypeDao;
	
	@Mock
	private Dao<HonorType, Long> honorTypeDao;
	
	@InjectMocks
	private PersonPaperParametersExtractor unit;

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
		String docSeries = "doc series";
		String docNum = "doc nu";
		Date docDate = new Date();
		String docIssued = "doc issued";
		String docPin = "doc pin";
		Double mark = 2.5;
		Integer isChecked = 1;
		Integer isForeign = 2;

		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long paperTypeId = 2L;
		PaperType paperType = new PaperType();
		paperType.setId(paperTypeId);
		
		Long honorTypeId = 4L;
		HonorType honorsType = new HonorType();
		honorsType.setId(honorTypeId);

		PersonPaper entity = new PersonPaper();
		entity.setPerson(person);
		entity.setPaperType(paperType);
		entity.setHonorsType(honorsType);
		
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocDate(docDate);
		entity.setDocIssued(docIssued);
		entity.setDocPin(docPin);
		entity.setMark(mark);
		entity.setIsChecked(isChecked);
		entity.setIsForeign(isForeign);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("paperType", paperType);
		expected.put("honorsType", honorsType);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docDate", docDate);
		expected.put("docIssued", docIssued);
		expected.put("docPin", docPin);
		expected.put("mark", mark);
		expected.put("isChecked", isChecked);
		expected.put("isForeign", isForeign);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(paperTypeDao.getEntityById(anyLong())).thenReturn(paperType);
		when(honorTypeDao.getEntityById(anyLong())).thenReturn(honorsType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(paperTypeDao).getEntityById(paperTypeId);
		verify(honorTypeDao).getEntityById(honorTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String docSeries = "doc series";
		String docNum = "doc nu";
		Date docDate = new Date();
		String docIssued = "doc issued";
		String docPin = "doc pin";
		Double mark = 2.5;
		Integer isChecked = 1;
		Integer isForeign = 2;
		
		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);
		
		Long paperTypeId = 2L;
		PaperType paperType = new PaperType();
		paperType.setId(paperTypeId);
		
		Long honorTypeId = 4L;
		HonorType honorsType = new HonorType();
		honorsType.setId(honorTypeId);
		
		PersonPaper entity = new PersonPaper();
		entity.setPerson(person);
		entity.setPaperType(paperType);
		entity.setHonorsType(honorsType);
		
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setDocDate(docDate);
		entity.setDocIssued(docIssued);
		entity.setDocPin(docPin);
		entity.setMark(mark);
		entity.setIsChecked(isChecked);
		entity.setIsForeign(isForeign);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("person", person);
		expected.put("paperType", paperType);
		expected.put("honorsType", honorsType);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("docDate", docDate);
		expected.put("docIssued", docIssued);
		expected.put("docPin", docPin);
		expected.put("mark", mark);
		expected.put("isChecked", isChecked);
		expected.put("isForeign", isForeign);
		
		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(paperTypeDao.getEntityById(anyLong())).thenReturn(paperType);
		when(honorTypeDao.getEntityById(anyLong())).thenReturn(honorsType);
		
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		verify(personDao).getEntityById(personId);
		verify(paperTypeDao).getEntityById(paperTypeId);
		verify(honorTypeDao).getEntityById(honorTypeId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		PersonPaper entity = new PersonPaper();
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
		
		PersonPaper entity = new PersonPaper();
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
		
		PersonPaper entity = new PersonPaper();
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
		
		PersonPaper entity = new PersonPaper();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
