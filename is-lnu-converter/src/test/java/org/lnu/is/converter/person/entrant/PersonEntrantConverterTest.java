package org.lnu.is.converter.person.entrant;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.language.EdboLanguageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.session.Session;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import ua.edboservice.PersonEntrantAdd;

@RunWith(MockitoJUnitRunner.class)
public class PersonEntrantConverterTest {

	@Mock
	private SessionService sessionService;
	
	@Mock
	private EdboLanguageService languageService;
	
	@InjectMocks
	private PersonEntrantConverter unit;
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer idCountry = 1;
		Integer allowProcessedPersonalData = 1;
		PersonEntrant source = new PersonEntrant();
		source.setAllowProcessedPersonalData(allowProcessedPersonalData);
		source.setIdCountry(idCountry);
		
		String sessionGUID = "session GUID";
		EdboAuthentification edboAuthentification = new EdboAuthentification();
		edboAuthentification.setSessionGUID(sessionGUID);
		Session session = new Session();
		session.setEdboAuthentification(edboAuthentification);
		Integer idLanguage = 1;
		
		PersonEntrantAdd expected = new PersonEntrantAdd();
		expected.setAllowProcessedPersonalData(allowProcessedPersonalData);
		expected.setSessionGUID(sessionGUID);
		expected.setIdLanguage(idLanguage);
		expected.setIdCountry(idCountry);
		
		// When
		when(sessionService.getSession()).thenReturn(session);
		when(languageService.getDefaultLanguage(any(EdboAuthentification.class))).thenReturn(idLanguage);
		
		PersonEntrantAdd actual = unit.convert(source);

		// Then
		verify(sessionService).getSession();
		verify(languageService).getDefaultLanguage(edboAuthentification);
		
		assertEquals(expected.getAllowProcessedPersonalData(), actual.getAllowProcessedPersonalData());
		assertEquals(expected.getIdCountry(), actual.getIdCountry());
	}
}
