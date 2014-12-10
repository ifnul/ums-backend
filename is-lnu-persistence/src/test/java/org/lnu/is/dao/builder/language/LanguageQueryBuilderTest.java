package org.lnu.is.dao.builder.language;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.language.Language;

public class LanguageQueryBuilderTest {

	private LanguageQueryBuilder unit = new LanguageQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String abbrName = "LieToMe";
		String name = "name";
		
		Language context = new Language();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT l FROM Language l WHERE l.name LIKE CONCAT('%',:name,'%') OR l.abbrName LIKE CONCAT('%',:abbrName,'%') ";

		// When
		String actualQuery = unit.build(context);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
