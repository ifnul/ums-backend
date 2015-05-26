package org.lnu.is.converter.person.entrant;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.lnu.is.domain.session.Session;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.PersonEntrantAutoAdd;

@RunWith(MockitoJUnitRunner.class)
public class PersonEntrantAutoConverterTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private EdboLanguageService languageService;
	
	@InjectMocks
	private PersonEntrantAutoConverter unit;
	
	@Test
	public void testConvert() throws Exception {
		// Given
		int allowProcessedPersonalData = 1;
		String attestatNumber = "attestat number";
		
		PersonEntrantAuto source = new PersonEntrantAuto();
		source.setAllowProcessedPersonalData(allowProcessedPersonalData);
		source.setAttestatNumber(attestatNumber);
		
		String sessionGUID = "session GUID";
		EdboAuthentification edboAuthentification = new EdboAuthentification();
		edboAuthentification.setSessionGUID(sessionGUID);
		Session session = new Session();
		session.setEdboAuthentification(edboAuthentification);
		Integer idLanguage = 1;
		
		// When
		when(sessionService.getSession()).thenReturn(session);
		when(languageService.getDefaultLanguage(any(EdboAuthentification.class))).thenReturn(idLanguage);
		
		PersonEntrantAutoAdd actual = unit.convert(source);

		// Then
		verify(sessionService).getSession();
		verify(languageService).getDefaultLanguage(edboAuthentification);
		
		
		assertEquals(allowProcessedPersonalData, actual.getAllowProcessedPersonalData());
		assertEquals(attestatNumber, actual.getAttestatNumber());
	}
}
