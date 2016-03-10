package org.lnu.is.dao.builder.language;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.language.Language;
import org.lnu.is.pagination.MultiplePagedSearch;

public class LanguageQueryBuilderTest {

	private LanguageQueryBuilder unit = new LanguageQueryBuilder();

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
		Language context = new Language();

		String expectedQuery = "SELECT e FROM Language e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
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

		Language context = new Language();

		String expectedQuery = "SELECT e FROM Language e WHERE e.status=:status ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
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

		Language context = new Language();

		String expectedQuery = "SELECT e FROM Language e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		Language context = new Language();

		String expectedQuery = "SELECT e FROM Language e ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "LieToMe";
		String name = "name";

		Language context = new Language();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM Language e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);

		// When
		String actualQuery = unit.build(pagedSearch);
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);

		String abbrName = "LieToMe";
		String name = "name";

		Language context = new Language();
		context.setAbbrName(abbrName);
		context.setName(name);

		String expectedQuery = "SELECT e FROM Language e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<Language> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
