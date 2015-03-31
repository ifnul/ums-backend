package org.lnu.is.facade.facade.edbo.person;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
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
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.PersonsFind;

@RunWith(MockitoJUnitRunner.class)
public class DefaultEdboPersonFacadeTest {

	@Mock
	private Converter<EdboPersonFindRequest, PersonsFind> personFindResourceConverter;
	
	@Mock
	private Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> arrayOfDPersonFindResourceConverter;
	
	@Mock
	private EdboPersonService service;
	
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
}
