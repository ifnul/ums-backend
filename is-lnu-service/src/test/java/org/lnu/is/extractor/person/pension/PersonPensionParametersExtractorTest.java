package org.lnu.is.extractor.person.pension;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.times;
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
import org.lnu.is.domain.pension.type.PensionType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.pension.PersonPension;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PersonPensionParametersExtractorTest {

	@Mock
	private Dao<Person, Long> personDao;

	@Mock
	private Dao<PensionType, Long> contactTypeDao;

	@InjectMocks
	private PersonPensionParametersExtractor unit;

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

		Long contactTypeId = 2L;
		PensionType contactType = new PensionType();
		contactType.setId(contactTypeId);

		PersonPension entity = new PersonPension();
		entity.setPerson(person);
		entity.setPensionType(contactType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		expected.put("person", person);
		expected.put("pensionType", contactType);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(contactTypeDao.getEntityById(anyLong())).thenReturn(contactType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(contactTypeDao).getEntityById(contactTypeId);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFields() throws Exception {
		// Given
		PersonPension entity = new PersonPension();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(contactTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParametersWithEmptyFieldsAndWithoutDefaults()
			throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		PersonPension entity = new PersonPension();
		Map<String, Object> expected = new HashMap<String, Object>();

		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao, times(0)).getEntityById(anyLong());
		verify(contactTypeDao, times(0)).getEntityById(anyLong());
		assertEquals(expected, actual);
	}

	@Test
	public void testGetParamteresWithoutSecurity() throws Exception {
		// Given
		unit.setSecurity(false);

		Long personId = 1L;
		Person person = new Person();
		person.setId(personId);

		Long contactTypeId = 2L;
		PensionType contactType = new PensionType();
		contactType.setId(contactTypeId);


		PersonPension entity = new PersonPension();
		entity.setPerson(person);
		entity.setPensionType(contactType);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("person", person);
		expected.put("pensionType", contactType);

		// When
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(contactTypeDao.getEntityById(anyLong())).thenReturn(contactType);
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		verify(personDao).getEntityById(personId);
		verify(contactTypeDao).getEntityById(contactTypeId);
		verify(sessionService, times(0)).getGroups();
		assertEquals(expected.toString(), actual.toString());
	}
}
