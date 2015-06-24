package org.lnu.is.extractor.person;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.admin.unit.AdminUnit;
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

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonParametersExtractorTest {

    @Mock
    private Dao<PersonType, PersonType, Long> personTypeDao;

    @Mock
    private Dao<GenderType, GenderType, Long> genderTypeDao;

    @Mock
    private Dao<MarriedType, MarriedType, Long> marrieTypeDao;

    @Mock
    private Dao<Person, Person, Long> personDao;

    @Mock
    private Dao<AdminUnit, AdminUnit, Long> adminUnitDao;

    @Mock
    private SessionService sessionService;

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
        PersonList entity = new PersonList();
        Map<String, Object> expected = new HashMap<>();
        expected.put("status", RowStatus.ACTIVE);
        expected.put("userGroups", groups);

        // When
        Map<String, Object> actual = unit.getParameters(entity);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testGetParametersWithAllFields() throws Exception {
        // Given
        Date begDate = new Date();
        Date endDate = new Date();

        PersonList entity = new PersonList();
        entity.setBegDate(begDate);
        entity.setEndDate(endDate);
        Map<String, Object> expected = new HashMap<>();
        expected.put("status", RowStatus.ACTIVE);
        expected.put("userGroups", groups);
        expected.put("begDate", begDate);
        expected.put("endDate", endDate);

        // When
        Map<String, Object> actual = unit.getParameters(entity);

        // Then
        assertEquals(expected, actual);
    }
}