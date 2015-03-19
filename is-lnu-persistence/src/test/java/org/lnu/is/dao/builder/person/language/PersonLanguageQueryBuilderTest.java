package org.lnu.is.dao.builder.person.language;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.domain.language.LanguageLevel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.language.PersonLanguage;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonLanguageQueryBuilderTest {

	private PersonLanguageQueryBuilder unit = new PersonLanguageQueryBuilder();

	private Boolean active = true;
	private Boolean security = true;

	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		PersonLanguage context = new PersonLanguage();

		String expectedQuery = "SELECT e FROM PersonLanguage e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);

		PersonLanguage context = new PersonLanguage();

		String expectedQuery = "SELECT e FROM PersonLanguage e WHERE e.status=:status ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);

		PersonLanguage context = new PersonLanguage();

		String expectedQuery = "SELECT e FROM PersonLanguage e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		PersonLanguage context = new PersonLanguage();

		String expectedQuery = "SELECT e FROM PersonLanguage e ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given

		Person person = new Person();
		Language language = new Language();
		LanguageLevel languageLevel = new LanguageLevel();

		PersonLanguage context = new PersonLanguage();
		context.setPerson(person);
		context.setLanguage(language);
		context.setLanguageLevel(languageLevel);

		String expectedQuery = "SELECT e FROM PersonLanguage e WHERE ( e.person = :person OR e.language = :language OR e.languageLevel = :languageLevel ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		Person person = new Person();
		Language language = new Language();
		LanguageLevel languageLevel = new LanguageLevel();

		PersonLanguage context = new PersonLanguage();
		context.setPerson(person);
		context.setLanguage(language);
		context.setLanguageLevel(languageLevel);

		String expectedQuery = "SELECT e FROM PersonLanguage e WHERE ( e.person = :person OR e.language = :language OR e.languageLevel = :languageLevel ) ";
		MultiplePagedSearch<PersonLanguage> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
