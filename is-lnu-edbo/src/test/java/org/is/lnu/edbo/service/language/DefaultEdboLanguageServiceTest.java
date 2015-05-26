package org.is.lnu.edbo.service.language;

import static org.junit.Assert.assertEquals;

import org.is.lnu.edbo.model.authentification.EdboAuthentification;
import org.is.lnu.edbo.service.language.DefaultEdboLanguageService;
import org.junit.Test;

public class DefaultEdboLanguageServiceTest {

	private DefaultEdboLanguageService unit = new DefaultEdboLanguageService();
	
	@Test
	public void testGetDefaultLanguage() throws Exception {
		// Given
		EdboAuthentification authentification = new EdboAuthentification();

		Integer expected = 1;
		// When
		Integer actual = unit.getDefaultLanguage(authentification);

		// Then
		assertEquals(expected, actual);
	}
}
