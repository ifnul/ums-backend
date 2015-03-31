package org.lnu.is.populator.edbo.person;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.resource.person.EdboPersonFindRequest;
import org.is.lnu.edbo.service.date.ActualDateService;
import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.session.Session;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.PersonsFind;

@RunWith(MockitoJUnitRunner.class)
public class PersonFindResourceConverterTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private ActualDateService actualDateService;
	
	@Mock
	private EdboLanguageService languageService;
	
	@InjectMocks
	private PersonFindResourceConverter unit;
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer idLanguage = 1;
		String actualDate = "actualDate";
		String sessionGUID = "Session GUID";
		String documentNumber = "Document Number";
		String documentSeries = "Series";
		String filters = "filters";
		String fioMask = "fio mask";
		String idsDocumentTypes = "ids document types";
		String personCodeU = "person code u";
		int hundred = 100;

		EdboPersonFindRequest source = new EdboPersonFindRequest();
		source.setDocumentNumber(documentNumber);
		source.setDocumentSeries(documentSeries);
		source.setFilters(filters);
		source.setFioMask(fioMask);
		source.setHundred(hundred);
		source.setIdsDocumentTypes(idsDocumentTypes);
		source.setPersonCodeU(personCodeU);
		
		PersonsFind expected = new PersonsFind();
		expected.setDocumentNumber(documentNumber);
		expected.setDocumentSeries(documentSeries);
		expected.setFilters(filters);
		expected.setFIOMask(fioMask);
		expected.setHundred(hundred);
		expected.setIdsDocumentTypes(idsDocumentTypes);
		expected.setPersonCodeU(personCodeU);
		expected.setSessionGUID(sessionGUID);
		expected.setActualDate(actualDate);
		expected.setIdLanguage(idLanguage);
		
		EdboAuthentification edboAuthentification = new EdboAuthentification();
		edboAuthentification.setSessionGUID(sessionGUID);
		Session session = new Session();
		session.setEdboAuthentification(edboAuthentification);
		
		// When
		when(sessionService.getSession()).thenReturn(session);
		when(actualDateService.getActualDate()).thenReturn(actualDate);
		when(languageService.getDefaultLanguage(any(EdboAuthentification.class))).thenReturn(idLanguage);
		unit.convert(source);

		// Then
		verify(sessionService).getSession();
		verify(actualDateService).getActualDate();
		verify(languageService).getDefaultLanguage(edboAuthentification);
	}
}
