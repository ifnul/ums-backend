package org.lnu.is.converter.person;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonType;
import org.lnu.is.resource.person.PersonResource;

public class PersonConverterTest {

	private PersonConverter unit = new PersonConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Date begDate = new Date();
		String birthPlace = "fsd";
		String docNum = "gfdsf";
		String docSeries = "fdafdsfs";
		Date endDate = new Date();
		String fatherName = " fdsfsdfsd";
		String firstName = " gfdsgsd";
		Long id = 1L;
		String identifier = "fdsfds";
		Integer isHostel = 1;
		Integer isMilitary = 0;
		String name = "fdsfds";
		String photo = "fdsdfsdfsd";
		Integer resident = 1;
		String surname = "fdfds";
		
		Long personTypeId = 2L; 
		PersonType personType = new PersonType();
		personType.setId(personTypeId);

		Long marriedTypeId = 4L;
		MarriedType marriedType = new MarriedType();
		marriedType.setId(marriedTypeId);
		
		Long parentId = 5L;
		Person parent = new Person();
		parent.setId(parentId);
		
		Long citizenCountryId = 6L;
		AdminUnit citizenCountry = new AdminUnit();
		citizenCountry.setId(citizenCountryId);
		
		Long genderTypeId = 7L;
		GenderType genderType = new GenderType();
		genderType.setId(genderTypeId);

		Person source = new Person();
		source.setBegDate(begDate);
		source.setBirthPlace(birthPlace);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEndDate(endDate);
		source.setFatherName(fatherName);
		source.setFirstName(firstName);
		source.setId(id);
		source.setIdentifier(identifier);
		source.setIsHostel(isHostel);
		source.setIsMilitary(isMilitary);
		source.setName(name);
		source.setPhoto(photo);
		source.setResident(resident);
		source.setSurname(surname);
		source.setPersonType(personType);
		source.setGenderType(genderType);
		source.setMarriedType(marriedType);
		source.setParent(parent);
		source.setCitizenCountry(citizenCountry);
		
		PersonResource expected = new PersonResource();
		expected.setBegDate(begDate);
		expected.setBirthPlace(birthPlace);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEndDate(endDate);
		expected.setFatherName(fatherName);
		expected.setFirstName(firstName);
		expected.setId(id);
		expected.setIdentifier(identifier);
		expected.setIsHostel(isHostel);
		expected.setIsMilitary(isMilitary);
		expected.setName(name);
		expected.setPhoto(photo);
		expected.setResident(resident);
		expected.setSurname(surname);
		expected.setPersonTypeId(personTypeId);
		expected.setGenderTypeId(genderTypeId);
		expected.setMarriedTypeId(marriedTypeId);
		expected.setParentId(parentId);
		expected.setCitizenCountryId(citizenCountryId);
		
		// When
		PersonResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Date begDate = new Date();
		String birthPlace = "fsd";
		String docNum = "gfdsf";
		String docSeries = "fdafdsfs";
		Date endDate = new Date();
		String fatherName = " fdsfsdfsd";
		String firstName = " gfdsgsd";
		Long id = 1L;
		String identifier = "fdsfds";
		Integer isHostel = 1;
		Integer isMilitary = 0;
		String name = "fdsfds";
		String photo = "fdsdfsdfsd";
		Integer resident = 1;
		String surname = "fdfds";
		
		Person source = new Person();
		source.setBegDate(begDate);
		source.setBirthPlace(birthPlace);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEndDate(endDate);
		source.setFatherName(fatherName);
		source.setFirstName(firstName);
		source.setId(id);
		source.setIdentifier(identifier);
		source.setIsHostel(isHostel);
		source.setIsMilitary(isMilitary);
		source.setName(name);
		source.setPhoto(photo);
		source.setResident(resident);
		source.setSurname(surname);
		
		PersonResource expected = new PersonResource();
		expected.setBegDate(begDate);
		expected.setBirthPlace(birthPlace);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEndDate(endDate);
		expected.setFatherName(fatherName);
		expected.setFirstName(firstName);
		expected.setId(id);
		expected.setIdentifier(identifier);
		expected.setIsHostel(isHostel);
		expected.setIsMilitary(isMilitary);
		expected.setName(name);
		expected.setPhoto(photo);
		expected.setResident(resident);
		expected.setSurname(surname);
		
		// When
		PersonResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
