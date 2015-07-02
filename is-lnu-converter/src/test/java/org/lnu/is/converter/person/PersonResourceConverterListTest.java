package org.lnu.is.converter.person;

import junit.framework.TestCase;
import org.junit.Test;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.person.PersonList;
import org.lnu.is.resource.person.PersonResourceList;

import java.util.Arrays;

/**
 * Created by ivanursul on 6/24/15.
 */
public class PersonResourceConverterListTest extends TestCase {

    private PersonResourceConverterList unit = new PersonResourceConverterList();

    @Test
    public void testConvert() throws Exception {
        // Given
        PersonResourceList source = new PersonResourceList();
        PersonList expected = new PersonList();

        // When
        PersonList actual = unit.convert(source);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testConvertWith() throws Exception {
        // Given
        Long parentId = 1L;
        Long personTypeId = 2L;
        Long marriedTypeId = 3L;
        Long genderTypeId = 4L;
        Long citizenCountryId = 5L;

        PersonResourceList source = new PersonResourceList();
        source.setPersonTypeId(Arrays.asList(personTypeId));
        source.setParentId(Arrays.asList(parentId));
        source.setMarriedTypeId(Arrays.asList(marriedTypeId));
        source.setCitizenCountryId(Arrays.asList(citizenCountryId));
        source.setGenderTypeId(Arrays.asList(genderTypeId));

        PersonList expected = new PersonList();

        expected.setPersonTypes(Arrays.asList(new PersonType(personTypeId)));
        expected.setParents(Arrays.asList(new Person(parentId)));
        expected.setMarriedTypes(Arrays.asList(new MarriedType(marriedTypeId)));
        expected.setCitizenCountries(Arrays.asList(new AdminUnit(citizenCountryId)));
        expected.setGenderTypes(Arrays.asList(new GenderType(genderTypeId)));


        // When
        PersonList actual = unit.convert(source);

        // Then
        assertEquals(expected, actual);
    }
}