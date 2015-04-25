package org.lnu.is.facade.facade.edbo.person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.is.lnu.edbo.service.person.EdboPersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.converter.Converter;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.service.Service;
import org.lnu.is.service.person.PersonEntrantService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonEntrantAdd;
import ua.edboservice.PersonEntrantAutoAdd;
import ua.edboservice.PersonsFind;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEdboPersonFacadeTest {

	@Mock
	private Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter;
	
	@Mock
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;

	@Mock
	private Converter<PersonEntrant, PersonEntrantAdd> personEntrantConverter;
	
	@Mock
	private Converter<PersonEntrantAuto, PersonEntrantAutoAdd> personEntrantAutoConverter;
	
	@Mock
	private Converter<ArrayOfDPersonAddRet, Person> entrantPersonConverter;
	
	@Mock
	private Converter<Person, PersonResource> personResourceConverter;
	
	@Mock
	private EdboPersonService service;
	
	@Mock
	private PersonEntrantService personEntrantService;
	
	@Mock
	private Service<Person, Person, Long> personService;
	
	@InjectMocks
	private DefaultEdboPersonFacade unit;
	
	@Test
	public void testFindPersons() throws Exception {
		// Given
		String documentNumber = "document number";
		EdboPersonFindRequest request = new EdboPersonFindRequest();
		request.setDocumentNumber(documentNumber);
		
		// When
		PersonsFind personsFind = new PersonsFind();
		personsFind.setDocumentNumber(documentNumber);
		ArrayOfDPersonsFind arrayOfDPersonFind = new ArrayOfDPersonsFind();

		String father = "father";
		EdboPersonResource resource1 = new EdboPersonResource();
		resource1.setFather(father);
		List<EdboPersonResource> expected = Arrays.asList(resource1);
		
		when(personFindResourceConverter.convert(any(EdboPersonFindRequest.class))).thenReturn(personsFind);
		when(service.findPerson(any(PersonsFind.class))).thenReturn(arrayOfDPersonFind);
		when(arrayOfDPersonFindResourceConverter.convert(any(ArrayOfDPersonsFind.class))).thenReturn(expected);
		List<EdboPersonResource> actual = unit.findPersons(request);

		// Then
		verify(personFindResourceConverter).convert(request);
		verify(service).findPerson(personsFind);
		verify(arrayOfDPersonFindResourceConverter).convert(arrayOfDPersonFind);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCreatePersonAuto() throws Exception {
		// Given
		Long entrantId = 1L;
		Boolean auto = true;
		PersonEntrantAuto personEntrantAuto = new PersonEntrantAuto();
		PersonEntrantAutoAdd personEntrantAutoAdd = new PersonEntrantAutoAdd();
		ArrayOfDPersonAddRet response = new ArrayOfDPersonAddRet();

		Person person = new Person();
		person.setId(entrantId);

		PersonResource expected = new PersonResource();
		expected.setId(entrantId);

		// When
		when(personEntrantService.getEntrantAuto(anyLong())).thenReturn(personEntrantAuto);
		when(personEntrantAutoConverter.convert(any(PersonEntrantAuto.class))).thenReturn(personEntrantAutoAdd);
		when(service.createApplicantAutomatically(any(PersonEntrantAutoAdd.class))).thenReturn(response);
		
		when(personService.getEntity(anyLong())).thenReturn(person);
		when(entrantPersonConverter.convert(any(ArrayOfDPersonAddRet.class))).thenReturn(person);
		when(personResourceConverter.convert(any(Person.class))).thenReturn(expected);
		
		PersonResource actual = unit.createPerson(entrantId, auto);

		// Then
		verify(personEntrantService).getEntrantAuto(entrantId);
		verify(personEntrantAutoConverter).convert(personEntrantAuto);
		verify(service).createApplicantAutomatically(personEntrantAutoAdd);
		verify(personService).getEntity(entrantId);
		verify(personService).updateEntity(person);
		verify(personResourceConverter).convert(person);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testCreatePersonManual() throws Exception {
		// Given
		Long entrantId = 1L;
		Boolean auto = false;
		PersonEntrant personEntrant = new PersonEntrant();
		PersonEntrantAdd personEntrantAdd = new PersonEntrantAdd();
		ArrayOfDPersonAddRet response = new ArrayOfDPersonAddRet();
		
		Person person = new Person();
		person.setId(entrantId);
		
		PersonResource expected = new PersonResource();
		expected.setId(entrantId);
		
		// When
		when(personEntrantService.getEntrant(anyLong())).thenReturn(personEntrant);
		when(personEntrantConverter.convert(any(PersonEntrant.class))).thenReturn(personEntrantAdd);
		when(service.createApplicantManually(any(PersonEntrantAdd.class))).thenReturn(response);
		
		when(personService.getEntity(anyLong())).thenReturn(person);
		when(entrantPersonConverter.convert(any(ArrayOfDPersonAddRet.class))).thenReturn(person);
		when(personResourceConverter.convert(any(Person.class))).thenReturn(expected);
		
		PersonResource actual = unit.createPerson(entrantId, auto);
		
		// Then
		verify(personEntrantService).getEntrant(entrantId);
		verify(personEntrantConverter).convert(personEntrant);
		verify(service).createApplicantManually(personEntrantAdd);
		verify(personService).getEntity(entrantId);
		verify(personService).updateEntity(person);
		verify(personResourceConverter).convert(person);
		
		assertEquals(expected, actual);
	}
}
