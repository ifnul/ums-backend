package org.lnu.is.extractor.enrolment.benefit;

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
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnrolmentBenefitParametersExtractorTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private Dao<Benefit, Benefit, Long> benefitDao;

	@Mock
	private Dao<PersonPaper, PersonPaper, Long> personPaperDao;

	@Mock
	private Dao<Enrolment, Enrolment, Long> enrolmentDao;

	@InjectMocks
	private EnrolmentBenefitParametersExtractor unit;

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
		Long personPaperId = 1L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		Long enrolmentId = 3L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		EnrolmentBenefit entity = new EnrolmentBenefit();
		entity.setPersonPaper(personPaper);
		entity.setBenefit(benefit);
		entity.setEnrolment(enrolment);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("enrolment", enrolment);
		expected.put("benefit", benefit);
		expected.put("personPaper", personPaper);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
		when(benefitDao.getEntityById(anyLong())).thenReturn(benefit);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentDao).getEntityById(enrolmentId);
		verify(benefitDao).getEntityById(benefitId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long personPaperId = 1L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long benefitId = 2L;
		Benefit benefit = new Benefit();
		benefit.setId(benefitId);
		
		Long enrolmentId = 3L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		EnrolmentBenefit entity = new EnrolmentBenefit();
		entity.setPersonPaper(personPaper);
		entity.setBenefit(benefit);
		entity.setEnrolment(enrolment);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("enrolment", enrolment);
		expected.put("benefit", benefit);
		expected.put("personPaper", personPaper);
		
		// When
		when(personPaperDao.getEntityById(anyLong())).thenReturn(personPaper);
		when(enrolmentDao.getEntityById(anyLong())).thenReturn(enrolment);
		when(benefitDao.getEntityById(anyLong())).thenReturn(benefit);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personPaperDao).getEntityById(personPaperId);
		verify(enrolmentDao).getEntityById(enrolmentId);
		verify(benefitDao).getEntityById(benefitId);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		EnrolmentBenefit entity = new EnrolmentBenefit();
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
		
		EnrolmentBenefit entity = new EnrolmentBenefit();
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
		EnrolmentBenefit entity = new EnrolmentBenefit();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDEfaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		EnrolmentBenefit entity = new EnrolmentBenefit();
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}

